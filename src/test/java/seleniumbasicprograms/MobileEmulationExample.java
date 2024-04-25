package seleniumbasicprograms;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class MobileEmulationExample {

	public static void main(String[] args) {

		Map<String, String> mobileEm = new HashMap<String, String>();
		mobileEm.put("deviceName", "Galaxy S5");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEm);
		
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		
		
		
		
		
		
	}

}
