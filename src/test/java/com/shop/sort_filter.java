package com.shop;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sort_filter {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver1.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://mcstg-shop.larsonjuhl.com/en-US/matboards/artique.html");
        driver.manage().window().maximize();
     
        WebElement cookie = driver.findElement(By.xpath("//button[@id ='btn-cookie-allow']"));
		cookie.click();
		Thread.sleep(3000);
        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        WebElement pass = driver.findElement(By.xpath("(//*[@class='input-text'])[2]"));

        if (email.isDisplayed() && email.isEnabled()) {
            email.sendKeys("Shahilsharma@sourcemash.com");
        }
        if (pass.isDisplayed() && pass.isEnabled()) {
            pass.sendKeys("Test@123");
        }
            WebElement signIn = driver.findElement(By.xpath("//*[@id= 'send2']"));
            signIn.click();
        // Capture initial prices
            Thread.sleep(3000);
        List<WebElement> itemPriceElements = driver.findElements(By.xpath("//span[@class ='prices']"));
        String[] initialPrices = new String[itemPriceElements.size()];
        for (int i = 0; i < itemPriceElements.size(); i++) {
            String price = itemPriceElements.get(i).getText();
            initialPrices[i] = price;
            System.out.println("Item price = " + price);
        }

        // Sort initial prices
        Arrays.sort(initialPrices);
        System.out.println("Sorted initial prices: " + Arrays.toString(initialPrices));

        // Select "Price" from Sort By dropdown
        Select sortByDropdown = new Select(driver.findElement(By.xpath("//*[@class='sorter-options']")));
        sortByDropdown.selectByVisibleText("Price");

        // Wait for items to be sorted
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class ='prices']")));

        // Capture sorted prices
        List<WebElement> sortedPriceElements = driver.findElements(By.xpath("//span[@class ='prices']"));
        String[] sortedPrices = new String[sortedPriceElements.size()];
        for (int j = 0; j < sortedPriceElements.size(); j++) {
            String price = sortedPriceElements.get(j).getText();
            sortedPrices[j] = price;
            System.out.println("Sorted item price = " + price);
        }

        // Verify if the items are sorted correctly by price
        boolean arraysEqual = Arrays.equals(initialPrices, sortedPrices);
        if (arraysEqual) {
            System.out.println("Test Passed: Sort By price is working fine");
        } else {
            System.out.println("Test Failed: Sort By price is not working.");
        }

        // Close the browser
    }
    }
    

