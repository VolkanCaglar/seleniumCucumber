package Day12;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _05_AlertPart33 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{

        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        WebElement buttonPrompt= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        WebElement textActual= driver.findElement(By.id("prompt-demo"));


        buttonPrompt.click();
        Thread.sleep(1000);

        driver.switchTo().alert().sendKeys("volkan");
        Thread.sleep(1000);

        System.out.println(textActual.getText());
        Thread.sleep(4000);
        driver.switchTo().alert().accept();
        Assert.assertTrue(textActual.getText().contains("volkan"));


    Thread.sleep(6000);
    driver.quit();
    }
}
