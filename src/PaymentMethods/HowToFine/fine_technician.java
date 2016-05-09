package PaymentMethods.HowToFine;

import java.lang.Math;

/**
 * Created by Tnecesoc on 2016/5/7.
 */
public class fine_technician implements fine_protocol {
    @Override
    public double getFine(int contribution, int level) {
        return Const.BASE * Math.pow(level,2) / Math.exp(Math.log10(contribution));
    }
}
