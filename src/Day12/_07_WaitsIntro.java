package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.concurrent.TimeUnit;

public class _07_WaitsIntro extends BaseStaticDriver {
    /*
    Thread.sleep >seleniuma ait degil java ya aittir ve yazilimi girilen miktar kadar bekletir

    implicit wait(ortulu bekleme) > tum elemanlar icin bir bekleme suresi atar. Ancak seleman bulundugu anda
    daha fazla beklemez


    pageLeadTimeout > 30sn suresinde sayfanin yuklenmesini bekliyor,
    bu sureden sonra timeout duserek hata verir
    driver.manage().timeouts()pageLoadTimeout(30,TimeUnit.SECONDS)


     */
    public static void main(String[] args) throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement startTimer= driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        startTimer.click();

        WebElement webDriverText=driver.findElement(By.xpath("//p[text()='WebDriver']"));

        System.out.println(webDriverText.getText());

driver.quit();
    }
}
