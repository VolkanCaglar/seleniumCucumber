package Day07;
/*
senaryo
1-facebook.com a gir
2-yeni hesap olustura tikla
3-for mu doldur secimleri select ile yap
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _05_FacebookSelect extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies(); // sitelerin bizim bilgilerimizi tutarak
        // bazen engel çıkardığı cookies leri sildik.

        driver.findElement(By.cssSelector("a[id^='u'][id$='2']")).click();
        Thread.sleep(1000);



//"input[type='text'][name='firstname'][id^='u_'][id$='_b']"
        driver.findElement(By.cssSelector("input[id^='u_'][id$='_b']"));
        WebElement formName=driver.findElement(By.cssSelector("input[id^='u_'][id$='_b']"));
        formName.click();
                formName.sendKeys("volkan");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[id^='u_'][id$='_d']"));
        WebElement formLastName=driver.findElement(By.cssSelector("input[id^='u_'][id$='_d']"));
        formLastName.click();
        formLastName.sendKeys("caglar");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[type='text'][name='reg_email__'][id^='u_'][id$='_g']"));
        WebElement formEmail=driver.findElement(By.cssSelector("input[type='text'][name='reg_email__'][id^='u_'][id$='_g']"));
        formEmail.click();
        formEmail.sendKeys("hudutsuz001@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']"));
        WebElement formEmailTek=driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']"));
        formEmailTek.click();
        formEmailTek.sendKeys("hudutsuz001@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[id='password_step_input']"));
        WebElement formPassword=driver.findElement(By.cssSelector("input[id='password_step_input']"));
        formPassword.click();
        formPassword.sendKeys("Wolkano12@");
        Thread.sleep(1000);


        WebElement Fday=driver.findElement(By.id("day"));
        Select day=new Select(Fday);
        day.selectByValue("10");

        WebElement Fmonth=driver.findElement(By.id("month"));
        Select month=new Select(Fmonth);
        month.selectByValue("1");

        WebElement Fyear=driver.findElement(By.id("year"));
        Select year=new Select(Fyear);
        year.selectByVisibleText("1983");

        WebElement sex=driver.findElement(By.cssSelector("input[id^='u_'][id$='_3']"));
        sex.click();

        Thread.sleep(3000);
        driver.quit();
    }

}
