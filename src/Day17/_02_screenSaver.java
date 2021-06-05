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
        2- Login işlemini yapınız.
        3- Welcome yazan sağ üst tarafta kullanıcı adının geçip geçmediğini kontrol ediniz.
        4- Eğer Kullanıcı adınız gözükmüyorsa , ekran görünütüsnü kaydedip, ilgili kişiye gönderiniz.


 */
public class _02_screenSaver extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement usern= driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
        usern.sendKeys("Admin");
        WebElement passw= driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
        passw.sendKeys("admin123");
        WebElement loginn= driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        loginn.click();
        WebElement welcomm= driver.findElement(By.id("welcome"));
        String welcomText= welcomm.getText();

        System.out.println("welcomText = " + welcomText);
        if (welcomText.contains("Admin"))
        {
            System.out.println("Test Passed");
        }
        else{
                    //1. Aşama ekran görüntüsü alma değişkenimizi tanımladık.
            TakesScreenshot screenshott=(TakesScreenshot) driver;
                    //2. Aşama alınacak Ekran görüntü dosyası tipi seçilerek oluşturuldu.
            File screenSaveFile=screenshott.getScreenshotAs(OutputType.FILE);
                    //3.Aşama ekranDosyasını bir dosyaya yazma/kopyalama işlemi yapılıyor.
                            // DosyaKopyala (ekranDosyası, ekranGoruntusu.png);
                            // Yukarıdaki komut JAVA nın için de yok, bunun için diğer yapılmış bir kütüphane
                            // bulup AYNI SELENYUMU eklediğimiz ekleyeceğiz. bu kütüphane common.io bu apache isimli siteden indirilecek.
            FileUtils.copyFile(screenSaveFile,new File("screensaver/ORANGEhrm/LoginControl3.png"));
                    //hafızadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet.
                    // jpg,bmp,gif .. olabilir.
            System.out.println("Test was not Pass");
        }




        Thread.sleep(3000);
        driver.quit();
    }
}
