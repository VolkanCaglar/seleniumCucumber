package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class _03_AlertWaitExample extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{

        driver.get("https://www.demoblaze.com/index.html");
        WebElement sams6= driver.findElement(By.linkText("Samsung galaxy s6"));
        sams6.click();

        WebElement addTocart= driver.findElement(By.partialLinkText("Add to"));
        addTocart.click();

        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        Thread.sleep(2000);
        driver.quit();

    }
}
