package com.shop;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_Form {
	private WebDriver driver;
	
	@BeforeAll
	public static void SetupAll() {
	WebDriverManager.chromedriver().setup();
	}
	@BeforeEach
	public static void Setup() {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		}
	@Test
	public void CustomLead() throws InterruptedException {
		driver.get("https://mcqa-shop.larsonjuhl.com/en-US/customer/account/login");
		Thread.sleep(2000);
		WebElement cookie = driver.findElement(By.xpath("//button[@id ='btn-cookie-allow']"));
		cookie.click();

		Thread.sleep(2000);
		WebElement NewAccount = driver
				.findElement(By.xpath("//span[text()='Become a Larson-Juhl customer']"));
		NewAccount.click();

		WebElement preCustomer = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[2]/div/div[2]/label"));
		preCustomer.click();

		WebElement BusinessName = driver.findElement(By.xpath("//*[@id = 'companyname']"));
		BusinessName.sendKeys("Test lead by SM");

		WebElement StreetAddress = driver.findElement(By.xpath("//*[@id = 'address1_line1']"));
		StreetAddress.sendKeys("869 HOPPE CENTER");

		WebElement City = driver.findElement(By.xpath("//*[@id = 'address1_city']"));
		City.sendKeys("NIENOWHAVEN, ");

		WebElement State = driver.findElement(By.xpath("//*[@id = 'address1_stateorprovince']"));
		State.sendKeys("NORTH DAKOTA");

		WebElement ZipCode = driver.findElement(By.xpath("//*[@id = 'address1_postalcode']"));
		ZipCode.sendKeys("58501");

		WebElement BusinessTelephone = driver.findElement(By.xpath("//*[@id = 'telephone1']"));
		BusinessTelephone.sendKeys("1234567890");

		WebElement MoblieTelephone = driver.findElement(By.xpath("//*[@id = 'mobilephone']"));
		MoblieTelephone.sendKeys("1234567890");

		WebElement EmailAddress = driver.findElement(By.xpath("//*[@id = 'emailaddress1']"));
		EmailAddress.sendKeys("animasharma@sourcemash.com");

		WebElement PrimaryFName = driver.findElement(By.xpath("	//*[@id = 'firstname']"));
		PrimaryFName.sendKeys("Test");

		WebElement PrimaryLName = driver.findElement(By.xpath("//*[@id = 'lastname']"));
		PrimaryLName.sendKeys("qa");

		WebElement AccountFName = driver.findElement(By.xpath("//*[@id = 'lj_payablecontactfirstname']"));
		AccountFName.sendKeys("Test");

		WebElement AccountLName = driver.findElement(By.xpath("//*[@id = 'lj_payablecontactlastname']"));
		AccountLName.sendKeys("qa");

		WebElement TaxId = driver.findElement(By.xpath("//*[@id = 'lj_taxid']"));
		TaxId.sendKeys("Test123");

		WebElement TaxCertificate = driver.findElement(By.xpath("//*[@id ='lj_resaletaxcertificatenumber']"));
		TaxCertificate.sendKeys("Test123");

		WebElement browseButton = driver.findElement(By.xpath("//label[@id='input-label']/strong"));
		browseButton.click();
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));

		// Set the file path in the input element using sendKeys
		String[] filePaths = {
				"C:\\Users\\vishalchaudhary\\Downloads\\Case Advanced Find View 3-27-2024 4-46-46 AM.xlsx",
				"C:\\Users\\vishalchaudhary\\Downloads\\Kyoto Price List US.pdf",
				"C:\\Users\\vishalchaudhary\\Downloads\\Pricing File CA(1).csv",
				"C:\\Users\\vishalchaudhary\\Downloads\\download11.jpeg",
				"C:\\Users\\vishalchaudhary\\Downloads\\order email july 4.png",
				"C:\\Users\\vishalchaudhary\\Downloads\\download.jpg" };

		for (String filePath : filePaths) {
			fileInput.sendKeys(filePath);
		}

		WebElement PaymentPref = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[23]/div/div[1]/label"));
		PaymentPref.click();

		WebElement RetailFaclity = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[27]/div/div[2]/label"));
		RetailFaclity.click();

		WebElement DayOpen = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[28]/div/div[1]/label"));
		DayOpen.click();

		WebElement HoursOperation = driver.findElement(By.xpath("//*[@id = 'lj_hoursofoperation']"));
		HoursOperation.sendKeys("24");

		WebElement BusinessType = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[30]/div/div[1]/label"));
		BusinessType.click();

		WebElement OtherComment = driver.findElement(By.xpath("//*[@id = 'lj_ifotherpleaseexplain']"));
		OtherComment.sendKeys("Test lead from SM");

		WebElement ProductInterest = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[32]/div/div[1]/label"));
		ProductInterest.click();

		WebElement PlanOrderMoulding = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[33]/div/div[1]/label"));
		PlanOrderMoulding.click();

		Select AnnualSale = new Select(driver.findElement(By.xpath("//*[@id = 'lj_estimatedannualsales']")));
		AnnualSale.selectByVisibleText("$0 - $74K");

		WebElement AverageOrder = driver.findElement(By.xpath("//*[@id = 'lj_youraverageordervalue']"));
		AverageOrder.sendKeys("34");

		WebElement PrimaryGoal12Months = driver
				.findElement(By.xpath("//*[@id = 'lj_whatisyourprimarybusinessgoalforthenext12']"));
		PrimaryGoal12Months.sendKeys("Test Lead from SM");

		WebElement NewToIndustry = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[37]/div/div[2]/label"));
		NewToIndustry.click();

		WebElement SubmitForm = driver
				.findElement(By.xpath("//button[@class = 'accountsubmitajax action save primary next-btn']"));
		SubmitForm.click();

		Thread.sleep(4000);

		WebElement SuggestedAddress = driver.findElement(By.xpath("//*[@id='suggested_addr_val']"));
		SuggestedAddress.click();
		Thread.sleep(4000);
		WebElement ConfirmInformation = driver.findElement(By.xpath("//button[@class ='action primary confirm']"));
		ConfirmInformation.click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(3000);

		WebElement SubmitForm2 = driver
				.findElement(By.xpath("//button[@class = 'accountsubmitajax action save primary next-btn']"));
		SubmitForm2.click();

		Thread.sleep(5000);
		String FormSubmitUrl = "https://larsonjuhl.com/en-US/new-account-success";
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(FormSubmitUrl, currentUrl);
		System.out.println("Current URL after form submission: " + currentUrl);
		Thread.sleep(5000);
	}
}
