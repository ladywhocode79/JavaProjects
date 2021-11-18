import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleJavaSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/.Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
    }
}
