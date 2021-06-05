package Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class _05_FacebookHW extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();

        WebElement createNew= driver.findElement(By.cssSelector("a[id^='u_'][id$='_2']"));
        createNew.click();

        WebElement createName= driver.findElement(By.cssSelector("input[id^='u_'][id$='_b']"));
        createName.click();
        createName.sendKeys("derya");


        WebElement createlastname= driver.findElement(By.cssSelector("input[id^='u_'][id$='_d']"));
        createlastname.sendKeys("baykal");


        WebElement createpno= driver.findElement(By.cssSelector("input[id^='u_'][id$='_g']"));
        createpno.sendKeys("6465671888");


        WebElement createpass= driver.findElement(By.name("reg_passwd__"));
        createpass.sendKeys("Db123456");


        WebElement month= driver.findElement(By.name("birthday_month"));
        Select moonthh= new Select(month);
        moonthh.selectByValue("1");


        WebElement day= driver.findElement(By.name("birthday_day"));
        Select dayy= new Select(day);
        dayy.selectByValue("30");


        WebElement year= driver.findElement(By.name("birthday_year"));
        Select yearr= new Select(year);
        yearr.selectByValue("1980");



        WebElement gender= driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'][2]"));
        gender.click();
        Thread.sleep(2000);

        WebElement signnup= driver.findElement(By.xpath("//button[@class='_1lch']//child::span"));
        signnup.click();

Thread.sleep(5000);
driver.quit();

    }
}
