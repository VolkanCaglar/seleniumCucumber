package Day11;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _02_ActionBoubleClickTes extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.demoqa.com/buttons");
        driver.manage().deleteAllCookies();

        WebElement doubeleClickButton = driver.findElement(By.id("rightClickBtn"));

        Actions builder = new Actions(driver);
        Action build= builder.moveToElement(doubeleClickButton).contextClick().build();
        build.perform();

        WebElement mesaj= driver.findElement(By.id("rightClickMessage"));
        Assert.assertEquals("You have done a double click", mesaj.getText());
        Thread.sleep(3000);
        driver.quit();
    }
}