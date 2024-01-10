package week5.day2;

import java.text.CollationElementIterator;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mantra {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications","--start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		//Load the application url
		driver.get("https://www.myntra.com/");
	
        //add wait statemenet
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement kids = driver.findElement(By.xpath("//a[text()='Kids']"));
		WebElement ele = driver.findElement(By.xpath("//a[text()='T-Shirts']"));
		
		Actions builder=new Actions(driver);
		
		builder.moveToElement(kids).perform();
		Thread.sleep(5000);
		builder.click(ele).perform();
	    
	    
	    
	    
	    
		
		
		
		
		
		
	}
}
