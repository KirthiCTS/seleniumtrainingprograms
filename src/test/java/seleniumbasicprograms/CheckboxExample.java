package seleniumbasicprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[1]")).click();		
		WebElement checkbox = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[1]"));
		
		if(checkbox.isSelected())
			System.out.println("Checkbox is selected");
		else
			System.out.println("Checkbox is not selected");
		
		
		
		
	}

}
