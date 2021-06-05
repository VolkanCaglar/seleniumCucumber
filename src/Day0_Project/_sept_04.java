package Day0_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _sept_04 extends BaseStaticDriver {

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


        WebElement transferFund = driver.findElement(By.linkText("Transfer Funds"));
        transferFund.click();
        Thread.sleep(1000);

      //  "//select[class='input-xlarge']"

        WebElement fromAcc=driver.findElement(By.id("tf_fromAccountId"));
        Select Account= new Select(fromAcc);
        Account.selectByIndex(randomNum(5));//random[5]

        WebElement toAcc=driver.findElement(By.id("tf_toAccountId"));
        Select Accountto= new Select(fromAcc);
        Account.selectByIndex(randomNum(3));//random[5]

        WebElement ToAccount = driver.findElement(By.id("tf_toAccountId"));
        Select Account1 = new Select(ToAccount);
        Account1.selectByIndex(randomNum(5));//randomNum(5)
        driver.findElement(By.id("tf_amount")).sendKeys("2500");
        driver.findElement(By.id("tf_description")).sendKeys("Para yatirildi");
        Thread.sleep(500);
        driver.findElement(By.id("btn_submit")).click();
        Thread.sleep(500);
        driver.findElement(By.id("btn_submit")).click();


        Thread.sleep(3000);
        driver.quit();
    }
    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }
}