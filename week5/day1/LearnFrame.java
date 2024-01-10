package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://leafground.com/frame.xhtml");
	//Maximize the chrome browser
	driver.manage().window().maximize();

	//controll move to frame
	driver.switchTo().frame(0);
	WebElement ele = driver.findElement(By.id("Click"));
	
	ele.click();
	
	String text = ele.getText();
	
	//controll move to main webpage
	driver.switchTo().defaultContent();
	
	//How to handle Nested Frame
	//Controll move to frame
	driver.switchTo().frame(2);
	//Controll move to Inner frame
	driver.switchTo().frame("frame2");
	WebElement nestedFrame = driver.findElement(By.xpath("//button[text()='Click Me']"));
	nestedFrame.click();
	String text2 = nestedFrame.getText();
	System.out.println(text2);
	
	
}
}
