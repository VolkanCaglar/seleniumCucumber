package A0_Pratik_Yapma_Yeri;

import org.junit.Assert;
import org.openqa.selenium.interactions.internal.BaseAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;



public class charisma_05 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{

        driver.get("http://www.practiceselenium.com");
        driver.manage().deleteAllCookies();


        WebElement chuckLink= driver.findElement(By.linkText("Check Out"));
        chuckLink.click();


        WebElement eMailInput= driver.findElement(By.id("email"));
        eMailInput.click();
        eMailInput.sendKeys("volky");
        Thread.sleep(1000);

        WebElement namee=driver.findElement(By.id("name"));
        namee.clear();
        namee.sendKeys("cally");
        Thread.sleep(1000);


        WebElement AAdress=driver.findElement(By.id("address"));
        AAdress.click();
        AAdress.sendKeys("konya");
        Thread.sleep(2000);

        WebElement pplaceorder =driver.findElement(By.className("btn-primary"));
        pplaceorder.click();
        Thread.sleep(1000);

        WebElement dcontrolMenu= driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914921"));
        String dcontrolConfirm= dcontrolMenu.getText();
        System.out.println("dcontrolConfirm = " + dcontrolConfirm);
        System.out.println("dcontrolMenu = " + dcontrolMenu);

        Assert.assertEquals("Menu",dcontrolConfirm);

        String url= driver.getCurrentUrl();
        Assert.assertEquals("http://www.practiceselenium.com/menu.html?",url);
        System.out.println("Text is confirmed");



        driver.quit();
    }

}
