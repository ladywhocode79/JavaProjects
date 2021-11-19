package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    WebDriver driver;
    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkOut(){
        //click on checkout
        driver.findElement(By.id("checkout-link")).click();

    }
}
