package week5.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {
public static void main(String[] args) throws IOException {
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://leafground.com/frame.xhtml");
	//Maximize the chrome browser
	driver.manage().window().maximize();

	//controll move to frame
	driver.switchTo().frame(0);
	WebElement ele = driver.findElement(By.id("Click"));
	
	File source = ele.getScreenshotAs(OutputType.FILE);
	File destination=new File("./snap/002.png");
	FileUtils.copyFile(source, destination);
	ele.click();
	
	
	
	String text = ele.getText();
	
	//controll move to main webpage
	driver.switchTo().defaultContent();
	
	File source1 = driver.getScreenshotAs(OutputType.FILE);
	File destination1=new File("./snap/001.png");
	FileUtils.copyFile(source1, destination1);
	
	
	
	
}
}
