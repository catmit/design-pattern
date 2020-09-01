package strategy.ticket.discount;

public class ChildDiscount extends Discount {
    @Override
    public double calculate(double price) {
        return price*0.5;
    }
}
