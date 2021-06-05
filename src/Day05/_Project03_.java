package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _Project03_ extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.snapdeal.com");

        WebElement searchBox= driver.findElement(By.id("inputValEnter"));
        searchBox.sendKeys("teddy bears");

        Thread.sleep(2000);

        WebElement searchButton= driver.findElement(By.className("searchformButton"));
        searchButton.click();


//        WebElement resultText= driver.findElement(By.className("nnn"));
//        String resultTest= resultText.getText();
//
////
//
//

   //    WebElement logo=driver.findElement(By.cssSelector());
   //    logo.click();



        Thread.sleep(6000);
        driver.quit();





    }
}
