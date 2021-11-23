package com.seleniumreviewproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium01 {
    @Test
    public void test01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("https:/www.google.com");

        driver.navigate().back();
        driver.navigate().to("https:/www.facebook.com");

        //driver.navigate().forward();

        driver.navigate().refresh();
        driver.quit();
        driver.close();
    }
}
