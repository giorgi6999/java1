package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passanger gio=new Passanger("Gio",true);
        Passanger nika=new Passanger("Nika",false);
        Passanger ana=new Passanger("Ana",true);

        Train train=new Train();

        train.addPassanger(gio);
        train.addPassanger(nika);
        train.addPassanger(ana);
    }
}