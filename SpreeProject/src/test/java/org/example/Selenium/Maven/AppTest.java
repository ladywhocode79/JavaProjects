package org.example.Selenium.Maven;


import POM.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for spree App.
 */
public class AppTest 
{
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

    public void useSideBarToSelectProduct(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        CategoryPage categoryPage = new CategoryPage();
        ProductDetailPage productDetailPage = new ProductDetailPage();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        CheckOutPage checkOutPage = new CheckOutPage();

        //variables to store email and password
        String email = "simple12@dd.com";
        String password = "2345678";
        //click on login link on home page
        homePage.ClickOnLogin(driver);
        loginPage.LoginToSpree(driver,email,password);
        //verify the login successfull message
        homePage.VerifyLoginSuccessfull(driver);

        //select category from side bar
        categoryPage.SearchNSelectInCategory(driver);
        //search product,select and click on product name link
        categoryPage.SelectFromProducList(driver);

        //product detail page update the quantity and click add to cart
        productDetailPage.AddQuantityNAddToCart(driver);

        //select total on checkout page and return total
        shoppingCartPage.CheckOut(driver);
        String orderTotal =checkOutPage.ReturnOrderTotalValue(driver);
        System.out.println("Actual Order total : " +orderTotal);


    }

    @Test
    //flow to select category from drop down list and search
    public void loginNAddProductToCart()
    {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        CategoryPage categoryPage = new CategoryPage();
        ProductDetailPage productDetailPage = new ProductDetailPage();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        CheckOutPage checkOutPage = new CheckOutPage();

        //variables to store email and password
        String email = "simple12@dd.com";
        String password = "2345678";
        //click on login link on home page
        homePage.ClickOnLogin(driver);
        loginPage.LoginToSpree(driver,email,password);
        //verify the login successfull message
        homePage.VerifyLoginSuccessfull(driver);

        //select category from dropdown
        categoryPage.SelectCategoryFromDropDown(driver);

        //search product,select and click on product name link
        categoryPage.SelectFromProducList(driver);

        //product detail page update the quantity and click add to cart
        productDetailPage.AddQuantityNAddToCart(driver);

        //select total on checkout page and return total
        shoppingCartPage.CheckOut(driver);
        String orderTotal= checkOutPage.ReturnOrderTotalValue(driver);

        System.out.println("Actual Order total : " +orderTotal);

     /*   driver.findElement(By.cssSelector("span[title=\"Ruby on Rails Tote\"]")).click();
        //try using xpath
        driver.findElement(By.xpath("//*[@id='quantity']")).clear();
        // driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys("3");
        driver.findElement(By.id("add-to-cart-button")).click();

        String total = driver.findElement(By.cssSelector("td[class=\"lead\"]")).getText();
        System.out.println("Total is " +total);

        //click on checkout
        driver.findElement(By.id("checkout-link")).click();

        String orderTotal = driver.findElement(By.cssSelector("span[id=\"summary-order-total\"]")).getText();
       // System.out.println("Total is " +orderTotal);

        //assert on cart total should be equal to expected result
        String expectedTotal="$47.97";
        Assert.assertEquals(orderTotal,expectedTotal,"Failed in comparison");
*/
    }
    @AfterMethod
    public void closeBrowser(){
        //close the browser
       driver.close();

       // driver.quit();
    }
}

