package seleniumbasicprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormEnrollment {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("userName")).sendKeys("Kirthivasan");
		driver.findElement(By.id("userEmail")).sendKeys("lvk@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Chennai");
		driver.findElement(By.id("permanentAddress")).sendKeys("Chennai");
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		
		String name = driver.findElement(By.id("name")).getText();
		System.out.println(name);
		
		
		
		
		
	}

}
