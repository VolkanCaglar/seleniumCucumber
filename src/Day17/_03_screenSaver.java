package Day17;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.io.File;
import java.io.IOException;

/*
Senaryo :
        1- https://opensource-demo.orangehrmlive.com/  sitesine gidiniz.
        2- sifreyi hatali girin/text i invalid creditial alip kontrol et
        3- ekran görünütüsnü kaydedip, ilgili kişiye gönderiniz.


 */
public class _03_screenSaver extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");

        WebElement btnLogin=driver.findElement(By.id("btnLogin"));
        btnLogin.click();

        WebElement welcome=driver.findElement(By.id("welcome"));
        String welcomeText = welcome.getText();

        System.out.println(welcomeText);

        if (welcomeText.contains("Admin"))
        {
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
            // Ekran kaydetme işlemleri burada olacak.

            // 1. Aşama ekran görüntüsü alma değişkenimizi tanımladık.
            TakesScreenshot ts = (TakesScreenshot) driver;

            // 2. Aşama alınacak Ekran görüntü dosyası tipi seçilerek hafızada oluşturuldu.
            File screenfile = ts.getScreenshotAs(OutputType.FILE);

            // 3.Aşama ekranDosyasını bir dosyaya yazma/kopyalama işlemi yapılıyor.
            // DosyaKopyala (ekranDosyası, ekranGoruntusu.png);
            // Yukarıdaki komut JAVA nın için de yok, bunun için diğer yapılmış bir kütüphane
            // bulup AYNI SELENYUMU eklediğimiz ekleyeceğiz. bu kütüphane common.io bu apache isimli siteden indirilecek.
            FileUtils.copyFile(screenfile, new File("screensaver/ORANGEhrm/LoginControl2.png"));
            // hafızadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet.
            // jpg,bmp,gif .. olabilir.
            // FileUtils.copyFile(screenfile, new File("screensaver/ORANGEhrm/LoginControl2+"BURAYA SAAT DAKIKA SANIYE KOY".png"));
        }


            Thread.sleep(3000);
        driver.quit();
    }
}
