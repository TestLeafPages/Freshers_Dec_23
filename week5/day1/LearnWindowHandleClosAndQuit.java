package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandleClosAndQuit {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://leafground.com/window.xhtml");
	//Maximize the chrome browser
	driver.manage().window().maximize();
	
	String parentWindow = driver.getWindowHandle();
	System.out.println(driver.getTitle());
	
	//click on pen buttton
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	
	Set<String> childWindow = driver.getWindowHandles();
//	
//	
	List<String>  openedWindow=new ArrayList<String>(childWindow);
//	 
	driver.switchTo().window(openedWindow.get(1));
	System.out.println(driver.getTitle());
	
	
	//driver.close();
	driver.quit();
	
	
	

}
}
