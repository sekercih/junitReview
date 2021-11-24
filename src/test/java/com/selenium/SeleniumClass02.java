package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public  class  SeleniumClass02 {

   static WebDriver driver;

    @Test
    public static   void test02(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("https:/www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
                aramaKutusu.sendKeys("baby stor"+ Keys.ENTER);

                WebElement ikinciSira=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
                ikinciSira.click();

                WebElement urun=driver.findElement(By.id("productTitle"));
                String urunIsmi=urun.getText();
                WebElement ortalamaPuan= driver.findElement(By.id("acrCustomerReviewText"));
                String puan=ortalamaPuan.getText();
                WebElement fiyat=driver.findElement(By.xpath("(//span[@class='a-offscreen'])[1]"));
                WebElement fiyat2=driver.findElement(By.xpath("(//span[@class='a-offscreen'])[2]"));
                String enDusuk= fiyat.getText();
                String enYuksek=fiyat2.getText();

        System.out.println("urunIsmi = " + urunIsmi);
        System.out.println("puan = " + puan);
        System.out.println("enYuksek = " + enYuksek);
        System.out.println("enDusuk = " + enDusuk);





    }
    @Test
    public void test2(){
        //WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
      //  driver.get("https://www.google.com/search?q=bebek+arabasi");
        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Bebek arabasi"+Keys.ENTER);



    }
}
