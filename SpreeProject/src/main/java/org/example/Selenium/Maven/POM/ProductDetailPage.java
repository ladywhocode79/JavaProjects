package org.example.Selenium.Maven.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage {
    WebDriver driver;
    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addQuantityNAddToCart(){
        //try using xpath,
        driver.findElement(By.xpath("//*[@id='quantity']")).clear();
        // driver.findElement(By.id("quantity")).clear();
        //update quantity
        driver.findElement(By.id("quantity")).sendKeys("3");
        //Add to cart
        driver.findElement(By.id("add-to-cart-button")).click();

    }
}
