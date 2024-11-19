package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    public static String takeScreenshot(WebDriver driver, String screenshotName) {
        // Verify if driver instance implements TakesScreenshot
        if (!(driver instanceof TakesScreenshot)) {
            throw new IllegalArgumentException("WebDriver instance does not support screenshots.");
        }

        // Capture screenshot as base64
        String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

        // Capture screenshot as file
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
        String screenshotFileName = screenshotName + "_" + timestamp + ".png";

        // Create a screenshot directory if not exists
        Path screenshotPath = Paths.get("screenshots");
        if (!Files.exists(screenshotPath)) {
            try {
                Files.createDirectory(screenshotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Store screenshot at the specified location
        String screenshotFilePath = screenshotPath.resolve(screenshotFileName).toString();
        try {
            FileHandler.copy(screenshotFile, new File(screenshotFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return base64Screenshot; // Return base64 screenshot for further use if needed
    }

    public static void main(String[] args) {
        // Example usage
        // Replace with actual WebDriver setup and URL
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");
        String base64Screenshot = takeScreenshot(driver, "example_test");
        System.out.println("Base64 Screenshot: " + base64Screenshot);
        driver.quit();
    }
}
