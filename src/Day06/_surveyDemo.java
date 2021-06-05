package Day06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _surveyDemo extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://formsmarts.com/form/yu?mode=h5/"); // siteyi açtım
        Thread.sleep(1000);
        WebElement business = driver.findElement(By.cssSelector("input[id$=\'4586_0\']"));
        business.click();

        WebElement dropdownDiscover = driver.findElement(By.cssSelector("select[id$=\'_4588\']"));
        dropdownDiscover.click();

        WebElement optionOnlineAdv = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        optionOnlineAdv.click();

        WebElement buttonEveryDay = driver.findElement(By.cssSelector("input[value='Every Day']"));
        buttonEveryDay.click();

        WebElement goodRadio = driver.findElement(By.cssSelector("input[value='Good']"));
        goodRadio.click();

        WebElement HowlongDropdown = driver.findElement(By.cssSelector("select[id$='_4597']"));
        HowlongDropdown.click();

        WebElement secenek4 = driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)\n"));
        secenek4.click();
    }
}