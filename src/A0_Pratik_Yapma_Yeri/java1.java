package A0_Pratik_Yapma_Yeri;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class java1 extends BaseStaticDriver  {
    public static void main(String[] args) throws InterruptedException{
        driver.get("http://demoqa.com/buttons");
        WebElement clickButton= driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions act=new Actions(driver);
        Action acting=act.moveToElement(clickButton).click().build();

        acting.perform();
        Thread.sleep(3000);

        driver.navigate().refresh();

        WebElement doubleLink= driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
        Action doubleClick= act.moveToElement(doubleLink).doubleClick().build();
        doubleClick.perform();

        driver.navigate().refresh();

        WebElement rightLink= driver.findElement(By.id("rightClickBtn"));
        Action rightClick=act.moveToElement(rightLink).contextClick().build();
        rightClick.perform();

        WebElement message= driver.findElement(By.id("rightClickMessage"));
        Assert.assertEquals("You have done a right click" ,message.getText());



        Thread.sleep(2000);
        driver.quit();
    }
}
