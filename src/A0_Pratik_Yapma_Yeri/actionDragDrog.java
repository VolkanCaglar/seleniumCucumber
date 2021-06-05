package A0_Pratik_Yapma_Yeri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class actionDragDrog extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Thread.sleep(1500);


        int cityNumbers= driver.findElements(By.cssSelector("#answerDiv > div")).size();
        System.out.println(cityNumbers);
        for (int i = 1; i <=cityNumbers+1 ; i++) {
            WebElement source = driver.findElement(By.id("a" + i));
            WebElement target = driver.findElement(By.id("q" + i));
            new Actions(driver)
                    .moveToElement(source)
                    .clickAndHold()
                    .pause(100)
                    .moveToElement(target)
                    .release()
                    .build()
                    .perform();
        }

//        WebElement athen=driver.findElement(By.id("a7"));
//        WebElement madrid=driver.findElement(By.id("a6"));
//        WebElement nairobi=driver.findElement(By.id("a13"));
//        WebElement kuala=driver.findElement(By.id("a14"));
//        WebElement rome=driver.findElement(By.id("a10"));
//        WebElement washington=driver.findElement(By.id("a4"));
//        WebElement santiage=driver.findElement(By.id("a11"));
//        WebElement vienna=driver.findElement(By.id("a9"));
//        WebElement delphi=driver.findElement(By.id("a12"));
//        WebElement hanoi=driver.findElement(By.id("a15"));
//        WebElement paris=driver.findElement(By.id("a5"));
//        WebElement oslo=driver.findElement(By.id("a1"));
//        WebElement stockholm=driver.findElement(By.id("a2"));
//        WebElement london=driver.findElement(By.id("a8"));
//        WebElement copen=driver.findElement(By.cssSelector("#a3"));
//
//        WebElement italy=driver.findElement(By.id("q10"));
//        WebElement ukingdom=driver.findElement(By.id("q8"));
//        WebElement india=driver.findElement(By.id("q12"));
//        WebElement france=driver.findElement(By.id("q5"));
//        WebElement austria=driver.findElement(By.id("q9"));
//        WebElement norway=driver.findElement(By.id("q1"));
//        WebElement grece=driver.findElement(By.id("q7"));
//        WebElement sweden=driver.findElement(By.id("q2"));
//        WebElement malasia=driver.findElement(By.id("q14"));
//        WebElement spain=driver.findElement(By.id("q6"));
//        WebElement uss=driver.findElement(By.id("q4"));
//        WebElement vietnam=driver.findElement(By.id("q15"));
//        WebElement chile=driver.findElement(By.id("q11"));
//        WebElement kenya=driver.findElement(By.id("q13"));
//        WebElement denmark=driver.findElement(By.id("q3"));
        //List<WebElement> cities= driver.findElements(By.cssSelector("#answerDiv > div"));
        //int cityNumbers= cities.size();


//        Action drag1=moveIt
//                .moveToElement(copen)
//                .clickAndHold()
//                .pause(100)
//                .moveToElement(denmark,2,-2)
//                .pause(100)
//                .release()
//                .build();
//        drag1.perform();
//
//
//        Action drag2=moveIt
//                .moveToElement(athen)
//                .clickAndHold()
//                .pause(100)
//                .moveToElement(grece,2,-2)
//                .pause(100)
//                .release()
//                .build();
//        drag2.perform();
//        Thread.sleep(1000);
//        Action drag2=moveIt.dragAndDrop(athen,grece).build();
//        drag2.perform();
//        Thread.sleep(1000);
//        Action drag3=moveIt.dragAndDrop(madrid,spain).build();
//        drag3.perform();
//        Thread.sleep(1000);
//        Action drag4=moveIt.dragAndDrop(nairobi,kenya).build();
//        drag4.perform();
//        Thread.sleep(1000);
//        Action drag5=moveIt.dragAndDrop(kuala,malasia).build();
//        drag5.perform();
//        Thread.sleep(1000);
//        Action drag6=moveIt.dragAndDrop(rome,italy).build();
//        drag6.perform();
//        Thread.sleep(1000);
//        Action drag7=moveIt.dragAndDrop(washington,uss).build();
//        drag7.perform();
//        Thread.sleep(1000);
//        Action drag8=moveIt.dragAndDrop(santiage,chile).build();
//        drag8.perform();
//        Thread.sleep(1000);
//        Action drag9=moveIt.dragAndDrop(vienna,austria).build();
//        drag9.perform();
//        Thread.sleep(1000);
//        Action drag10=moveIt.dragAndDrop(delphi,india).build();
//        drag10.perform();
//        Thread.sleep(1000);
//        Action drag11=moveIt.dragAndDrop(hanoi,vietnam).build();
//        drag11.perform();
//        Thread.sleep(1000);
//        Action drag12=moveIt.dragAndDrop(paris,france).build();
//        drag12.perform();
//        Thread.sleep(1000);
//        Action drag13=moveIt.dragAndDrop(oslo,norway).build();
//        drag13.perform();
//        Thread.sleep(1000);
//        Action drag14=moveIt.dragAndDrop(stockholm,sweden).build();
//        drag14.perform();
//        Thread.sleep(1000);
//        Action drag15=moveIt.dragAndDrop(london,ukingdom).build();
//        drag15.perform();
//        Thread.sleep(1000);


        Thread.sleep(3000);
       driver.quit();

    }
}
