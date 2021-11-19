package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



import java.util.concurrent.TimeUnit;

public class HomePage {
    public void LoginSucessfull(WebDriver driver){

    }
    public void ClickOnLogin(WebDriver driver){
        //click on login button on home
        driver.findElement(By.cssSelector("[class=\"nav-link text-white\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    public void VerifyLoginSuccessfull(WebDriver driver){
        String expectedMessage="Logged in successfully";
       String sucessMessage= driver.findElement(By.cssSelector("div[class=\"alert alert-success\"]")).getText();
        Assert.assertEquals(sucessMessage,expectedMessage,"Failed in comparison");
    }
}
