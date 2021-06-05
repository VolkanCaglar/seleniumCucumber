package Day11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _01_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{

        driver.get("https://www.demoqa.com/buttons");
        driver.manage().deleteAllCookies();

        WebElement clickButton= driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions builder= new Actions(driver);   //aksiyonlari calistirmak icin degiskeni tanimla
        Action build= builder.moveToElement(clickButton).click().build();
        //aksiyob degiskenine aksiyon eklendi henuz islem olmadi
        build.perform();//aksiyon yapiliyor

    Thread.sleep(2000);
    driver.quit();

    }
}
