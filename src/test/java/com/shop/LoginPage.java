package com.shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {

	@Test(priority =0)
	public void TestLoginFunctioanlity() {
		
		WebElement cookie = driver.findElement(By.xpath("//button[@id ='btn-cookie-allow']"));
		cookie.click();
		
	WebElement email	= driver.findElement(By.xpath("//*[@id='email']"))	;
	WebElement pass = driver.findElement(By.xpath("(//*[@class='input-text'])[2]"));
	   
	if(email.isDisplayed() && email.isEnabled() )   {	
		email.sendKeys("shahilsharma@sourcemash.com");
	}
	   if(pass.isDisplayed() && pass.isEnabled()) {
		      pass.sendKeys("Test@123");
		      
		      WebElement SignIn= driver.findElement(By.xpath("//button[@class = 'action login primary']"))	;
		SignIn.click();
	
		System.out.println("Login is working fine");} 	
	}
	
	
	////*[@id = 'lj_reviouscustomer-1']
}