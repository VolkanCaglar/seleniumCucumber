package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
/*      driver.switchTo().frame(0);    indexle de bulunabilir  (1)

        driver.switchTo().frame("frame1"); // id veya name le de bulunabilir  (2)
        WebElement cerceve1=driver.findElement(By.id("frame1")); // element olarak bulunup

        driver.switchTo().frame(cerceve1); // bu şekilde de diğer sayfaya geçilebilir. (3)
*/

public class _04_IframeIntro extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");

        WebElement input=driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("hi");

        Thread.sleep(2000);
        driver.quit();






        Thread.sleep(3000);
        driver.quit();
    }
}
