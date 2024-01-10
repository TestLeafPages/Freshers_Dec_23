package week5.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnChromeOptions {
	public static void main(String[] args) {
		
		ChromeOptions  options=new ChromeOptions();
	//	options.addArguments("--start-maximized","--disable-notifications","headless");
		options.addArguments("--start-maximized","--disable-notifications","--incognito");
			
		// Launch chrome browser
		ChromeDriver driver = new ChromeDriver(options);
		// Load the application url
		driver.get("https://www.myntra.com/mantra");
		// Maximize the browser
	System.out.println("Program execute successfully");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
}
