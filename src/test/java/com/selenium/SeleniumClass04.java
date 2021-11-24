package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumClass04 {
    @Test
    public void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("https://www.amazon.com");

        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropdown);

        List<WebElement> tumDropdown = select.getOptions();

        for (WebElement w : tumDropdown
        ) {
            System.out.println("w.getText() = " + w.getText());

        }
        select.selectByVisibleText("Books");

        Thread.sleep(1000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Javascript" + Keys.ENTER);

        Thread.sleep(3000);


    }
}
