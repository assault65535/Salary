package PaymentMethods.HowToAward;

/**
 * Created by Tnecesoc on 2016/5/7.
 */
public class award_manager_level1 implements award_protocol {
    @Override
    public int getAward(int contribution) {
        return (contribution-100)*5;
    }
}
