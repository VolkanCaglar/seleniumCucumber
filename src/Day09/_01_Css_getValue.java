package Day09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _01_Css_getValue extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.snapdeal.com/");
        driver.manage().deleteAllCookies();

        WebElement button_01= driver.findElement(By.id("inputValEnter"));

        System.out.println(button_01.getAttribute("color"));
        System.out.println(button_01.getAttribute("font-size"));
        System.out.println(button_01.getAttribute("background"));



        System.out.println(button_01.getCssValue("color"));
        System.out.println(button_01.getCssValue("font-size"));
        System.out.println(button_01.getCssValue("background"));

        Thread.sleep(3000);
        driver.quit();
    }
    }