package strategy.ticket.discount;

public class StudentDiscount extends Discount {
    @Override
    public double calculate(double price) {
        return price * 0.6;
    }
}
