package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _05_iframeBank extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.switchTo().frame("flow_close_btn_iframe");
        WebElement closeButton= driver.findElement(By.id("closeBtn"));
        closeButton.click();

Thread.sleep(3000);
driver.quit();
    }
}
