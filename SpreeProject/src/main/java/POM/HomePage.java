package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public void loginSucessfull(){

    }
    public void clickOnLogin(){
        //click on login button on home
        driver.findElement(By.cssSelector("[class=\"nav-link text-white\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    public void verifyLoginSuccessfull(){
        String expectedMessage="Logged in successfully";
       String sucessMessage= driver.findElement(By.cssSelector("div[class=\"alert alert-success\"]")).getText();
        Assert.assertEquals(sucessMessage,expectedMessage,"Failed in comparison");
    }
}
