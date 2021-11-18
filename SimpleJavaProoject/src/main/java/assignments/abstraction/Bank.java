package assignments.abstraction;
/*For the abstraction , create a abstract class and have multiple abstract methods
 (Which would be the bank names) . Extend the abstract class to 3 different
classes and implement the abstract methods in the respective classes*/
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

