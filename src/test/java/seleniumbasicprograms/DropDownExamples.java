package seleniumbasicprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement element = driver.findElement(By.tagName("select"));
		
		Select select = new Select(element);
		
		List<WebElement> listOptions = select.getOptions();
		
		for(WebElement elem : listOptions) {
			
			System.out.println(elem.getText());
			
		}
		
		//select.selectByValue("BEL");
		
		//select.selectByIndex(4);
		
		select.selectByVisibleText("Australia");
		
		
		
	}

}
