package com.shop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LJ_customer_form extends BaseClass {
	@Test(priority = 1)
	public void CustomLead() throws InterruptedException {
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

		driver.navigate().to("https://mcstg.larsonjuhl.com/en-CA/newaccount");

		Thread.sleep(2000);
		WebElement cookie1 = driver.findElement(By.xpath("//button[@id ='btn-cookie-allow']"));
		cookie1.click();

		WebElement preCustomercan = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[2]/div/div[2]/label"));
		preCustomercan.click();

		WebElement CanBusinessName = driver.findElement(By.xpath("//*[@id = 'companyname']"));
		CanBusinessName.sendKeys("Test lead by SM");

		WebElement CanStreetAddress = driver.findElement(By.xpath("//*[@id = 'address1_line1']"));
		CanStreetAddress.sendKeys("123 Main Street");

		WebElement CanCity = driver.findElement(By.xpath("//*[@id = 'address1_city']"));
		CanCity.sendKeys("Apartment 4B ");

		Select Province = new Select(driver.findElement(By.xpath("//*[@id ='address1_stateorprovince']")));
		Province.selectByVisibleText("Ontario");

		WebElement PostalCode = driver.findElement(By.xpath("//*[@id = 'address1_postalcode']"));
		PostalCode.sendKeys("M1H 3A4");

		WebElement CanBusinessTelephone = driver.findElement(By.xpath("//*[@id = 'telephone1']"));
		CanBusinessTelephone.sendKeys("1234567890");

		WebElement CanMoblieTelephone = driver.findElement(By.xpath("//*[@id = 'mobilephone']"));
		CanMoblieTelephone.sendKeys("1234567890");

		WebElement CanEmailAddress = driver.findElement(By.xpath("//*[@id = 'emailaddress1']"));
		CanEmailAddress.sendKeys("animasharma@sourcemash.com");

		WebElement CanPrimaryFName = driver.findElement(By.xpath("	//*[@id = 'firstname']"));
		CanPrimaryFName.sendKeys("1234567890");

		WebElement CanPrimaryLName = driver.findElement(By.xpath("//*[@id = 'lastname']"));
		CanPrimaryLName.sendKeys("Test");

		WebElement CanAccountFName = driver.findElement(By.xpath("//*[@id = 'lj_payablecontactfirstname']"));
		CanAccountFName.sendKeys("Test");

		WebElement CanAccountLName = driver.findElement(By.xpath("//*[@id = 'lj_payablecontactlastname']"));
		CanAccountLName.sendKeys("Test");

		WebElement PST_HST = driver.findElement(By.xpath("//*[@id = 'lj_taxid']"));
		PST_HST.sendKeys("Test123");

		WebElement TaxCertificate1 = driver.findElement(By.xpath("//*[@id ='lj_resaletaxcertificatenumber']"));
		TaxCertificate1.sendKeys("Test123");

		WebElement browseButton1 = driver.findElement(By.xpath("//label[@id='input-label']/strong"));
		browseButton1.click();
		WebElement fileInput1 = driver.findElement(By.xpath("//input[@type='file']"));

//Set the file path in the input element using sendKeys
		String[] filePaths1 = {
				"C:\\Users\\vishalchaudhary\\Downloads\\Case Advanced Find View 3-27-2024 4-46-46 AM.xlsx",
				"C:\\Users\\vishalchaudhary\\Downloads\\Kyoto Price List US.pdf",
				"C:\\Users\\vishalchaudhary\\Downloads\\Pricing File CA(1).csv",
				"C:\\Users\\vishalchaudhary\\Downloads\\download11.jpeg",
				"C:\\Users\\vishalchaudhary\\Downloads\\order email july 4.png",
				"C:\\Users\\vishalchaudhary\\Downloads\\download.jpg" };

		// Upload each file
		for (String filePath : filePaths1) {
			fileInput1.sendKeys(filePath);
		}

		WebElement CanPaymentPref = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[23]/div/div[1]/label"));
		CanPaymentPref.click();

		WebElement CanRetailFaclity = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[27]/div/div[2]/label"));
		CanRetailFaclity.click();

		WebElement CanDayOpen = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[28]/div/div[1]/label"));
		CanDayOpen.click();
//*[@id="request-new-account"]/div[2]/div/div[28]/div/div[1]/label
		WebElement CanHoursOperation = driver.findElement(By.xpath("//*[@id = 'lj_hoursofoperation']"));
		CanHoursOperation.sendKeys("24");

		WebElement CanBusinessType = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[30]/div/div[1]/label"));
		CanBusinessType.click();

		WebElement CanOtherComment = driver.findElement(By.xpath("//*[@id = 'lj_ifotherpleaseexplain']"));
		CanOtherComment.sendKeys("Test lead from SM");

		WebElement CanProductInterest = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[32]/div/div[1]/label"));
		CanProductInterest.click();

		WebElement CanPlanOrderMoulding = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[33]/div/div[1]/label"));
		CanPlanOrderMoulding.click();

		Select CanAnnualSale = new Select(driver.findElement(By.xpath("//*[@id = 'lj_estimatedannualsales']")));
		CanAnnualSale.selectByVisibleText("$0 - $74K");

		WebElement CanAverageOrder = driver.findElement(By.xpath("//*[@id = 'lj_youraverageordervalue']"));
		CanAverageOrder.sendKeys("34");

		WebElement CanPrimaryGoal12Months = driver
				.findElement(By.xpath("//*[@id = 'lj_whatisyourprimarybusinessgoalforthenext12']"));
		CanPrimaryGoal12Months.sendKeys("Test Lead from SM");

		WebElement CanNewToIndustry = driver
				.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[37]/div/div[2]/label"));
		CanNewToIndustry.click();

		WebElement CanSubmitForm = driver
				.findElement(By.xpath("//button[@class = 'accountsubmitajax action save primary next-btn']"));
		CanSubmitForm.click();

		Thread.sleep(4000);

		WebElement CanSuggestedAddress = driver.findElement(By.xpath("//*[@id='suggested_addr_val']"));
		CanSuggestedAddress.click();
		Thread.sleep(4000);
		WebElement CanConfirmInformation = driver.findElement(By.xpath("//button[@class ='action primary confirm']"));
		CanConfirmInformation.click();

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		WebElement CanSubmitForm2 = driver
				.findElement(By.xpath("//button[@class = 'accountsubmitajax action save primary next-btn']"));
		CanSubmitForm2.click();
		Thread.sleep(5000);
		String CanFormSubmitUrl = "https://mcstg.larsonjuhl.com/en-CA/new-account-success";
		String CanCurrentUrl = driver.getCurrentUrl();
		Assert.assertEquals(CanFormSubmitUrl, CanCurrentUrl);
		System.out.println("Current URL after form submission: " + CanCurrentUrl);
		Thread.sleep(5000);
	}
}