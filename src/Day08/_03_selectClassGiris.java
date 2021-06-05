package Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _03_selectClassGiris extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{

        driver.get("https://www.amazon.com");
        WebElement menuDropDown= driver.findElement(By.id("searchDropdownBox"));
        driver.manage().deleteAllCookies();
        Select menu= new Select(menuDropDown);
        menu.selectByVisibleText("Books");
        Thread.sleep(3000);

        WebElement ara= driver.findElement(By.id("nav-search-submit-text"));
        ara.click();

        Thread.sleep(3000);
        driver.quit();

    }
}
