package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _02_SendKeys_Click extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{

        driver.navigate().to("http://www.practiceselenium.com/");

        Thread.sleep(3000);
        WebElement link= driver.findElement(By.linkText("Check Out"));
        link.click();

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.quit();

    }
}
