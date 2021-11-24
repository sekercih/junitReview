package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumClass03 {
static WebDriver driver;
@BeforeClass

    public static void deneme(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


    }
    @Test
    public void test02(){
        driver.get("https://demoqa.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.findElement(By.xpath("//*[h5='Elements']")).click();
        driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();

        List<WebElement> formText=driver.findElements(By.id("userForm"));

        for (WebElement w:formText
             ) {
            System.out.println("w = " + w.getText());

        }

        driver.findElement(By.cssSelector("#userName")).sendKeys("Ali");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("Ali@gmail.com");
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("gel sokak git cad kore");
        driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("gel sokak git cad kore");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.findElement(By.cssSelector("#submit")).click();
        List<WebElement> tumList=driver.findElements(By.xpath("//p"));
        for (WebElement w:tumList
             ) {
            System.out.println("w.getText() = " + w.getText());
            
        }
    }
}
