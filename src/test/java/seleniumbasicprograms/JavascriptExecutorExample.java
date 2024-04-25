package seleniumbasicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExample {

	public static void main(String[] args) throws InterruptedException {

		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://onecognizant.cognizant.com/Home");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		//je.executeScript("window.scrollBy(0,6000)");
		//je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		WebElement cognizantCheers = driver.findElement(By.xpath("//div[contains(text(),'Cognizant Cheers')]"));
		//je.executeScript("arguments[0].scrollIntoView()",cognizantCheers);
		je.executeScript("arguments[0].click()",cognizantCheers);
		
	}

}
