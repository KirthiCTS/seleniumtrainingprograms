package seleniumbasicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeOlderVersion {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2270103\\OneDrive - Cognizant\\Documents\\selenium binaries\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
