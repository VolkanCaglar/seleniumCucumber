package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class _01_OpenWindows extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.selenium.dev/");
        List<WebElement> links=driver.findElements(By.cssSelector("a[target='_blank']"));
        //a[target=_blank] sayfada acilir pencere attributu a(link) leri bulundu
        for(WebElement link: links)
        {
            link.click();
        }
        //driverdan bu acilan yeni pencerelerin id leri alindi. Bu idlerin driver.getWindowHandeles()ile
        //aliyoruz.Uretilen idler Set<String> olarak dondugunden bu tur bir degiskene aldik.
        Set<String> windowsid=driver.getWindowHandles();

        for (String id:windowsid)
        {
            System.out.println(id);
        //idleri yazdirdik
        }
//        CDwindow-A33C39D9857F1DA56ED29A9B5F14B34C
//        CDwindow-744205250FEC0CD03CD0369CA87C852F
//        CDwindow-61885EC11F9D5A85788C17530989D7CC




        Thread.sleep(3000);
        driver.quit();
    }
}
