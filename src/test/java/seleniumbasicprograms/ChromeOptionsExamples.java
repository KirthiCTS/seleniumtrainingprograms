package seleniumbasicprograms;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class ChromeOptionsExamples {

	public static void main(String[] args) {
		
		Map<String, String> mobileEm = new HashMap<String, String>();
		
		mobileEm.put("deviceName", "Galaxy S5");

		ChromeOptions chromeOptions = new ChromeOptions();
		
	//	String browserPath = SeleniumManager.getInstance().getDriverPath(chromeOptions, false).browserPath;
		
	//	System.out.println(browserPath);
		
	//	chromeOptions.setBrowserVersion("119");
	//	chromeOptions.setExperimentalOption("mobileEmulation", mobileEm);
		//chromeOptions.addArguments("--headless");
		
		
		WebDriver driver = new ChromeDriver(chromeOptions);	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.getTitle());
		
		
	}

}
