package A0_Pratik_Yapma_Yeri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.net.http.WebSocket;
import java.util.List;
import java.util.Set;

public class _14windowsPratise extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{

        driver.get("http://www.amazon.com");
        List<WebElement> links=driver.findElements(By.cssSelector("a[target='_blank']"));
        Thread.sleep(3000);
        String mainId= driver.getWindowHandle();
        System.out.println(mainId);
        Thread.sleep(4444);
        Set<String> allIDs= driver.getWindowHandles();
        System.out.println("allIDs = " + allIDs);

       // int numID= allIDs.getSize();
        for (String ListallIDs:allIDs) {
        int numID=10;
        for (int i = 1; i <= numID; i++) {
                System.out.println("i_" +i+ driver.getTitle());

            }
        }
        Thread.sleep(3333);
        driver.quit();
    }
}
