package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _03_javaAlert extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement buttonClick= driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]"));
        buttonClick.click();

        driver.switchTo().alert().dismiss();//alert kusuna gecildi ve tamam tusuna basildi
        // Alert kutucuğuna geçildi ve Tamam butonuna basıldı.
        //  web sayfasından Alert kutucuğuna geçildi.  switchTo

        Thread.sleep(3000);
        driver.quit();


    }
}
