package seleniumbasicprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File filePath = new File("C:\\Users\\2270103\\OneDrive - Cognizant\\Documents\\screenshots\\flipkartpage.png");
		FileUtils.copyFile(srcFile, filePath);
		
	}

}
