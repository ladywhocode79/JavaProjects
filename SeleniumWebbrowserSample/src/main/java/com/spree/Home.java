package com.spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Home {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        //home page link
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().maximize();
        //,a\\
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //select value from the drop down
        WebElement dropdown = driver.findElement(By.id("taxon"));
        Select select = new Select(dropdown);
        select.selectByValue("1");

        //Add value to the search text box
        driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("rails");

        //find the search button anc click to search
        driver.findElement(By.cssSelector("input[value='Search']")).click();;

      //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Display number of products on the page and name of the products
        List<WebElement> list =driver.findElements(By.cssSelector("div[id=products] a"));
        int noOfProducts = list.size();
        System.out.println("Total number of products: "+noOfProducts);
        for(int i=0;i<noOfProducts;i++){
            String productName= list.get(i).getText();
            System.out.println("Product Name :" + productName);
        }


        //display price of products
        List<WebElement> priceLists =driver.findElements(By.cssSelector
                ("div[id=products] span[class=\"price selling lead\"]"));
        int size = priceLists.size();
        for(int i=0;i<size;i++){
            String productPrice = priceLists.get(i).getText();
            System.out.println("Product Price: "+productPrice);
        }
        //find elements
     /* locate by id =id of element
        driver.findElement(By.id("keywords"));*/
        /*locate by name = name of element
        driver.findElement(By.name("keywords"));*/

        /*locate by css locator
        driver.findElement(By.cssSelector("input[placeholder='Search']"));
        */


        /*
        driver.findElement(By.id("spree_user_email")).sendKeys("simple12@dd.com");
        //password..
        driver.findElement(By.name("spree_user[password]")).sendKeys("2345678");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
*/


    }
}
