package com.shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class End_to_End_Flow extends LoginPage {
	@Test(priority = 1)
	public void closeInformation() throws InterruptedException {
		try {
			WebElement close = driver.findElement(By.xpath("(//button[@class= 'action-close'])[2]"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.elementToBeClickable(close)).click();
		} catch (Exception e) {
			System.out.println("----Information already close----");
		}
	}

	@Test(priority = 2)
	public void Product_MegaMenu() {

		WebElement product_menu = driver.findElement(By.xpath("//span[text()='Products']"));
		product_menu.click();

		System.out.println("----Product mega menu list is open----");

		Actions actions = new Actions(driver);
		WebElement woodMouldingMenu = driver.findElement(By.xpath("(//span[text()='Wood Moulding'])[1]"));
		actions.moveToElement(woodMouldingMenu).perform();

		WebElement moulding_frame = driver.findElement(By.xpath("(//span[text()='Frame'])[1]"));
		actions.moveToElement(moulding_frame).click().perform();
		System.out.println("----Frame moulding page is working and redirected to the page---- ");
	}

	@Test(priority = 3)
	public void PLP() throws InterruptedException {

		WebElement ViewProduct = driver.findElement(By.xpath("//*[@class='view_products']"));
		ViewProduct.click();
		System.out.println("product has been selected and redirected to PDP page");
	}

	@Test(priority = 4)
	public void PDP() throws InterruptedException {
		WebElement AddToCart = driver.findElement(By.id("product-addtocart-button"));
		AddToCart.click();
		System.out.println("item has been added on the cart");

		Actions actions = new Actions(driver);
		WebElement ViewCart = driver.findElement(By.xpath("//a[@class ='action showcart']"));
		actions.moveToElement(ViewCart).perform();
		Thread.sleep(3000);
		WebElement Cart_Checkout = driver.findElement(By.xpath("//button[@id ='top-cart-btn-checkout']"));
		actions.moveToElement(Cart_Checkout).click().perform();
		System.out.println("--procced to checkout is click and redirected to checkout page--- ");
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500);");
		WebElement PO = driver.findElement(By.xpath("(//*[@class ='input-text'])[3]"));
		PO.sendKeys("Test po");

		WebElement PlaceOrder = driver
				.findElement(By.xpath("//button[@class='action primary checkoutlj-btn btn-biscay']"));
		PlaceOrder.click();

		System.out.println("--Order is successfully placed--- ");
		Thread.sleep(5000);
	}
}
