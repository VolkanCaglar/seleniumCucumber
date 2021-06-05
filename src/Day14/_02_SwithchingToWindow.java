package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class _02_SwithchingToWindow extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
    driver.get("https://www.selenium.dev/");
        String mainPageId=driver.getWindowHandle();
        System.out.println("Ana sayfa Id"+ mainPageId);

        List<WebElement> links= (List<WebElement>)driver.findElement(By.cssSelector("a[target='_blank']"));
        for (WebElement link: links)
        {
            link.click();
        }

        Set<String> windowsID=driver.getWindowHandles();
        for (String ID:windowsID)
        {
            if (ID.equals(mainPageId)) continue;
            System.out.println(ID);
            driver.switchTo().window(ID);
            System.out.println("windows title= " + driver.getTitle());
        }





    Thread.sleep(3000);
    driver.quit();
    }
}
