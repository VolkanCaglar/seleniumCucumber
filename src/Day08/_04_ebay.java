package Day08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _04_ebay extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{

        driver.get("http://www.ebay.com");
        driver.manage().deleteAllCookies();

        WebElement dropDownMenu=driver.findElement(By.id("gh-cat"));
        Select menu = new Select(dropDownMenu);
        menu.selectByValue("2984");

        driver.findElement(By.cssSelector("input#gh-ac")).sendKeys("Cocuk arabasi");Thread.sleep(1000);

        driver.findElement(By.cssSelector("input#gh-btn")).click();

        Thread.sleep(5000);
        driver.quit();

    }
}
