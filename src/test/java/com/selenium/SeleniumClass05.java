package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumClass05 {
    @Test
    public void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("https://the-internet.herokuapp.com/");
        WebElement isDis=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[13]/a"));
        boolean gorunurMu=isDis.isDisplayed();
        System.out.println("gorunurMu = " + gorunurMu);
        isDis.click();


        boolean gorunurMu1=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/h4[1]")).isDisplayed();

        System.out.println("gorunurMu1 = " + gorunurMu1);

        WebElement checkBox=driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input"));
        checkBox.click();
        boolean seciliMi=checkBox.isSelected();
        System.out.println("seciliMi = " + seciliMi);

        checkBox.click();
        Thread.sleep(4000);
      seciliMi=checkBox.isSelected();

        System.out.println("seciliMi1 = " + seciliMi);



        
}}
