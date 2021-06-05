package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.io.IOException;
import java.util.Random;

/*
Senaryo :
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.

 */
public class _04_Question extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, IOException {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebElement firstnum=driver.findElement(By.xpath("//*[@id=\"number1Field\"]"));
        firstnum.sendKeys("Admin");

        WebElement secondnum=driver.findElement(By.xpath("//*[@id=\"number2Field\"]"));
        secondnum.sendKeys("admin123");

        WebElement operationSelect=driver.findElement(By.id("selectOperationDropdown"));
        Select operation=new Select(operationSelect);

        Random numcreat= new Random();
        for (int i = 0; i <5; i++) {
            int num1= numcreat.nextInt(100);
            int num2= numcreat.nextInt(100);

        }

        for(WebElement operate: operation.getOptions()){
            switch (operate.getText())
            {
                case "add":
                //    int result=
                    break;

                case "Substract":
                    break;
                case "Multiply":
                    break;

                case "Divide":
                    break;

                case "Concatenate":
                    break;
            }

        }

        WebElement welcome=driver.findElement(By.id(""));
        String welcomeText = welcome.getText();



            Thread.sleep(3000);
        driver.quit();
    }
}
