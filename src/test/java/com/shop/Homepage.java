package com.shop;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homepage extends BaseClass {

	private LoginPage loginPage;

	@BeforeClass
	public void setup() {
		loginPage = new LoginPage();
//		loginPage.login("anitamehra@sourcemash.com", "Test@123"); // Ensure user is logged in
	}

	@Test(priority = 1)
	public void banner() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement banner = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//img[contains(@class, 'banner_adjustment') and @alt='kyoto']")));

		banner.click();
		System.out.println("Banner is clickable");

		Thread.sleep(5000); // Consider using WebDriverWait instead of Thread.sleep
		String expectedURL = "https://mcqa-shop.larsonjuhl.com/en-US/moulding.html?collection_type=28516";
		String originalURL = driver.getCurrentUrl();
		Assert.assertEquals(originalURL, expectedURL);
		System.out.println("Banner URL: " + originalURL);
	}

	@Test(priority = 2)
	public void verifyLogoAndClick() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='lj-logo']")));
		Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the homepage.");
		logo.click();

		wait.until(ExpectedConditions.urlContains("/en-US"));
		System.out.println("Clicked on the logo and navigated to the homepage.");
	}

	@Test(priority = 3)
	public void contentBlock() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement artiqueBlock = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='artique-linen']")));

		artiqueBlock.click();
		System.out.println("Artique block is clickable");
		Thread.sleep(4000); // Again, consider replacing with WebDriverWait if possible
	}
}
