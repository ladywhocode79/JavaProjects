package assignments.abstraction;

import java.util.ArrayList;
import java.util.List;

public class StateBankOfIndia extends Bank{
    protected List<Integer> denomination = new ArrayList<>();
    StateBankOfIndia(){
        denomination.add(100);
        denomination.add(50);
        denomination.add(500);
    }

    //implementation of abstract method from Bank class
    public List<Integer> getDenomination() {
        System.out.println("Denomination list for State Bank of India is as follows ");
        return denomination;
    }
}




