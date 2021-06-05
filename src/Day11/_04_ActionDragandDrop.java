package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _04_ActionDragandDrop extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.demoqa.com/buttons");
        driver.manage().deleteAllCookies();

        // kaynak box1   hedef box101

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norvec=driver.findElement(By.id("box101"));

        Actions builder=new Actions(driver);

        Action build=builder.dragAndDrop(oslo, norvec).build();
        Thread.sleep(3000);
        build.perform();

        Thread.sleep(6000);
        driver.quit();


    }
    }