package A0_Pratik_Yapma_Yeri;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.Set;

public class _windowlar_gecis extends BaseStaticDriver {
    public static void main(String[] args) {


            String url = "C:/Users/pc/Desktop/JavaKurs/html/wins01.html";


            driver.get(url);
            ArrayList<String> winler = new ArrayList<>();

            String orjWin = driver.getWindowHandle();
            winler.add(orjWin);     // winler->orj

            String googleWin ="";
            String javatWin = "";

            driver.findElement(By.partialLinkText("Google")).click();
            Set<String> winIds = driver.getWindowHandles();

            for (String winId : winIds) {
                if (!winler.contains(winId)) {
                    googleWin = winId;
                    winler.add(googleWin);          // winler->orj, google
                }
            }

            sleep(2000);
            driver.findElement(By.partialLinkText("Javat")).click();
            winIds = driver.getWindowHandles();
            for (String winId : winIds) {
                if (!winler.contains(winId)) {
                    javatWin = winId;
                    winler.add(javatWin);       // winler->orj, google, javat
                }
            }

            sleep(2000);
            driver.switchTo().window(googleWin);
            sleep(2000);
            driver.switchTo().window(javatWin);
            sleep(2000);
            driver.close();

            driver.switchTo().window(googleWin);
            driver.close();
            driver.switchTo().window(orjWin);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("alert('Ok')");
            sleep(2000);
            driver.switchTo().alert().accept();

            sleep(3000);
            //driver.quit();
        }

        public static void sleep(int mils){
            try {
                Thread.sleep(mils);
            }catch (Exception ignored){
            }
        }
    }

