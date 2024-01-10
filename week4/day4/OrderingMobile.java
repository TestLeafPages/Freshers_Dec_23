package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) {
		String url = "http://www.domain.com/";
		ChromeOptions chrome_options= new ChromeOptions();
		
		chrome_options.addArguments("--disable-extensions");
		chrome_options.addArguments("--disable-popup-blocking");
		chrome_options.addArguments("--disable-infobars");
		chrome_options.addArguments("--disable-notifications");
		chrome_options.addArguments("--disable-web-security");
		chrome_options.addArguments("--no-referrers");
		chrome_options.addArguments("--no-sandbox");
		chrome_options.addArguments("--disable-gpu");
		chrome_options.addArguments("--disable-software-rasterizer");
		chrome_options.addArguments("--disable-dev-shm-usage");
		chrome_options.addArguments("--disable-features=VizDisplayCompositor");
		chrome_options.addArguments("--disable-features=VizDisplayCompositor");


		chrome_options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(chrome_options);
		// Launch ServiceNow application
						driver.get(url);
		//driver.get("https://dev205797.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Login with valid credentials username as admin and password as India@123
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Testleaf@123");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();

		// Click-AllEnter Service catalog in filter navigator and press enter
		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(20);

		dom.findElementByXPath("//div[text()='All']").click();
		dom.setImplicitWait(5);
		dom.findElementByXPath("//input[@id='filter']").sendKeys("service Catalog");

	}

}
