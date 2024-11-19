package com.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    public WebElement element;
    public WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        String baseUrl = "https://mcqa-shop.larsonjuhl.com/en-US";    
        System.out.println("Launching Website in browser");
        
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // Verify page title
        String testTitle = "Customer Login";
        String originalTitle = driver.getTitle();
        System.out.println(originalTitle);
        Assert.assertEquals(originalTitle, testTitle);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
        System.out.println("Finished Test On Chrome Browser");
    }
}
