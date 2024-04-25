package seleniumbasicprograms;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://onecognizant.cognizant.com/Home"); 
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement myToDo = driver.findElement(By.partialLinkText("My To-do's"));
		
		wait.until(ExpectedConditions.visibilityOf(myToDo));
		
		if(myToDo.isDisplayed())
			System.out.println("My To-Do is displayed");
		else
			System.out.println("My To-Do is not displayed");
		
		
	}

}
