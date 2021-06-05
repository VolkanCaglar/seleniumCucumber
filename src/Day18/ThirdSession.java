package Day18;

import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
  Senaryo;
  1- https://www.snapdeal.com/  sitesine gidiniz.
  2- Random Bir tane ürüne tıklatınız.
  3- Açılan yeni window daki ürünü sepete ekletiniz.
  4- Ana Window a dönüp sepete tıklatınız.
  5- Sepete eklenen ürün ile sepete tıklattığınızdaki ekrana çıkan
     ürün ismi aynı olup olmadığını assert ile kontrol ediniz.

*/
public class ThirdSession extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.snapdeal.com");
        WebElement prodName=driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[6]/a/div[2]/img"));//(//img[@class="wooble"])[4]
        List<WebElement> links=driver.findElements(By.cssSelector("a[target='_blank']"));


        String mainPage = driver.getWindowHandle();
        Set<String> windowsID = driver.getWindowHandles();
        prodName.click();

        Thread.sleep(6000);


        for (String ID : windowsID) {

            if (!ID.equals(mainPage)) continue;

            System.out.println(ID);
            driver.switchTo().window(ID);
            System.out.println("Windows title" + driver.getTitle());
           // driver.switchTo().window(mainPage);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,25000)");
            Thread.sleep(500);
            js.executeScript("window.scrollBy(0,-12000)");

        }
        Thread.sleep(6000);


        WebDriverWait wt=new WebDriverWait(driver,10);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        WebElement addToCart=driver.findElement(By.cssSelector("#add-cart-button-id > span"));

        wt.until(ExpectedConditions.elementToBeClickable(addToCart));
        addToCart.click();

        driver.switchTo().window(mainPage);



//        String prodPage = driver.getWindowHandle();
//        Set<String> prodID = driver.getWindowHandles();
//
//
//


            Thread.sleep(3000);
            driver.quit();



    }
}




