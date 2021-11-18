package com.spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Products {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        //logim linl
       // driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.get("https://spree-vapasi-prod.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> list =driver.findElements(By.cssSelector("div[id=products] a"));
        int noOfProducts = list.size();
        System.out.println("Total number of products: "+noOfProducts);
        for(int i=0;i<noOfProducts;i++){
           String productName= list.get(i).getText();
            System.out.println("Product Name :" + productName);
        }

    }
}
