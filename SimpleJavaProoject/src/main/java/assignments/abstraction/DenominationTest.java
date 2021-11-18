package assignments.abstraction;

import java.util.ArrayList;
import java.util.List;

public class DenominationTest {
    public static void main(String[] args) {
        BankOfBaroda bof = new BankOfBaroda();
        bof.addDenomination(10);
        bof.addDenomination(20);
        bof.addDenomination(200);
        List<Integer> bofDenomationList = bof.getDenomination();
        printDenominatioList(bofDenomationList, bof.bankName);

        BankOfMaharastra bom = new BankOfMaharastra();
        bom.addDenomination(50);
        bom.addDenomination(100);
        bom.addDenomination(2000);
        List<Integer> bomDenomationList = bom.getDenomination();
        printDenominatioList(bomDenomationList, bom.bankName);

        StateBankOfIndia sbi = new StateBankOfIndia();
        sbi.addDenomination(50);
        sbi.addDenomination(100);
        sbi.addDenomination(2000);
        List<Integer> sbiDenomationList = sbi.getDenomination();
        printDenominatioList(sbiDenomationList, sbi.bankName);


    }
    static void printDenominatioList( List<Integer> denominationLists,String bankName){
        System.out.println("Denomination Lists of "+bankName+" is as follows : ");
        for(int i=0;i<denominationLists.size();i++) {
            System.out.println(+denominationLists.get(i));
        }
    }
}
