package A0_Pratik_Yapma_Yeri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;

public class calisma_etsy extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        List<WebElement> anabasliklar=driver.findElements(By.cssSelector("ul[role=menubar]>li"));
       // WebElement ilkbalik= driver.findElement(By.xpath("(//li[@class='top-nav-item wt-pb-xs-2 wt-mr-xs-2 wt-display-flex-xs wt-align-items-center'])[1]"));
//
//        ilkbalik.getText();
//        System.out.println("ilkbalik = " + ilkbalik);


        for (int i = 0; i <anabasliklar.size() ; i++) {
            System.out.println(anabasliklar.get(i).getText());

        }
        driver.quit();
    }
}
