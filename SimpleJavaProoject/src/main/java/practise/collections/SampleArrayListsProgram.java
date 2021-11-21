package practise.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayListsProgram {
    public static void main(String[] args) {
        //create array lists
        ArrayList<String> namesLists = new ArrayList<String>();
        //add objects to the lists
        namesLists.add("sonal");
        namesLists.add("arnav");
        namesLists.add("shubham");
        namesLists.add("ashutosh");
        namesLists.add("rahuul");
        namesLists.add("chhaya");
        namesLists.add("vijay");
        namesLists.add("chotu");
        //Traversing list through Iterator
        Iterator itr = namesLists.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
