package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumClass07 {
    @Test
    public void test01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
        driver.get("http://www.amazon.com");
        WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Books");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java"+ Keys.ENTER);

        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
                WebElement backTo=driver.findElement(By.id("breadcrumb-back-link"));
                String string=backTo.getText();

        boolean gormek=backTo.isDisplayed();
        System.out.println("gormek = " + gormek);
        Assert.assertEquals(string,"Back to");

    }
}
