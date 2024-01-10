package week5.day3;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNavigationCommands {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.leafground.com/drag.xhtml");
   // Thread.sleep(3000);
	driver.navigate().to("https://www.facebook.com/");
	//Thread.sleep(3000);
	driver.navigate().back();
	//Thread.sleep(3000);
	driver.navigate().refresh();
	
}
}
