package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    //define and locate web element
    @FindBy(id = "checkout-link")
    private WebElement checkout;

    public ShoppingCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkOut(){
        //click on checkout
        checkout.click();

    }
}
