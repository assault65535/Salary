package PaymentMethods.HowToAward;

/**
 * Created by Tnecesoc on 2016/5/7.
 */
public class award_technician_level2 implements award_protocol {
    @Override
    public int getAward(int contribution) {
        return contribution*25;
    }
}
