package strategy.ticket;

import strategy.ticket.discount.Discount;

public class MovieTicket {
    private double price;
    private Discount discount;
    private String type;

    public MovieTicket(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        if(discount != null) return discount.calculate(price);
        return price;
    }
}
