package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

public class proje extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        /*
         *"https://www.e-shopland.ch/sellacious/index.php" sayfasına gidin
         *  * Arama simgesine tıklayın ve "Canon" u arayın
         * * "Canon" kamera için "Add to cart" a tıklayın
         *    * "Ödeme Yap" ı tıklayın
         * Email adresini girin ve ""Proceed" e tıklayın.
         * "Checkout as Guest"  te tıklayın.
         * Formu doldurun.(rastgele bir ülke seçilmeli) - (Eyalet ve ilçe için hiçbir şey seçmeyin)
         * Save butonuna tıklayın
         * Adresin altındaki 'Bill Here' ve 'deliver here' butonuna tıklayın ve devam etmek için oka tıklayın
         * Devam etmek için ok butonuna tıklayın
         * "Proceed to payment" butonuna tıklayın
         * "Cheque" ve "pay now" butonuna tıklayın. (burada bir bug var)
         * "Adress Adress" kutucugunu kapatmak için X 'e basın. (thread sleep)
         * "Cheque" e tıklayın ve "Pay Now" butonuna tekrar basın.
         * "Payment via Cheque approved" mesajının görüntülendiğini dogrulayın
         * Success" mesajının görüntülendiğini doğrulayın
         * "View Invoice" butonuna tıklayın ve doğru ürünü siparis ettiginizi onaylayın.
         * "View Receipt" e tıklayın ve e postanızın makbuzda dogru yazıldıgını kontol edin, onaylayın.
         *
         */
        driver.get("https://www.e-shopland.ch/sellacious/index.php");
        driver.findElement(By.xpath("//*[@id=\"sella125\"]/div[1]/i[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"finder125\"]")).sendKeys("Canon");
        driver.findElement(By.xpath("//*[@id=\"finder-search\"]/div/div[1]/button")).click();
        driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-add-cart buy'])[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"cart-items\"]/div/div[4]/div/div[2]/div/a[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"login_email\"]")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"login_email_submit\"]")).click();//proceed
        driver.findElement(By.xpath("//*[@id=\"btn_guest_checkout\"]")).click();//as a guest
        driver.findElement(By.xpath("//*[@id=\"jform0_name\"]\n")).sendKeys("john");

        JavascriptExecutor jc= (JavascriptExecutor) driver;
        jc.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-save-address'])[1]")).click();//save

        // Select dropdown=new Select(driver.findElement(By.id("jform0_name")));
        //dropdown.selectByIndex(randomNum());
        Thread.sleep(7444);
        driver.findElement(By.xpath("//button[@class='btn btn-small btn-default btn-bill-here btn-success active']")).click();//bill
        driver.findElement(By.xpath("//button[@class='btn btn-small btn-default btn-ship-here btn-success active']")).click();//deli
        driver.findElement(By.xpath("(//a[@class='btn btn-small btn-default btn-next pull-right'])[2]")).click();
        //*[@id="address-toolbar"]/a[2]
        Thread.sleep(4444);
        driver.findElement(By.xpath("//*[@id=\"address-item-97\"]/div[2]/div/div/button[1]\n")).click();
        driver.findElement(By.xpath("//*[@id=\"address-item-112\"]/div[2]/div/div/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"address-toolbar\"]/a[2]")).click();

    }
         public static int randomNum(int max)
         {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
        }
    }

