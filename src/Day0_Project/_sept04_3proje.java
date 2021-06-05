package Day0_Project;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _sept04_3proje  extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement llogin = driver.findElement(By.id("user_login"));
        llogin.sendKeys("username");
        Thread.sleep(1000);

        WebElement ppasword = driver.findElement(By.id("user_password"));
        ppasword.sendKeys("password");
        Thread.sleep(1000);

        WebElement signButton = driver.findElement(By.name("submit"));
        signButton.click();
        Thread.sleep(1000);

        WebElement payBills= driver.findElement(By.linkText("Pay Bills"));
        payBills.click();
        Thread.sleep(1000);
        WebElement purchaseFC= driver.findElement((By.linkText("Purchase Foreign Currency")));
        purchaseFC.click();
        Thread.sleep(2000);

        WebElement currency = driver.findElement(By.id("pc_currency"));
        Select currency1= new Select(currency);
        currency1.selectByIndex(randomNum(15));
        Thread.sleep(2000);

        WebElement amount =driver.findElement(By.id("pc_amount"));
        amount.sendKeys("120");
        Thread.sleep(2000);

        WebElement selusdollar =driver.findElement(By.id("pc_inDollars_true"));
        selusdollar.click();
        Thread.sleep(1000);

        WebElement purchaseButton= driver.findElement((By.id("purchase_cash")));
        purchaseButton.click();
        Thread.sleep(1000);

        WebElement text= driver.findElement(By.id("alert_content"));
        String textStr= text.getText();
        Assert.assertEquals("Foreign currency cash was successfully purchased.", textStr);





        Thread.sleep(5000);
        driver.quit();

    }
    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }
}