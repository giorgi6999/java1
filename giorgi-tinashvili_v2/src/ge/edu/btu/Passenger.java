package ge.edu.btu;

public class Passanger {
    String name;
    Boolean ticket;

    public String getName() {
        return name;
    }

    public Boolean haveTicket() {
        return ticket;
    }

    public Passanger(String name, Boolean ticket) {
        this.name = name;
        this.ticket = ticket;
    }
}