package strategy.eg;

/**
 * Created by penelope on 2017/8/7.
 */
public class Client {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        double originPrice = 60.0;
        double currentPrice;

        ticket.setPrice(originPrice);
        System.out.println("原始价格为：" + originPrice);

        Discount discount = new StudentDiscount();
        ticket.setDiscount(discount);
        ticket.setPrice(discount.calculate(originPrice));

        currentPrice = ticket.getPrice();
        System.out.println("现价：" + currentPrice);
    }
}
