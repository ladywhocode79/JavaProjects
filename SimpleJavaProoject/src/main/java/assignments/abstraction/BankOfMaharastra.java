package assignments.abstraction;

import java.util.ArrayList;
import java.util.List;

public class BankOfMaharastra extends Bank{
    String bankName;

    //Default Constructor
    BankOfMaharastra(){
        this.bankName = "Bank of Maharashtra";
    }
    //implementation of abstract method from Bank class
    public List<Integer> getDenomination() {
        return denomination;
    }
}
