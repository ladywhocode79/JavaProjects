public class ProductMaster {
    String productId;
    String productName;
    double productPrice;
    int productQuantity;

    //Default construtor
    ProductMaster(){

    }
    //Paramaterised construtor with all variables values
    ProductMaster(String id,String name,double price,int quantity){
        this.productId = id;
        this.productName = name;
        this.productPrice =price;
        this.productQuantity = quantity;
    }


}
