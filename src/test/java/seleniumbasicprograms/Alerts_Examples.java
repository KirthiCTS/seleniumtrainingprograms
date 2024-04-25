package seleniumbasicprograms;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Examples {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
/*		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		String str = alert.getText();
		System.out.println("Message displayed in the alert: "+str);
		alert.accept();
		//alert.dismiss();
		
		*/
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Kirthivasan");
		alert.dismiss();
		
		
		
	}

}
