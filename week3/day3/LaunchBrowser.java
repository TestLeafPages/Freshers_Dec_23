package week3.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	
	//load the application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//maximize the browser
	driver.manage().window().maximize();
	
	//EdgeDriver driver=new EdgeDriver();
	
	//FirefoxDriver driver=new FirefoxDriver();
	
}
}
