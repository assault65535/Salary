
import Calculators.FineCalculator;
import Calculators.PaymentCalculator;
import Calculators.SalaryCalculator;
import HumanResource.*;

public class FinancialDepartment {

    public static void main(String[] args) {

        Manager alice = HumanResourceDepartment.hire(Manager.class,"Alice","Manager_Alice");
        Boss bob = HumanResourceDepartment.hire(Boss.class,"Bob","Boss_Bob");

        HumanResourceDepartment.giveNewTitle(bob,Manager.class);
        HumanResourceDepartment.giveNewTitle(bob,Technician.class);

        HumanResourceDepartment.promoteTo(alice,2);
        HumanResourceDepartment.giveNewTitle(alice,Technician.class);

        PaymentCalculator Calculator = new SalaryCalculator();

        System.out.println("Salary for " + alice.name + " : " + Calculator.getPayAmount(alice));
        System.out.println("Salary for " + bob.name + " : " + Calculator.getPayAmount(bob));

        Calculator = new FineCalculator();

        System.out.println("Fine for " + HumanResourceDepartment.giveTitleInfo(alice) + " " + alice.name + " : " + Calculator.getPayAmount(alice));
        System.out.println("Fine for " + HumanResourceDepartment.giveTitleInfo(bob) + bob.name + " : " + Calculator.getPayAmount(bob));
    }
}

