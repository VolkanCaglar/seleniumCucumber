package Day16;

import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _01_Robot_intro extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException, AWTException {
/*
        İnterview Soruları :
        1- Windows popupları nasıl kontrol edersiniz ? Robot class la
        2- Dosya yükleme işlemini ne ile yaparsınız ? Robot class la
 */

                driver.get("http://www.cleartrip.com/");

                Robot rbt=new Robot();

                Thread.sleep(4000);
                rbt.keyPress(KeyEvent.VK_TAB); // keyPress tuşa basıldı.
                rbt.keyRelease(KeyEvent.VK_TAB); // keyRelease tuşu bıraktı.

                Thread.sleep(4000);
                rbt.keyPress(KeyEvent.VK_TAB); // keyPress tuşa basıldı.
                rbt.keyRelease(KeyEvent.VK_TAB); // keyRelease tuşu bıraktı.

                Thread.sleep(4000);
                rbt.keyPress(KeyEvent.VK_TAB); // keyPress tuşa basıldı.
                rbt.keyRelease(KeyEvent.VK_TAB); // keyRelease tuşu bıraktı.

                Thread.sleep(4000);
                rbt.keyPress(KeyEvent.VK_ENTER); // keyPress tuşa basıldı.
                rbt.keyRelease(KeyEvent.VK_ENTER); // keyRelease tuşu bıraktı.

                Thread.sleep(5000);
//      driver.quit();

    }
}
