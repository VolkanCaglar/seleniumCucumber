package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class MainApp {
    public static void main(String[] args) {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.enisema.com/");
        driver.manage().window().maximize();
    }
}
