package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

    //define and locate web element
    @FindBy(xpath = "//*[@id='quantity']")
    private WebElement quantity;
    @FindBy(css = "span[title=\"Ruby on Rails Tote\"]")
    private WebElement clickOnProductName;
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCart;


    public ProductDetailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addQuantityNAddToCart(){
        //try using xpath,
        quantity.clear();
        //update quantity
        quantity.sendKeys("3");
        //Add to cart
        addToCart.click();

    }
}
