package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Ajio {
	public static void main(String[] args) {
		
		ChromeOptions  options=new ChromeOptions();
	//	options.addArguments("--start-maximized","--disable-notifications","headless");
		options.addArguments("--start-maximized","--disable-notifications");
			
		// Launch chrome browser
		ChromeDriver driver = new ChromeDriver(options);
		// Load the application url
		driver.get("https://www.ajio.com/");
		
		WebElement men = driver.findElement(By.xpath("//span[text()='MEN']"));
		
		Actions builder=new Actions(driver);
		
	   builder.moveToElement(men).perform();
		driver.findElement(By.xpath("//a[text()='Shirts']")).click();
		
		
		

	}
}
