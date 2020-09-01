package strategy.ticket;

import strategy.ticket.discount.ChildDiscount;
import strategy.ticket.discount.Discount;
import strategy.ticket.discount.StudentDiscount;
import strategy.ticket.discount.VIPDiscount;
import strategy.ticket.people.Person;

import java.util.concurrent.ConcurrentHashMap;

public class TicketShop {
    public static final ConcurrentHashMap<Integer, Discount> map = new ConcurrentHashMap<>();
    static {
        map.put(Person.CHILD, new ChildDiscount());
        map.put(Person.STUDENT, new StudentDiscount());
        map.put(Person.VIP, new VIPDiscount());
    }

    void sell(Person person){
        MovieTicket ticket = new MovieTicket(100);
        if (person.getType() != Person.NORMAL){
            ticket.setDiscount(map.get(person.getType()));
        }
        person.buyMovieTicket(ticket);
    }
}
