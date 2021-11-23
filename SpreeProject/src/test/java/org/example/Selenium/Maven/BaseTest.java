package org.example.Selenium.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    //declare webdriver object
    WebDriver driver;
    @BeforeMethod
    public void setupDriverAndOpenBrowser(){
        //set system property
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
        //assign chrome driver to driver object
        driver = new ChromeDriver();

        //home page link
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void closeBrowser(){
        //close the browser
       driver.close();

         //driver.quit();
    }
}
