package seleniumbasicprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtonExample {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		
		Thread.sleep(2000);
		
		if(driver.findElement(By.id("noRadio")).isEnabled())
			System.out.println("No button is enabled");
		else
			System.out.println("No button is disabled");

		
		
	}

}
