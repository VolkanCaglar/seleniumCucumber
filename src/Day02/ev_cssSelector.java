package Day02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
public class ev_cssSelector extends BaseStaticDriver{


    public static void main(String[] args) throws InterruptedException {

        // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
        driver.get("https://www.practiceselenium.com/"); // siteyi açtım


        WebElement e = driver.findElement(By.cssSelector("[id=email]"));
        System.out.println(e.getText());

        Thread.sleep(3000);
        driver.quit();

    }
}
