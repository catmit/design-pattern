package strategy.ticket.people;

import strategy.ticket.MovieTicket;

public class Person {
    public static final int CHILD = 1;
    public static final int STUDENT = 2;
    public static final int VIP = 3;
    public static final int NORMAL = 4;

    public int type;
    private String role;

    public Person(int type) {
        this.type = type;
        setRole("normal");
    }


    public void buyMovieTicket(MovieTicket ticket){
        if (role == null) {
            role = "normal";
        }
        System.out.println("I( " + role +" ) buy a ticket" + "  should pay: " + ticket.getPrice());
    }

    public int getType() {
        return type;
    }

    protected void setRole(String role) {
        this.role = role;
    }
}
