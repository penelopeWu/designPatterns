package strategy.eg;

/**
 * Created by penelope on 2017/8/7.
 */
public class MovieTicket {
    private double price;
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }
}
