package Day11;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;



/*
   Senaryo :
   1- http://demo.guru99.com/test/drag_drop.html Siteyi açınız.
   2- Bank butonunu sürükleyerek bağtaki kutucuğa bırakınız.
   3- Daha sonra bütün kutularda BANK butonunun textini aratınız.
   4- Assert ile doğrulayınız.
 */


public class _05_ActionDragandDropTest extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        WebElement bankbutton= driver.findElement(By.id("credit2"));
        WebElement kutu= driver.findElement(By.id("bank"));

        Actions builder=new Actions(driver);
        Action build = builder.dragAndDrop(bankbutton,kutu).build();
        build.perform();
Thread.sleep(3000);

WebElement equity=driver.findElement(By.xpath("//*[@id=\"credit3\"]/a"));
        WebElement box=driver.findElement(By.xpath("//*[@id=\"bank\"]"));

Action ownerequity=builder.dragAndDrop(equity,box).build();
ownerequity.perform();



        WebElement kutuIcerigi= driver.findElement(By.cssSelector("#bank > li"));
        Assert.assertTrue(kutuIcerigi.getText().equals(bankbutton.getText()));



        Thread.sleep(2000);
        driver.quit();
    }
}