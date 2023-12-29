package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {
public static void main(String[] args) throws InterruptedException {
	//Launch chrome browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("http://leaftaps.com/opentaps/control/main");
    //Maximize the browser
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//Enter thw username as demosalesmanager
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	//Enter the password as crmsfa
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	//Click on login button
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	//Click crmsfa hyper link
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	
	
	
	
	
	//Implicitly wait
	// it is global wait 
	//it will waits for the given seconds for each findElement
	

	
	//Thread.sleep();
	Thread.sleep(5000);
	
	
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	
	
	
	
	
	
	






}
}
