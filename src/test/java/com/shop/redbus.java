package com.shop;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		Thread.sleep(2000);

		driver.get("https://www.redbus.in/search?fromCityName=Chandigarh&fromCityId=833&srcCountry=IND&toCityName=Private%20Bus%20Stand,%20Manali&toCityId=204701&destCountry=IND&onward=21-Mar-2024&opId=0&busType=Any");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"button view-seats fr\"]")).click();	
		
		Thread.sleep(2000);
		WebElement seat = driver.findElement(By.xpath("//canvas[@data-type='lower']"));
		Dimension dimension = seat.getSize();
		int x = dimension.getWidth()/2;
		int y = dimension.getHeight()/2;
		int button_x = (x / 3)*2;
		int button_y = (y / 3)*2;
		Actions a = new Actions(driver);
		a.moveToElement(seat, button_x, button_y).click().perform();
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='button continue inactive']")).click();	
      
	}
	

}
