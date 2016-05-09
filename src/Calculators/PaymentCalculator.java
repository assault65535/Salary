package Calculators;

import HumanResource.Employee;

/**
 * Created by Tnecesoc on 2016/5/7.
 */
public interface PaymentCalculator <T> {
    T getPayAmount(Employee who);
}
