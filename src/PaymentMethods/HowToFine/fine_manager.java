package PaymentMethods.HowToFine;

/**
 * Created by Tnecesoc on 2016/5/7.
 */
public class fine_manager implements fine_protocol {
    @Override
    public double getFine(int contribution,int level) {
        return Const.BASE * Math.pow(level,2.0d)/(double) contribution;
    }
}
