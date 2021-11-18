package assignments.abstraction;

import java.util.ArrayList;
import java.util.List;

public class BankOfBaroda extends Bank{
    protected List<Integer> denomination = new ArrayList<>();
    BankOfBaroda(){
        denomination.add(100);
        denomination.add(1000);
        denomination.add(500);
    }

    //implementation of abstract method from Bank class
    public List<Integer> getDenomination() {
        System.out.println("Denomination list for Bank of Baroda is as follows ");
        return denomination;
    }
}




