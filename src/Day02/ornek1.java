package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ornek1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

            WebDriver driver= new ChromeDriver();
            driver.get("http://www.practiceselenium.com/");


            Thread.sleep(3000);
            driver.quit();
        }
    }


