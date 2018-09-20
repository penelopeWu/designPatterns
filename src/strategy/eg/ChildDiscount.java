package strategy.eg;

/**
 * Created by penelope on 2017/8/7.
 */
public class ChildDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        return price - 10;
    }
}
