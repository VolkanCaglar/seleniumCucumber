package A0_Pratik_Yapma_Yeri;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.Set;

public class mentorluk_windowHandles extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{

        //ilk pencerem

        String firstWin = driver.getWindowHandle();

        String firstWinUrl = driver.getCurrentUrl();

        System.out.println(firstWinUrl);


        WebElement clickButton = driver.findElement(By.xpath("//a[text()='Click Here']"));

        clickButton.click();


        Set<String> windowAllWindows = driver.getWindowHandles();
        for (String window:windowAllWindows) {
            driver.switchTo().window(window);
        }
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("omer@gmail.com");

        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

        System.out.println("2. pencerenin url'i =  " +  driver.getCurrentUrl());

        driver.close();

        driver.switchTo().window(firstWin);
        Assert.assertEquals(firstWinUrl,driver.getCurrentUrl());
        System.out.println("Pencerenin son hali :   " + driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.quit();
    }

}
