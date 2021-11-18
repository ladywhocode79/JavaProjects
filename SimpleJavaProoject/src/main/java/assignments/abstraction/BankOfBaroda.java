package assignments.abstraction;

import java.util.ArrayList;
import java.util.List;

public class BankOfBaroda extends Bank{

    String bankName;
    BankOfBaroda(){
        this.bankName = "Bank of Baroda";
    }
    //implementation of abstract method from Bank class
    public List<Integer> getDenomination() {
        return denomination;
    }
}
