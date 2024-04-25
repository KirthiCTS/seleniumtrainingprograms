package seleniumbasicprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[1]"));
		File srcFile = element.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\2270103\\OneDrive - Cognizant\\Documents\\screenshots\\grocery.png");
		FileUtils.copyFile(srcFile, destFile);

	}

}
