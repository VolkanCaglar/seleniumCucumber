package Day16;
/*
https://www.yogaalliance.org/ siteye gir
Become a member bolumunden teachers a tikla
cikan sayfanin title i al-Yoga Alliance olup olmadigini kontrol et
 */
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class _05_Sample1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.yogaalliance.org/");

        WebElement become= driver.findElement(By.xpath("//*[@id=\"SuperFish\"]/ul/li[2]/a"));
        Actions bcm=new Actions(driver);
        Action becomeTeacher=bcm.moveToElement(become).build();
        Thread.sleep(2222);
        becomeTeacher.perform();

        String expected="Yoga Alliance";
        WebElement teacher= driver.findElement(By.xpath("//*[@id=\"SuperFish\"]/ul/li[2]/ul/li[3]"));
        Thread.sleep(2222);
        teacher.click();

        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.titleContains(expected));

        Assert.assertTrue(expected.equals("Yoga Alliance"));

        driver.quit();
    }
}
