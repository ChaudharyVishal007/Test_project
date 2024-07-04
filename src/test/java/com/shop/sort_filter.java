package com.shop;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class sort_filter {

	public static void main(String[] args) throws InterruptedException{

	WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("https://shop.larsonjuhl.com/en-US/");
		driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id =\"email\"]")).sendKeys("ashishdhiman@sourcemash.com");
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[@class=\"input-text\"])[2]")).sendKeys("Test@1234");
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@Type=\"submit\"]")).click();		 
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id =\"search\"]")).sendKeys("academie"); 
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

// Sort
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
List<WebElement> item_price = driver.findElements(By.xpath("//span[@class ='prices']"));
String[] item = new String[item_price.size()];
  for(int i=0; i<item_price.size(); ++i) {
	  
String price=  item_price.get(i).getText(); 
item [i]=price;
System.out.println("item price= "+     price);
  }	
		
		Arrays.sort(item);
		System.out.println(Arrays.toString(item));
		
		Thread.sleep(5000);
		
		Select price_sort = new Select(driver.findElement(By.xpath("//*[@class=\"sorter-options\"]")));
		price_sort.selectByVisibleText("Price");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		List<WebElement> item_sorted_price = driver.findElements(By.xpath("//span[@class =\"prices\"]"));
		String[] item_sorted = new String[item_sorted_price.size()];
		  for(int j=0; j<item_sorted_price.size(); j++) {
			
	  String new_price=  item_sorted_price.get(j).getText(); 
        item_sorted[j]=new_price;
	System.out.println("item_sorted_price= " +   new_price);
	}
		  
		  boolean arraysEqual = Arrays.equals(item, item_sorted);
	        if (arraysEqual) {
	            System.out.println("Test Passed: Sort By price is working fine");
	        } else {
	            System.out.println("Test Failed: Sort By price is not working.");
	    
	        // Filters
	            
	            
	        
	        
	        }
	}
}

