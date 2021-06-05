package Day18;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

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
public class ThirdSessionMyself extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.snapdeal.com");
        Thread.sleep(3000);
        String mainPage= driver.getWindowHandle();

        WebElement prodName=driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[7]/a/div[2]/img"));
        prodName.click();

        Set<String> windowsID = driver.getWindowHandles();
        for (String IDs:windowsID)
        {
            System.out.println(IDs);
            if (IDs.equals(mainPage)) continue;
            System.out.println(IDs);
            driver.switchTo().window(IDs);
        }

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,200)");
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,200)");
            Thread.sleep(3000);


        WebDriverWait wt=new WebDriverWait(driver,40);

        WebElement addToCart=driver.findElement(By.xpath("(//div[@id=\"add-cart-button-id\"])[1]"));
        addToCart.click();
        Thread.sleep(10000);

        WebElement ToCart=driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[1]/div"));
        ToCart.click();
        Thread.sleep(3000);

        WebElement cartSecond= driver.findElement(By.xpath("//*[@id=\"rtbScriptContainer\"]/div[5]/ul/li/div[3]/div[1]/div/a"));
        String proSecondText=cartSecond.getText();
        System.out.println("proSecondText = " + proSecondText);
        Thread.sleep(3000);
        WebElement backTo=driver.findElement(By.xpath("//*[@id=\"rtbScriptContainer\"]/div[1]/span/i"));
        Thread.sleep(3000);
        backTo.click();

        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(mainPage);
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        WebElement ToCartmain=driver.findElement(By.cssSelector("#sdHeader > div.headerBar.reset-padding > div.topBar.top-bar-homepage.top-freeze-reference-point > div > div.col-xs-5.reset-padding.header-right.rfloat > div.cartContainer.col-xs-11.reset-padding"));
        js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep( 3000);

        ToCartmain.click();

        Thread.sleep(3333);

        WebElement cartmain= driver.findElement(By.xpath("//*[@id=\"rtbScriptContainer\"]/div[5]/ul/li/div[3]/div[1]/div/a"));
        String proTextMain=cartmain.getText();
        System.out.println("proTextMain = " + proTextMain);

        Thread.sleep(3000);

        Assert.assertEquals(proSecondText,proTextMain);
        System.out.println("Texts are same");

            Thread.sleep(3000);
            driver.quit();

    }
}




