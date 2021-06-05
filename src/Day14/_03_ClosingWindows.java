package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;
/*

 */

public class _03_ClosingWindows extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.selenium.dev/");
        String mainPageId=driver.getWindowHandle();


        List<WebElement> links=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link: links)
        {
            link.click();
        }

        Set<String> windowsID=driver.getWindowHandles();
        for (String ID:windowsID)
        {
            System.out.println(ID);
            if (ID.equals(mainPageId)) continue;

            driver.switchTo().window(ID);
            System.out.println("windows title= " + driver.getTitle());
            driver.close();
        }





        Thread.sleep(3000);
        driver.quit();

    }
}
