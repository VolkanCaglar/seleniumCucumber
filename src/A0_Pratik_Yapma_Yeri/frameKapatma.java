package A0_Pratik_Yapma_Yeri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class frameKapatma extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("http://www.softwaretestingclass.com/what-is-difference-between-sdet-and-tester/");
        //driver.switchTo().
        WebElement valueWindow= driver.findElement(By.className("vliIgnore"));
        valueWindow.click();

        WebElement demoClick= driver.findElement(By.linkText("GET A DEMO Today!"));
        demoClick.click();

        WebElement firstName= driver.findElement(By.id("first_name"));
        firstName.sendKeys("volkan");

        WebElement lastName= driver.findElement(By.id("last_name"));
        lastName.sendKeys("caglar");

        WebElement company= driver.findElement(By.id("company"));
        company.sendKeys("volkanas");

        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("abc@snail.com");

        WebElement phone= driver.findElement(By.id("phone"));
        phone.sendKeys("213456879");

        WebElement countrycode= driver.findElement(By.id("iti-0__item-cl"));
        countrycode.click();

        WebElement demoget= driver.findElement(By.xpath("//button[text()='Get A Demo']"));
        countrycode.click();




        Thread.sleep(3000);
        driver.quit();
    }
}
