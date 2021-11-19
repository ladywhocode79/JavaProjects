package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckOutPage {
    WebDriver driver;
     public CheckOutPage(WebDriver driver){
        this.driver = driver;
    }

    public String returnOrderTotalValue(){
        String orderTotal = driver.findElement(By.cssSelector("span[id=\"summary-order-total\"]")).getText();
        //assert on cart total should be equal to expected result
        String expectedTotal="$47.97";
        Assert.assertEquals(orderTotal,expectedTotal,"Failed in comparison");
        System.out.println("Expected Order Total is :"+expectedTotal);
        return orderTotal;
    }
}
