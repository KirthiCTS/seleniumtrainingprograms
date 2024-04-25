package seleniumbasicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Examples {

	public static void main(String[] args) throws InterruptedException {

		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement frameElement = driver.findElement(By.id("frame1"));
		
		//driver.switchTo().frame(frameElement);
		
		driver.switchTo().frame("frame1");
		String sampleHeading = driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println(sampleHeading);
		
		driver.switchTo().parentFrame();
		
		
		
	}

}
