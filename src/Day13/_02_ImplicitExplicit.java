package Day13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

/*
İnterview Sorusu :  Implicit ve Explicit

         Implicit : Bütün elemanlar için kullanılır.bir kere tanımlanır.
         Explicit : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur
                   ExpectedConditions
                                     .titleIs -> title bu olana kadar bekle
                                     .titleContains -> title ın da bu kelime geçene kadar bekle
                                     .visibilityOfTheElement -> eleman gözükene kadar bekle
                                     .elementToBeClickable -> eleman tıklanabilir olana kadra bekle
                                     .elementToBeSelected -> eleman seçilebilir olana kadra bekle
                                     .alertIsPresent()  -> alert çıkana kadar bekle.
                                     .textToBe -> elemanda verilen txt gözükene kadar bekle.
                                     .InvisibilityOfTheElement -> eleman kaybolana kadar bekle

         Her ikisi tanımlı ise : önce Implicit kullanılır, ve üzerine Explicit in süresi eklenerek
                                  toplam hata sınır süresi ortaya çıkmış olur.
 */
public class _02_ImplicitExplicit extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("http://www.seleniumeasy.com/test/ajax-form-submit-demo.html");

        WebElement title= driver.findElement(By.id("title"));
        title.sendKeys("Wait Command");

        WebElement desciption= driver.findElement(By.id("description"));
        desciption.sendKeys("Explicit ");

        WebElement btnSubmit= driver.findElement(By.id("btn-submit"));
        btnSubmit.click();

        WebDriverWait wait=new WebDriverWait(driver,5);

        Boolean textCreate= wait.until(ExpectedConditions.textToBe(By.xpath("//div[text()='Form submited Successfully!']"),"Form submited Successfully!"));
        System.out.println("process is completed  "+ textCreate);
        Thread.sleep(3000);
        driver.quit();
    }
}
