package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;


public class _Project02_ extends BaseStaticDriver {
    public static void main(String[] args) throws  InterruptedException{

        driver.get("https://demo.applitools.com/");
        Thread.sleep(3000);

        WebElement userName= driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");

        WebElement passPort= driver.findElement(By.id("password"));
        passPort.sendKeys("techno123");
        Thread.sleep(1000);

        WebElement signIn= driver.findElement(By.id("log-in"));
        signIn.click();
        Thread.sleep(3000);




    }
}
