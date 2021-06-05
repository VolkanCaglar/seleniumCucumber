package Day11;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;
public class _08_ActionTusKontrol  extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/auto-complete");
        driver.manage().window().maximize();
//Ahmet=>shift+a basmak

        WebElement textInput= driver.findElement(By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]/div"));

        Actions builder= new Actions(driver);
        Action build= builder.moveToElement(textInput)
                .click()
                        .keyDown(Keys.SHIFT).sendKeys("a")
                        .keyUp(Keys.SHIFT).sendKeys("hmet")
                .build();

        Thread.sleep(5000);

        driver.quit();

    }
}