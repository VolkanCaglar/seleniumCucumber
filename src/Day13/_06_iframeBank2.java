package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _06_iframeBank2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("http://chercher.tech/practice/frames");
        driver.switchTo().frame("frame1");
        WebElement input= driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("hi");

        driver.switchTo().defaultContent();
        //frameden cikiyor

        driver.switchTo().frame("frame2");

        WebElement frame2text= driver.findElement(By.cssSelector("body > b"));
        System.out.println(frame2text.getText());

        Thread.sleep(3000);

driver.quit();
    }
}

/* 1.Frame Gidildi. Türkiye diye yazıldı.
        driver.switchTo().frame("frame1"); // 1.Frame gittim
                WebElement input=driver.findElement(By.cssSelector("input[type='text']"));
                input.sendKeys("Türkiye"); // oradaki input a yazı yazdım.

                //sonra anasayfaya geri döndüm
                driver.switchTo().defaultContent(); // Ana sayfaya geri getiriyorur gittiğim framaden(sayfadan)
                //driver.switchTo().parentFrame(); // bir geri sayfaya git demektir.yukarıdaki kodla aynı işi görüyor.

                // 2.Frame geçilecek ama öncesinde ana sayfaya gitmem gerekiyor.
                driver.switchTo().frame("frame2");

                // bir tane elemanın gettext ini aldım.
                WebElement frame2Yazi=driver.findElement(By.cssSelector("body > b"));
                System.out.println(frame2Yazi.getText());
    */
