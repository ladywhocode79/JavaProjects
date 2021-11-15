import java.util.Scanner;

public class SetProductMenu {

    public static void main(String[] args) {
       // ItemMaster productOne = new ItemMaster();
        //ItemMaster productTwo = new ItemMaster("002","Choco Bar",20.25,2);
        int productCount;

        //System.in is a standard input stream
        Scanner sc= new Scanner(System.in);

        //set products for the vending machine
        ProductMaster productOne = new ProductMaster("001","Choco Bar",10.00,5);
        ProductMaster productTwo = new ProductMaster("002","Orange Juice",25.00,8);
        ProductMaster productThree = new ProductMaster("003","Plain Water Bottle",15.00,10);

        ProductMaster [] arrayOfProductLists = new ProductMaster[3];
        System.out.println("Hello! Select item from ");
        for(int i=0;i<arrayOfProductLists.length;i++){
            System.out.println();
        }


    }


}
