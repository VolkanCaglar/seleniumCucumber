package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _06_AlertPart4 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        WebElement submitButton= driver.findElement(By.name("cusid"));
        submitButton.sendKeys("volkan");

        WebElement submit= driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

        String alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        driver.quit();


    }

}
