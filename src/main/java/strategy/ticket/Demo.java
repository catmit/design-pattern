package strategy.ticket;

import strategy.ticket.people.Child;
import strategy.ticket.people.Person;
import strategy.ticket.people.Student;
import strategy.ticket.people.VIP;

public class Demo {

    public static void main(String[] args) {
        start();
    }

    static void start(){
        TicketShop ticketShop = new TicketShop();
        Student student = new Student();
        VIP vip = new VIP();
        Child child = new Child();
        Person person = new Person(Person.NORMAL);

        ticketShop.sell(student);
        ticketShop.sell(child);
        ticketShop.sell(vip);
        ticketShop.sell(person);
    }
}
