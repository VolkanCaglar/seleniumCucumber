package Day0_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _sept_04_2proje extends BaseStaticDriver {
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









        WebElement fromAcc=driver.findElement(By.id("sp_payee"));
        Select Account= new Select(fromAcc);
        Account.selectByIndex(randomNum(3));


        WebElement ToAccount = driver.findElement(By.id("sp_account"));
        Select Account1 = new Select(ToAccount);
        Account1.selectByIndex(randomNum(5));//randomNum(5)
        driver.findElement(By.id("sp_amount")).sendKeys("1500");
        driver.findElement(By.id("sp_date")).sendKeys("2020-09-09");
        driver.findElement(By.id("sp_description")).sendKeys("Para odendi");
        Thread.sleep(500);
        driver.findElement(By.id("pay_saved_payees")).click();
        Thread.sleep(500);
















        Thread.sleep(3000);
    driver.quit();
    }

    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }
}