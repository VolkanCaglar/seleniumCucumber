package Day06;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _02_Demo_cssSelector_ extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
        passWord.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        WebElement bikeLightEleman = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        bikeLightEleman.click();

        WebElement addtoCart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addtoCart.click();

        WebElement backPage = driver.findElement(By.xpath("//button[text()='<- Back']"));
        backPage.click();

        Thread.sleep(3000);


        WebElement boltTshirt = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        boltTshirt.click();

        WebElement addtoCart2 = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addtoCart2.click();

        WebElement conSepet = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        conSepet.click();

        WebElement buttonCheckout = driver.findElement(By.xpath("//a[text()='CHECKOUT']"));
        buttonCheckout.click();

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstNameInput.sendKeys("volkan");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastNameInput.sendKeys("cag");

        WebElement postalcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        postalcode.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
        continueButton.click();


        WebElement urunfiyat1 = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
        String txtFiyat1 = urunfiyat1.getText();

        WebElement urunfiyat2 = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
        String txtFiyat2 = urunfiyat2.getText();

        WebElement toplamEl = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
        String txtToplam = toplamEl.getText();

        System.out.println("fiyat 1= " + txtFiyat1);
        System.out.println("fiyat 2= " + txtFiyat2);
        System.out.println("toplam= " + txtToplam);


        double urunFiyatToplam = stringToDouble(txtFiyat1) + stringToDouble(txtFiyat2);
        double toplam = stringToDouble(txtToplam);

        Assert.assertTrue(toplam == urunFiyatToplam);


        Thread.sleep(3000);
        driver.quit();
    }

        public static double stringToDouble (String strTutar)
        {
            // $29.99
            String duzeltilmisHali = strTutar.replaceAll("[^\\d.]", "");
            // d yani sayı ve . haricindekileri(^) , bosluk ata yani sil
            // 29.99

            return Double.parseDouble(duzeltilmisHali);
        }

}
