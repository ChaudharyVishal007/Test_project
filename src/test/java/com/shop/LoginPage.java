package com.shop;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass{

	
	@Test(priority = 0)
	public void CustomLead() throws InterruptedException {	
				
		
		Thread.sleep(2000);
		WebElement cookie = driver.findElement(By.xpath("//button[@id ='btn-cookie-allow']"));
		cookie.click();
		
		Thread.sleep(2000);
		WebElement NewAccount= driver.findElement(By.xpath("//a[@href = 'https://www.larsonjuhl.com/en-US/newaccount']"));
		NewAccount.click();
		
		
		
		WebElement preCustomer = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[2]/div/div[2]/label"));
		preCustomer.click();
		
		/*	WebElement PreCustomer = driver.findElement(By.xpath("//*[@id = 'lj_previouscustomer-0']"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.elementToBeClickable(PreCustomer)).click();  */
	
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
	EmailAddress.sendKeys("test@gmail.com");
	
	WebElement PrimaryFName = driver.findElement(By.xpath("	//*[@id = 'firstname']"));
	PrimaryFName.sendKeys("1234567890");
	
	WebElement PrimaryLName = driver.findElement(By.xpath("//*[@id = 'lastname']"));
	PrimaryLName.sendKeys("Test");
	
	WebElement AccountFName = driver.findElement(By.xpath("//*[@id = 'lj_payablecontactfirstname']"));
	AccountFName.sendKeys("Test");
	
	WebElement AccountLName = driver.findElement(By.xpath("//*[@id = 'lj_payablecontactlastname']"));
	AccountLName.sendKeys("Test");
	
	WebElement TaxId = driver.findElement(By.xpath("//*[@id = 'lj_taxid']"));
	TaxId.sendKeys("Test123");
		
	WebElement PaymentPref = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[23]/div/div[1]/label"));
	PaymentPref.click();
	
	WebElement RetailFaclity = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[27]/div/div[2]/label"));
	RetailFaclity.click();
	
	WebElement DayOpen = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[28]/div/div[1]/label"));
	DayOpen.click();
	//*[@id="request-new-account"]/div[2]/div/div[28]/div/div[1]/label
	WebElement HoursOperation = driver.findElement(By.xpath("//*[@id = 'lj_hoursofoperation']"));
	HoursOperation.sendKeys("24");
	
	WebElement BusinessType = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[30]/div/div[1]/label"));
	BusinessType.click();
	
	WebElement OtherComment = driver.findElement(By.xpath("//*[@id = 'lj_ifotherpleaseexplain']"));
	OtherComment.sendKeys("Test lead from SM");
	
	WebElement ProductInterest = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[32]/div/div[1]/label"));
	ProductInterest.click();
	
	WebElement PlanOrderMoulding = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[33]/div/div[1]/label"));
	PlanOrderMoulding.click();
	
	Select AnnualSale = new Select(driver.findElement(By.xpath("//*[@id = 'lj_estimatedannualsales']")));
	AnnualSale.selectByVisibleText("$0 - $74K");
	
	
	WebElement AverageOrder = driver.findElement(By.xpath("//*[@id = 'lj_youraverageordervalue']"));
	AverageOrder.sendKeys("34");
	
	WebElement PrimaryGoal12Months = driver.findElement(By.xpath("//*[@id = 'lj_whatisyourprimarybusinessgoalforthenext12']"));
	PrimaryGoal12Months.sendKeys("Test Lead from SM");
	
	WebElement NewToIndustry = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[37]/div/div[2]/label"));
	NewToIndustry.click();
	
	WebElement SubmitForm = driver.findElement(By.xpath("//button[@class = 'accountsubmitajax action save primary next-btn']"));
	SubmitForm.click();
	
	Thread.sleep(10000);
	
	WebElement SuggestedAddress = driver.findElement(By.xpath("//*[@id='suggested_addr_val']"));
	SuggestedAddress.click();
	Thread.sleep(10000);
	WebElement ConfirmInformation = driver.findElement(By.xpath("//*[@id='html-body']/div[5]/aside[4]/div[2]/footer/button"));
	ConfirmInformation.click();
	Thread.sleep(10000);

	//button[@class ='action primary confirm']
	 WebElement SubmitForm2 = driver.findElement(By.xpath("//button[@class = 'accountsubmitajax action save primary next-btn']"));
		SubmitForm2.click();
	Thread.sleep(5000);
	}
/*	driver.navigate().to("https://mcqa.larsonjuhl.com/en-CA/newaccount");
	
	Thread.sleep(2000);
	WebElement cookie1 = driver.findElement(By.xpath("//button[@id ='btn-cookie-allow']"));
	cookie1.click();
	
	WebElement preCustomer1 = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[2]/div/div[2]/label"));
	preCustomer1.click();
	
	/*	WebElement PreCustomer = driver.findElement(By.xpath("//*[@id = 'lj_previouscustomer-0']"));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 wait.until(ExpectedConditions.elementToBeClickable(PreCustomer)).click();  */

/* WebElement BusinessName1 = driver.findElement(By.xpath("//*[@id = 'companyname']"));
BusinessName1.sendKeys("Test lead by SM");

WebElement StreetAddress1 = driver.findElement(By.xpath("//*[@id = 'address1_line1']"));
StreetAddress1.sendKeys("341 9 St E");
	
WebElement City1 = driver.findElement(By.xpath("//*[@id = 'address1_city']"));
City1.sendKeys("Brooks");

Select State1 = new Select(driver.findElement(By.xpath("//*[@id ='address1_stateorprovince']")));
State1.selectByVisibleText("Alberta");

WebElement Postalcode = driver.findElement(By.xpath("//*[@id = 'address1_postalcode']"));
Postalcode.sendKeys("T1R 1K6");

WebElement BusinessTelephone1 = driver.findElement(By.xpath("//*[@id = 'telephone1']"));
BusinessTelephone1.sendKeys("1234567890");

WebElement MoblieTelephone1 = driver.findElement(By.xpath("//*[@id = 'mobilephone']"));
MoblieTelephone1.sendKeys("1234567890");

WebElement EmailAddress1 = driver.findElement(By.xpath("//*[@id = 'emailaddress1']"));
EmailAddress1.sendKeys("test@gmail.com");

WebElement PrimaryFName1 = driver.findElement(By.xpath("	//*[@id = 'firstname']"));
PrimaryFName1.sendKeys("1234567890");

WebElement PrimaryLName1 = driver.findElement(By.xpath("//*[@id = 'lastname']"));
PrimaryLName1.sendKeys("Test");

WebElement AccountFName1 = driver.findElement(By.xpath("//*[@id = 'lj_payablecontactfirstname']"));
AccountFName1.sendKeys("Test");

WebElement AccountLName1= driver.findElement(By.xpath("//*[@id = 'lj_payablecontactlastname']"));
AccountLName1.sendKeys("Test");

WebElement TaxId1 = driver.findElement(By.xpath("//*[@id = 'lj_taxid']"));
TaxId1.sendKeys("Test123");
	
WebElement PaymentPref1= driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[23]/div/div[1]/label"));
PaymentPref1.click();

WebElement RetailFaclity1 = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[27]/div/div[2]/label"));
RetailFaclity1.click();

WebElement DayOpen1 = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[28]/div/div[1]/label"));
DayOpen1.click();
//*[@id="request-new-account"]/div[2]/div/div[28]/div/div[1]/label
WebElement HoursOperation1 = driver.findElement(By.xpath("//*[@id = 'lj_hoursofoperation']"));
HoursOperation1.sendKeys("24");

WebElement BusinessType1 = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[30]/div/div[1]/label"));
BusinessType1.click();

WebElement OtherComment1 = driver.findElement(By.xpath("//*[@id = 'lj_ifotherpleaseexplain']"));
OtherComment1.sendKeys("Test lead from SM");

WebElement ProductInterest1 = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[32]/div/div[1]/label"));
ProductInterest1.click();

WebElement PlanOrderMoulding1 = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[33]/div/div[1]/label"));
PlanOrderMoulding1.click();

Select AnnualSale1 = new Select(driver.findElement(By.xpath("//*[@id = 'lj_estimatedannualsales']")));
AnnualSale1.selectByVisibleText("$0 - $74K");


WebElement AverageOrder1 = driver.findElement(By.xpath("//*[@id = 'lj_youraverageordervalue']"));
AverageOrder1.sendKeys("34");

WebElement PrimaryGoal12Months1 = driver.findElement(By.xpath("//*[@id = 'lj_whatisyourprimarybusinessgoalforthenext12']"));
PrimaryGoal12Months1.sendKeys("Test Lead from SM");

WebElement NewToIndustry1 = driver.findElement(By.xpath("//*[@id=\"request-new-account\"]/div[2]/div/div[37]/div/div[2]/label"));
NewToIndustry1.click();

WebElement SubmitForm1 = driver.findElement(By.xpath("//button[@class = 'accountsubmitajax action save primary next-btn']"));
SubmitForm1.click();
	
Thread.sleep(10000);

	}
	*/
	
	
	public void TestLoginFunctioanlity() {
		
	WebElement email	= driver.findElement(By.xpath("//*[@id='email']"))	;
	WebElement pass = driver.findElement(By.xpath("(//*[@class='input-text'])[2]"));
	   
	if(email.isDisplayed() && email.isEnabled() )   {	
		email.sendKeys("anitamehra@sourcemash.com");
	}
	   if(pass.isDisplayed() && pass.isEnabled()) {
		      pass.sendKeys("Mind@123");
		      
		      WebElement SignIn= driver.findElement(By.xpath("//button[@class = 'action login primary']"))	;
		SignIn.click();
		} 	
	}
	
	
	////*[@id = 'lj_reviouscustomer-1']
}
