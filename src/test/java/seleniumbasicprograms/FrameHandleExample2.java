package seleniumbasicprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandleExample2 {

	public static void main(String[] args) throws InterruptedException {

		
		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> frameElements = driver.findElements(By.tagName("iframe"));
		System.out.println(frameElements.size());
		
		
		WebElement frameElement = driver.findElement(By.name("globalSqa"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("(//div[@class='pic_holder'])[1]")).click();
		
	}

}
