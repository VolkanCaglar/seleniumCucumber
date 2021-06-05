package A0_Pratik_Yapma_Yeri;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.internal.BaseAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.util.List;

public class calisma_02 extends BaseStaticDriver{
    public static void main(String[] args) throws InterruptedException{
        driver.get("http://www.practiceselenium.com/let-s-talk-tea.html");

        List<WebElement> FoundLiListe=driver.findElements(By.tagName("div"));

        for (WebElement liliste: FoundLiListe)

        {
            System.out.println(liliste.getText());
        }

        driver.quit();
    }
}
