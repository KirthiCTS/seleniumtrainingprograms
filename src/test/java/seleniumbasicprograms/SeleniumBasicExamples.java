package seleniumbasicprograms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumBasicExamples {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.className("Pke_EE")).sendKeys("iPhone");
	//	driver.findElement(By.className("Pke_EE")).sendKeys(Keys.ENTER);
		
	//	WebElement element = driver.findElement(By.xpath("//span[text()='Mobiles']"));
	//	element.click();
		
		
//	String title = driver.findElement(By.className("Pke_EE")).getAttribute("title");
//	System.out.println(title);
	
	
	//	System.out.println("*** GET CURRENT URL ***"+driver.getCurrentUrl());
		
	//	System.out.println("*** GET PAGE SOURCE ***"+driver.getPageSource());
		
		//WebElement groceryElement = driver.findElement(By.xpath("//span[text()='Grocery']"));
		
		
		List<WebElement> listObj = driver.findElements(By.xpath("//span[text()='Groceryxxx']"));
		
		if(listObj.size() == 0)
			System.out.println("Element is not displayed");
		else
			System.out.println("Element is  displayed");
		
		
		
	/*	WebElement groceryElement = driver.findElement(By.xpath("//span[text()='Groceryxxx']"));
		
		if(groceryElement.isDisplayed()) {
			
			System.out.println("Grocery is displayed");
			
		}
		else {
			
			System.out.println("Grocery is not displayed");
			
		}
		*/
		
		
		
		
//		List<WebElement>  listObj = driver.findElements(By.tagName("a"));
		
//		System.out.println(listObj.size());
		
/*		for(int i=0 ; i < listObj.size(); i++) {
			
			
			String linkNames = listObj.get(i).getText();
			System.out.println(linkNames);
			
		}
		*/
		
/*		for(WebElement element : listObj) {
			
			
			if(element.getText().trim().contains("Samsung TV"))
			{
				element.click();
				break;
			}
				
				
				//System.out.println(element.getText());
		}
		*/
		
		
		
		
		
		
	}

}
