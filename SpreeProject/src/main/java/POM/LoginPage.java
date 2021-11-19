package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void loginToSpree(String email,String password){
        //email
        driver.findElement(By.id("spree_user_email")).sendKeys(email);
        //password..
        driver.findElement(By.name("spree_user[password]")).sendKeys(password);
        //select the checkbox
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        //click on login
        driver.findElement(By.cssSelector("[value='Login']")).click();

    }
}
