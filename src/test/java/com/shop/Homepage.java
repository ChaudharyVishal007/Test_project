package com.shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Homepage extends BaseClass    {
//	public  static final String COOKIE = "//button[@id=\"btn-cookie-allow\"]";
	//private static final String CloseInformation = "//button[@class = 'action-close']";
//	private static final String Banner = "//img[contains(@class, 'banner_adjustment')]";
//	private static final String CarasouelButton ="//div[@class = 'owl-dots']";
 //   private static final String AldenBanner = "//span[@class ='best-blacks']";
 //   private static final String Newsletter = "//a[@class = 'moulding-moment-image']";
 //   private static final String NextSlider = "(//div[@class ='owl-next'])[2]";
//    private static final String FramerReadMore ="//a[@class ='action primary']"	;			


 @Test(priority = 2)
	 public void closeInformation() throws InterruptedException { 

	 WebElement close = driver.findElement(By.xpath("(//button[@class= 'action-close'])[2]"));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	 wait.until(ExpectedConditions.elementToBeClickable(close)).click();    
		}
 
 @Test(priority = 3)
	public void banner() throws InterruptedException {
	 WebElement banner = driver.findElement(By.xpath("//img[contains(@class, 'banner_adjustment') and @alt='May_FYFD_Banner']"));
     Assert.assertTrue(banner.isDisplayed() && banner.isEnabled(), "Banner is not displayed or enabled.");

     banner.click();
     String expectedTitle = "May FYFD Banner";
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     wait.until(ExpectedConditions.titleContains(expectedTitle));

     String actualTitle = driver.getTitle();
     System.out.println("Current Page Title: " + actualTitle);
     Assert.assertEquals(actualTitle, expectedTitle, "Page title doesn't match expected.");
} 
 }  

	


