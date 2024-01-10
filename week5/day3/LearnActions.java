package week5.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {
	public static void main(String[] args) {
		
	
	
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.leafground.com/drag.xhtml");

	WebElement findElement = driver.findElement(By.xpath("//div[@id='form:conpnl_content']"));
	
	Actions  builder= new Actions(driver);
	builder.dragAndDropBy(findElement, 150,0).perform();
	
	
	
		
	
	
	
	
	}
}
