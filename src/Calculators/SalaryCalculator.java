package Calculators;
/**
 * Created by Tnecesoc on 2016/5/7.
 */

import HumanResource.Employee;
import HumanResource.HumanResourceDepartment;
import PaymentMethods.HowToAward.award_protocol;

public class SalaryCalculator implements PaymentCalculator<Integer> {
    @Override
    public Integer getPayAmount(Employee who) {

        if(who == null)
            return 0;

        Integer value = getPayAmount(HumanResourceDepartment.getSubTitleOf(who));

        award_protocol ans = null;

        try {
            ans = (award_protocol)
                    Class.forName(
                            award_protocol.class.getPackage().toString().substring("Package ".length())
                                    + ".award_"
                                    + who.getClass().getSimpleName().toLowerCase()
                                    + "_level"
                                    + HumanResourceDepartment.giveInfo(who).level
                    ).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("The method for this situation is not found");
            return 0;
        }

        Employee it = who;

        return value + ans.getAward(HumanResourceDepartment.giveInfo(who).contribution);
    }
}
