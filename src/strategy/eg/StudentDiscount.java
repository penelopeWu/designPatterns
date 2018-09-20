package strategy.eg;

/**
 * Created by penelope on 2017/8/7.
 */
public class StudentDiscount implements Discount{
    @Override
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}
