package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumClass06 {
    @Test
    public void test01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("http://www.amazon.com");
        String title=driver.getTitle();

        if (title.contains("Books")){
            System.out.println("title = " + title);


        }else{
            System.out.println("titleyoktur = " + title);

        }
        Assert.assertTrue(title.contains("Spend"));
    }
    @Test
    public void test03(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("http://www.amazon.com");
        String title=driver.getTitle();

        Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");

    }

    @Test
    public void test04(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

        driver.get("http://amazon.com");


    }
}
