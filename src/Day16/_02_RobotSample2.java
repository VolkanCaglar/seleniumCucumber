package Day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _02_RobotSample2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        Thread.sleep(7622);


        WebDriverWait waitt=new WebDriverWait(driver,30);
        waitt.until(ExpectedConditions.visibilityOfElementLocated(By.id("flow_close_btn_iframe")));

        driver.switchTo().frame("flow_close_btn_iframe");
        WebElement kapatButonu = driver.findElement(By.id("closeBtn"));
        kapatButonu.click();
        Thread.sleep(2222);
        driver.switchTo().defaultContent();

        WebElement btnUpload= driver.findElement(By.xpath("//*[@id=\"file_wraper0\"]"));
        btnUpload.click();

        StringSelection stringSelection=new StringSelection("C:\\Users\\vcagl\\OneDrive\\Desktop\\ornek");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

        Thread.sleep(2000);
        Robot rbt=new Robot();
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        Thread.sleep(2222);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        driver.quit();
    }
}
