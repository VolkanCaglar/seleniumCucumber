package Day12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class _01_ActionHover extends BaseStaticDriver{
    public static void main(String[] args) throws InterruptedException{
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        WebElement adv=driver.findElement(By.id("flow_close_btn_iframe"));//*[@id="closeBtn"]//*[@id="closeBtn"]

        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(adv));

       Actions actt=new Actions(driver);
//        Action actIt= actt.moveToElement(adv).pause(300).click().build();
//        actIt.perform();
        driver.findElement(By.id("flow_close_btn_iframe")).click();


        WebElement btnBank= driver.findElement(By.cssSelector("#credit2 > a"));



        Action build= actt.moveToElement(btnBank).build();
        build.perform();


        System.out.println("Mouse gelmeden once= "+ btnBank.getCssValue("color"));
        //        System.out.println("Mouse gelmeden once= "+ Color.fromString(btnBank.getCssValue("color")).asHex;

        System.out.println("Mouse geldikten sonra+ " +btnBank.getCssValue("color"));
        //        System.out.println("Mouse geldikten sonra= "+ Color.fromString(btnBank.getCssValue("color")).asHex;

        WebElement accountBox= driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
        Action accountt= actt.dragAndDrop(btnBank,accountBox).build();
        accountt.perform();

        WebElement amount= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement amountBox= driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        Action amountt=actt.clickAndHold(amount).release(amountBox).build();
        amountt.perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
