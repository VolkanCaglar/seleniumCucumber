package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _Project01_ extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{

        driver.get("http://demoqa.com/text-box");
        Thread.sleep(3000);

        WebElement fullName= driver.findElement(By.id("userName"));
        fullName.sendKeys("Automation");

        WebElement email= driver.findElement(By.id("userEmail"));
        email.sendKeys("testing@techno.com");

        WebElement address= driver.findElement(By.id("currentAddress"));
        address.sendKeys("Testing Permanent Address");

        WebElement Paddress= driver.findElement(By.id("permanentAddress"));
        Paddress.sendKeys("Testing Permanent Address");

        Thread.sleep(3000);

        WebElement submitButton= driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement name2= driver.findElement(By.id("name"));
        String name2Txt= name2.getText();

       // Assert.assertEquals("Name:Automation", name2Txt);
        //Assert.assertEquals("Email:testin@techno.com");








    }
}
