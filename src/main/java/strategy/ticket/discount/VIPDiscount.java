package strategy.ticket.discount;

public class VIPDiscount extends Discount {
    @Override
    public double calculate(double price) {
        return price*0.1;
    }
}
