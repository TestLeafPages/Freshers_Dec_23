package week5.day3;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSelectUsingActions {

	
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/selectable/");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement item1= driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		WebElement item2= driver.findElement(By.xpath("//li[text()='Item 2']"));
		
		WebElement item3= driver.findElement(By.xpath("//li[text()='Item 3']"));
		
		WebElement item4= driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		WebElement item5= driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		WebElement item6= driver.findElement(By.xpath("//li[text()='Item 6']"));
		
		WebElement item7= driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(item1, item7).perform();
		
		
	
		
		
	}
}
