package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class _01_ExplicitWait extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement button= driver.findElement(By.cssSelector("button[onclick='timedText()']"));
        button.click();

        //WebElement text= driver.findElement(By.xpath("//p[text()='WebDriver']"));
        //explicit
        WebDriverWait wait=new WebDriverWait(driver,45);
        WebElement text= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        // Bu locator daki eleman visible olana kadar bekle.
        // Implicit ve Explicit bekleme kullanıldığında ikisini de kullanır.


        Thread.sleep(3000);
        driver.quit();
    }
}
