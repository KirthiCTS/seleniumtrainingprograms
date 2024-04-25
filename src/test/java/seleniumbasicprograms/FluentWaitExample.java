package seleniumbasicprograms;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExample {

	public static void main(String[] args) {

		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://onecognizant.cognizant.com/Home"); 
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
										 .pollingEvery(Duration.ofSeconds(1))
										 .ignoring(NoSuchElementException.class)
										 .withTimeout(Duration.ofSeconds(5));
		
		
		WebElement myToDo = driver.findElement(By.partialLinkText("My To-do's"));
		
		wait.until(ExpectedConditions.elementToBeClickable(myToDo));
		
		if(myToDo.isDisplayed())
			System.out.println("Displayed");
		else
			System.out.println("Not Displayed");
		

	}

}
