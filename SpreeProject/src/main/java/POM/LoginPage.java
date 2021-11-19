package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public void loginToSpree(WebDriver driver,String email,String password){
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
