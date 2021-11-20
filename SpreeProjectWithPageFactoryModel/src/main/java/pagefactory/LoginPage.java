package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //define and locate web element
    @FindBy(id = "spree_user_email")
    private WebElement emailText;
    @FindBy(name = "spree_user[password]")
    private WebElement passwordText;
    @FindBy(css = "input[type='checkbox']")
    private WebElement rememberMeCheckBox;
    @FindBy(css = "[value='Login']")
    private WebElement clickLoginButton;


    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void loginToSpree(String email,String password){
        //email
        emailText.sendKeys(email);
        //password..
        passwordText.sendKeys(password);
        //select the checkbox
        rememberMeCheckBox.click();
        //click on login
        clickLoginButton.click();

    }
}
