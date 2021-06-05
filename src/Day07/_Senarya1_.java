package Day07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class _Senarya1_ extends BaseStaticDriver{
    public static void main(String[] args) throws InterruptedException{
        driver.get("http://www.saucedemo.com/");

        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
        passWord.sendKeys("secret_sauce");

        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();


        List<WebElement> urunler=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for(WebElement urun: urunler)
        {
            System.out.println(urun.getText());
        }


        Thread.sleep(2000);
        driver.quit();



    }
}
