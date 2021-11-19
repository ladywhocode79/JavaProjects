package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CategoryPage {
    public void SearchNSelectInCategory(WebDriver driver){
        //search in category
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //create web element for Category side room
        driver.findElement(By.cssSelector("a[href=\"/t/bags\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }
    public void SelectFromProducList(WebDriver driver){
        //select from category
        driver.findElement(By.cssSelector("span[title=\"Ruby on Rails Tote\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void SelectCategoryFromDropDown(WebDriver driver){
        //to select items from drop down and click on search
        WebElement dropdown = driver.findElement(By.id("taxon"));
        Select select = new Select(dropdown);
        select.selectByValue("1");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //find the search button anc click to search
        driver.findElement(By.cssSelector("input[value='Search']")).click();;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}
