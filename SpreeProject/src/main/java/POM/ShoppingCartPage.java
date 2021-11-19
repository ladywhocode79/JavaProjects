package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    public void checkOut(WebDriver driver){
        driver.findElement(By.cssSelector("td[class=\"lead\"]"));
       // System.out.println("Total is " +total);

        //click on checkout
        driver.findElement(By.id("checkout-link")).click();

    }
}
