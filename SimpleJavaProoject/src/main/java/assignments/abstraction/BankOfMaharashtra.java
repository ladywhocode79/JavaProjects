package assignments.abstraction;

import java.util.ArrayList;
import java.util.List;

public class BankOfMaharashtra extends Bank{
    protected List<Integer> denomination = new ArrayList<>();
    BankOfMaharashtra(){
        denomination.add(10);
        denomination.add(20);
        denomination.add(100);
    }
    //implementation of abstract method from Bank class
    public List<Integer> getDenomination() {
        System.out.println("Denomination list for Bank of Maharashtra is as follows ");
        return denomination;
    }
}




