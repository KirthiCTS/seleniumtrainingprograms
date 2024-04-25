package seleniumbasicprograms;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.flipkart.com/");
		
	//	driver.get("https://demo.automationtesting.in/Static.html");
		
		driver.get("https://onecognizant.cognizant.com/Home");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		//Sendkeys
		
/*		WebElement search = driver.findElement(By.name("q"));
			
		Actions actions = new Actions(driver);
		actions.sendKeys(search, "Watches");
		actions.sendKeys(search, Keys.ENTER);
		
		actions.perform();
		
		*/
		//Hover and click
		
/*		WebElement element = driver.findElement(By.linkText("Grocery"));
		new Actions(driver)
			.moveToElement(element)
			.click(element)
			.perform();
		
		*/
		
		
/*		WebElement srcElement = driver.findElement(By.id("node"));
		WebElement targetElement = driver.findElement(By.id("droparea"));
		
		
		new Actions(driver)
			.pause(Duration.ofSeconds(3))
			.dragAndDrop(srcElement, targetElement)
			.perform();
			
			*/
		
		
/*		WebElement myCareer = driver.findElement(By.xpath("//div[contains(text(),'MyCareer')]"));
		
		new Actions(driver)
			.scrollToElement(myCareer)
			.perform();
		
		*/
		
/*		WebElement myCareer = driver.findElement(By.xpath("//div[contains(text(),'MyCareer')]"));
		int coordinates = myCareer.getRect().y;
		
		new Actions(driver)
		.scrollByAmount(0, coordinates)
		.perform();
		
		
		
		*/
		
	/*	WebElement myToDo = driver.findElement(By.partialLinkText("My To-do's"));
		
		new Actions(driver)
			.contextClick(myToDo)
			.perform();
			*/
		
		
	/*	WebElement myToDo = driver.findElement(By.partialLinkText("My To-do's"));
		
		new Actions(driver)
			.doubleClick(myToDo)
			.perform();
			
			*/
		

		
		
		
		
		
		
		
		
		

		
	}

}
