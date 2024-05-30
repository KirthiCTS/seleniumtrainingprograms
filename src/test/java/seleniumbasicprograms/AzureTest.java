package seleniumbasicprograms;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AzureTest {
	
	@Test
	public void azureTestExecution() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		List<WebElement> listObj = driver.findElements(By.xpath("//span[text()='Groceryxxx']"));
		
		if(listObj.size() == 0)
			System.out.println("Element is not displayed");
		else
			System.out.println("Element is  displayed");
		
		
		driver.quit();

	}

}
