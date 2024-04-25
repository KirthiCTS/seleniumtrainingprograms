package seleniumbasicprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesExample {

	public static void main(String[] args) throws InterruptedException {

		
		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("windowButton")).click();
		
		Thread.sleep(2000);
		
		String mainWindowHandle = driver.getWindowHandle();
		
		Set<String > allWindowHandles = driver.getWindowHandles();
		
		
		Iterator<String> iter = allWindowHandles.iterator();
		
		while(iter.hasNext()) {
			
				String childWindow = iter.next();
				System.out.println(childWindow);
				
				if(!mainWindowHandle.equalsIgnoreCase(childWindow)) {
					
					driver.switchTo().window(childWindow);
					String text = driver.findElement(By.id("sampleHeading")).getText();
					System.out.println(text);
				}
			
			
		}
		
		driver.switchTo().defaultContent();
	//	driver.close();
		driver.quit();
		
		
		
		
	}

}
