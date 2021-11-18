package assignments.abstraction;

import java.util.ArrayList;
import java.util.List;

public class ListsOfBanks {
    public static void main(String[] args) {

        BankOfBaroda bof = new BankOfBaroda();
        List<Integer> bofDenominationList = bof.getDenomination();
        printDenominatioList(bofDenominationList);

        BankOfMaharashtra bom = new BankOfMaharashtra();
        List<Integer> bomDenominationList = bom.getDenomination();
        printDenominatioList(bomDenominationList);

        StateBankOfIndia sbi = new StateBankOfIndia();
        List<Integer> sbiDenominationList = sbi.getDenomination();
        printDenominatioList(sbiDenominationList);


    }

    //print denomination lists
    static void printDenominatioList( List<Integer> denominationLists){
        for(int i=0;i<denominationLists.size();i++) {
            System.out.println(+denominationLists.get(i));
        }
    }
}

