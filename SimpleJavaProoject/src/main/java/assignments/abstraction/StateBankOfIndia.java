package assignments.abstraction;

import java.util.List;

public class StateBankOfIndia extends Bank{
    String bankName;
    //Default constructor
    StateBankOfIndia(){
        this.bankName ="State Bank Of India";
    }
    //implementation of abstract method from Bank class
    public List<Integer> getDenomination() {
        return denomination;
    }
}
