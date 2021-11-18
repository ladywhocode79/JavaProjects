package com.spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/signup");
        //find elements
        driver.findElement(By.id("spree_user_email")).sendKeys("simple12@dd.com");
        /*css id
        driver.findElement(By.cssSelector("input#spree_user_email")).sendKeys("simple123@dd.com");*/

        driver.findElement(By.name("spree_user[password]")).sendKeys("2345678");
        driver.findElement(By.cssSelector("[name='spree_user[password_confirmation]']")).sendKeys("2345678");
        //driver.findElement(By.cssSelector("[data-disable-with='Create']")).click();
        driver.findElement(By.cssSelector("[value='Create']")).click();
        driver.quit();


    }
}
