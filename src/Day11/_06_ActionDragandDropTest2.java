package Day11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _06_ActionDragandDropTest2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        WebElement kredibutton= driver.findElement(By.id("credit1"));
        WebElement kutu= driver.findElement(By.id("loan"));

        Actions builder=new Actions(driver);
        Action build = builder.clickAndHold(kredibutton).moveToElement(kutu).release().build();
        build.perform();

        Thread.sleep(2000);
        driver.quit();

    }

}
