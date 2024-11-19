package test_java;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class java_practice {
	
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver1.exe");
        ChromeOptions  options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
			driver.manage().window().maximize();
			WebElement fileInput = driver.findElement(By.id("picture"));
			String filePath ="C://Users//vishalchaudhary//Downloads//Case Advanced Find View 3-27-2024 4-46-46 AM.xlsx";
			File f = new File(filePath);
			fileInput.sendKeys(f.getAbsolutePath());
			System.out.println("File is uploaded");
			
	}

}
