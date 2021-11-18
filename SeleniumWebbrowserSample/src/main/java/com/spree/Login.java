package com.spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        //logim linl
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.manage().window().maximize();
        //find elements
        //email
        driver.findElement(By.id("spree_user_email")).sendKeys("simple12@dd.com");
        //password..
        driver.findElement(By.name("spree_user[password]")).sendKeys("2345678");
        //select the checkbox
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();

        //click on login
        driver.findElement(By.cssSelector("[value='Login']")).click();

       //to select items from drop down and click on search
        WebElement dropdown = driver.findElement(By.id("taxon"));
        Select select = new Select(dropdown);
        select.selectByValue("1");

        Thread.sleep(2000);
     //   driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("ruby");

        //find the search button anc click to search
        driver.findElement(By.cssSelector("input[value='Search']")).click();;
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("span[title=\"Ruby on Rails Tote\"]")).click();
        //try using xpath
        driver.findElement(By.xpath("//*[@id='quantity']")).clear();
       // driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys("3");
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(2000);

        String total = driver.findElement(By.cssSelector("td[class=\"lead\"]")).getText();
        System.out.println("Total is " +total);

        //click on checkout
        driver.findElement(By.id("checkout-link")).click();

        String orderTotal = driver.findElement(By.cssSelector("span[id=\"summary-order-total\"]")).getText();
        System.out.println("Total is " +orderTotal);


        /*WebElement dropdown1 = driver.findElement(By.id("taxon"));
        Select select1 = new Select(dropdown1);

        select1.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("rails");

        //find the search button anc click to search
        driver.findElement(By.cssSelector("input[value='Search']")).click();;
        Thread.sleep(2000);
      */
        // driver.quit();


    }
}
