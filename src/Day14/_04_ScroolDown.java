package Day14;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseStaticDriver;
/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için
    ve sayfanın üstünde oluşan ek popuplar ın konumun kaydırılmasıdır.
    Çünkü üzerinde popup olan eleman tıklatılamaz.

    Bu işlem javascript executer ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.
 */

public class _04_ScroolDown extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,5000)", "");
        Thread.sleep(3000);
        // javascript komutu internetten bulunarak , executeScript metodu ile çalıştırıldı...

        js.executeScript("window.scrollBy (0,-2000)", "");
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
        Thread.sleep(3000);
        //sayfanin sonuna gidiyor


        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)","");

        Thread.sleep(3000);
        driver.quit();
    }
}