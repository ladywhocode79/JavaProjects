package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

   //define and locate web element
    @FindBy(css = "[class='nav-link text-white']")
    private WebElement clickLoginButton;
    @FindBy(css = "div[class=\"alert alert-success\"]")
    private WebElement sucessfulMessage;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickOnLogin(){
        //click on login button on home
        clickLoginButton.click();
    }
    public void verifyLoginSuccessful(){
        String expectedMessage="Logged in successfully";
        String successMessage=sucessfulMessage.getText();
        Assert.assertEquals(successMessage,expectedMessage,"Login message didn't match");
    }

}
