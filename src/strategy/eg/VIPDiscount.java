package strategy.eg;

/**
 * Created by penelope on 2017/8/7.
 */
public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("VIP票");
        return price * 0.5;
    }
}
