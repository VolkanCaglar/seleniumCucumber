package Mentor_Hours;

import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _Robot_Class extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, AWTException {
        driver.get("https://eu.jotform.com/form/202613856967365#preview");
        Robot rbt=new Robot();
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        //isim
        rbt.keyPress(KeyEvent.VK_V);
        rbt.keyPress(KeyEvent.VK_O);
        rbt.keyPress(KeyEvent.VK_L);
        rbt.keyPress(KeyEvent.VK_K);
        rbt.keyPress(KeyEvent.VK_A);
        rbt.keyPress(KeyEvent.VK_N);
        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_O);
        rbt.keyRelease(KeyEvent.VK_L);
        rbt.keyRelease(KeyEvent.VK_K);
        rbt.keyRelease(KeyEvent.VK_A);
        rbt.keyRelease(KeyEvent.VK_N);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);

        Robot robot=new Robot();
        //ILK urun tiklandi
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);

        //Tshirt
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        //Sweatshirt
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        //saat
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_1);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_0);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_2);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_6);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);

        //Send Gift
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_UP);
        Thread.sleep(500);

        //Mentoring
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(500);

        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(500);


        Thread.sleep(5000);
        driver.quit();
    }
}
