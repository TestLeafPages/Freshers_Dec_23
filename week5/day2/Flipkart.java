package week5.day2;

import java.text.CollationElementIterator;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://www.flipkart.com/");
		//Maximize the chrome browser
		driver.manage().window().maximize();
        //add wait statemenet
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]")).sendKeys("5G Mobiles",Keys.ENTER);
		
		
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		List<Integer> mobilePrice=new ArrayList<Integer>();
		//Iterate the values from priceList
		for (int i = 0; i < priceList.size(); i++) {
			//Print all mobile price
			String text = priceList.get(i).getText();
			//System.out.println(text);
			//Remove rupees and delimeter symbol
			String replace = text.replaceAll("[^0-9]", "");
		//System.out.println(replace);
			//Converting string to int data types by using type casting
			int parseInt = Integer.parseInt(replace);
			
			mobilePrice.add(parseInt);
		}
		System.out.println(mobilePrice);
		
		//To get min value from list
		Integer min = Collections.min(mobilePrice);
		System.out.println("Minimum value"+min);
		
		//to get maximum values from the list
		Integer max = Collections.max(mobilePrice);
		System.out.println("Maximum Value"+max);
	
	}
}
