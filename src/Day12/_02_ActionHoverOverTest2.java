package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _02_ActionHoverOverTest2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement clothingTitle= driver.findElement(By.id("catnav-primary-link-10923"));
        WebElement kidsTitle= driver.findElement(By.id("side-nav-category-link-10941"));
        WebElement sweater= driver.findElement(By.id("catnav-l4-11103"));

        Actions builder= new Actions(driver);
        Action build= builder.moveToElement(clothingTitle).build();
        build.perform();
        Thread.sleep(3000);

        build= builder.moveToElement(kidsTitle).build();
        build.perform();

        Action sweaterTo= builder.moveToElement(sweater).pause(200).click().build();
        sweaterTo.perform();


        Thread.sleep(3000);
        driver.quit();
    }
}
