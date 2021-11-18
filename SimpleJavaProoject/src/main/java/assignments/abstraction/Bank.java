package assignments.abstraction;

import java.util.ArrayList;
import java.util.List;

public abstract class Bank {
    protected List<Integer> denomination = new ArrayList<>();
    public void addDenomination(int value) {

        denomination.add(value);

    }
    //abstract method
    public abstract List<Integer> getDenomination();
}
