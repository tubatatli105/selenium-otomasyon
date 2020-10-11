package Testcases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Trendyol {

    protected WebDriver driver;
    protected static String url = "https://www.trendyol.com/";

    @Before
    public void setUp() {
        try{
            ChromeOptions options = new ChromeOptions(); //bildirimleri engelliyorum
            options.addArguments("--disable-notifications");
            DesiredCapabilities capabilities= DesiredCapabilities.chrome();
            System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver.exe");
            driver = new ChromeDriver(capabilities);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();


        }catch (Exception e){
            e.printStackTrace();

        }

    }



    @Test
    public void Testcase() {
         driver.get(url);

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //WebDriverWait wait = new WebDriverWait(driver, 5, 100);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Close']")));
         driver.findElement(By.xpath("//a[@title='Close']")).click();


       // WebElement loginButton = driver.findElement(By.xpath("//button[text()='']"));

       // loginButton.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//i[@class='icon navigation-icon-user']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("mrv6.788@gmail.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      driver.findElement(By.xpath("//input[@id='login-password-input']")).sendKeys("Bjk1903*");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[name()='path' and @id='Combined-Shape']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']")).sendKeys("Bilgisayar");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//i[@class='search-icon']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]")).click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       driver.findElement(By.xpath("//div[@class='add-to-bs-tx']")).click();

        String info =  "ACER 50000";
        String idForTxtFile = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());
        File file = new File("Filename" + idForTxtFile);

        try {
            FileWriter fw = new FileWriter(file, true);

            //if you want to write the linesperator ("\n) as they are in the txt you should use the following Code:

            String lineSeparator = System.getProperty("line.separator");
            String[] output = info.split("\n");

            for (int i = 0; i <= output.length-1; i++) {
                fw.write(output[i]);
                fw.write(lineSeparator);
            }

            //instead you could only use:
            fw.write(info);

            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//i[@class='icon navigation-icon-basket']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         driver.findElement(By.xpath("//body//button[2]//*[local-name()='svg']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//i[@class='i-trash']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//button[@class='btn-item btn-remove']")).click();

     }



}