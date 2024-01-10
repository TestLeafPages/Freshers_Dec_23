package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) {

		// Launch chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the application url
		driver.get("https://www.facebook.com/");
		// Maximize the browser
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.linkText("Create new account")).click();
		
		By firstName = By.name("firstname");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(firstName));
		
		driver.findElement(By.name("firstname")).sendKeys("Vinoth");
		
		
	
		
	}
}