package Calculators;

import HumanResource.Employee;
import HumanResource.HumanResourceDepartment;
import PaymentMethods.HowToFine.fine_protocol;

/**
 * Created by Tnecesoc on 2016/5/7.
 */
public class FineCalculator implements PaymentCalculator<Double> {
    @Override
    public Double getPayAmount(Employee who) {

        if(who == null)
            return 0.0d;

        Double value = getPayAmount(HumanResourceDepartment.getSubTitleOf(who));

        fine_protocol ans = null;

        try {
            ans = (fine_protocol) Class.forName(
                    fine_protocol.class.getPackage().toString().substring("Package ".length())
                    + ".fine_"
                    + who.getClass().getSimpleName().toLowerCase()
            ).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("The method for this situation is not found");
            return 0.0d;
        }


        return value + ans.getFine(HumanResourceDepartment.giveInfo(who).contribution, HumanResourceDepartment.giveInfo(who).level);
    }
}
