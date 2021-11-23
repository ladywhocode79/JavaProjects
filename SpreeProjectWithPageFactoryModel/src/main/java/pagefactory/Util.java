package pagefactory;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.sql.Timestamp;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Util {
    /**
     * This function will take screenshot
     *
     * @param driver
     * @param fileWithPath
     * @throws Exception
     */
    public static void takeSnapShot(WebDriver driver,String pageName)
            throws Exception {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot screenShot = ((TakesScreenshot) driver);
        //Call getScreenshotAs method to create image file
        File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);


        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String fileWithPath = "./screenshots/";
        String filename=pageName+timestamp+".png";
        System.out.println(filename);

        //Move image file to new destination
        File DestFile = new File(fileWithPath+filename);
        //Copy file at destination
        // Files.copyFile(sourceFile, DestFile);
        Files.copy(sourceFile, DestFile);
        System.out.println("Successfully captured a screenshot");
    }

    public static void takeFullScreenShot(WebDriver driver,String pageName)
            throws Exception {

        Screenshot screenshot = new AShot().shootingStrategy
                (ShootingStrategies.viewportPasting(5000)).
                takeScreenshot(driver);

        //to take full screenshot
        Screenshot screenshot1=new AShot().shootingStrategy(
                ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(),"PNG",new File("./screenshots/"));

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String fileWithPath = "./screenshots/";
        String filename=pageName+timestamp+".jpg";

        ImageIO.write(screenshot.getImage(), "jpg", new File(fileWithPath+filename));
    }

}
