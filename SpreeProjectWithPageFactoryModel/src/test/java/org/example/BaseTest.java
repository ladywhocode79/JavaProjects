package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static pagefactory.Util.takeSnapShot;

public class BaseTest {
    //declare webdriver object
    static WebDriver driver;

    @BeforeMethod
    public void setupDriverAndOpenBrowser(){
        //set system property
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
        //assign chrome driver to driver object
        driver = new ChromeDriver();

        //home page link
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().fullscreen();

    }

    public void closeBrowser(){
        //close the browser
       driver.close();
         //driver.quit();

    }
    @AfterMethod
    public void takeTestcaseScreenshots(ITestResult result){
        //using ITestResult.FAILURE is equals to result.getStatus
        // then it enter into if condition
        if(ITestResult.FAILURE==result.getStatus()){
            try{
                takeSnapShot(driver,"Order_placed_page_failed");
                System.out.println("Successfully captured a screenshot for failed testcase");
            }
            catch (Exception e){
                System.out.println("Exception while taking screenshot "+e.getMessage());
            }
        }else{
            try {
                takeSnapShot(driver,"Order_placed_page_passed");
                System.out.println("Successfully captured a screenshot for passed testcase");
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot "+e.getMessage());
            }
          }
        driver.close();
    }
}
