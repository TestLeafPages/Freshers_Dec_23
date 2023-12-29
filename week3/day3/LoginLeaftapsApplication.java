package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeaftapsApplication {

	public static void main(String[] args) {
		// launch browser
		ChromeDriver driver = new ChromeDriver();

		// Load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		// Enter the username as demosalesmanager
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");

		// Enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		// Click on login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Get the text of the element

		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		
		// click on Crmsfa Link

		driver.findElement(By.linkText("CRM/SFA")).click();

		//To get the Title of the page
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.contains("My Home")) {
			System.out.println("verified Sucessfully");
		} else {

			System.out.println("Verified not Sucessfully");
		}
		
		
		
		//Click on the Leads 
		
		driver.findElement(By.partialLinkText("Lea")).click();
	
		//CLick on the Create Leads Button
		
		driver.findElement(By.partialLinkText("Creat")).click();
		

		//Enter the Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter the First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
		
		//Enter The Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		
		
		
		
		
		//Click on the Create Leads Button
		driver.findElement(By.name("submitButton")).click();
		
		
		//To Verify the Lead First Name
		
		WebElement findElement = driver.findElement(By.id("viewLead_firstName_sp"));
		System.out.println(findElement.getText());
		String firstName = findElement.getText();
		if (firstName.equals("Vinoth")) {
			
			System.out.println("Verfied Sucessfully");
			
		} else {

			System.out.println("Verified not Sucessfully");
			
		}
		
		
		// To Get the Title of the Page
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
	
		
	}
}
