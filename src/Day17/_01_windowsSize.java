package Day17;

import org.openqa.selenium.Dimension;
import utils.BaseStaticDriver;

public class _01_windowsSize extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        Dimension measure= driver.manage().window().getSize();
        System.out.println("Width= "+ measure.width);
        System.out.println("Height= " + measure.height);

        Dimension newMeasure= new Dimension(800,600);
        driver.manage().window().setSize(newMeasure);


        Thread.sleep(2000);
        driver.quit();
    }
}
