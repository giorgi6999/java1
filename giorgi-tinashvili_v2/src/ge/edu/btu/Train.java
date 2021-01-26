package ge.edu.btu;

import java.util.List;

public class Train {
    List<Passanger> passangerList;
    public List<Passanger> getPassengerList() {
        Passanger passenger=new Passanger("Gio",true);
        passangerList.add(passenger);
        return passangerList;
    }

    public void addPassanger(Passanger passanger){
        if(passanger.haveTicket()) System.out.println("Yes");
        else System.out.println("No");
    }
}
