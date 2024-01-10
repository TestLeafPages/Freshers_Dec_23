package week5.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDynamicXpath {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://erail.in/");
		//Maximize the chrome browser
		driver.manage().window().maximize();
        //add wait statemenet
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Pass the values in from station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));

		fromStation.clear();
		fromStation.sendKeys("MAS",Keys.ENTER);

		WebElement toStation = driver.findElement(By.id("txtStationTo"));

		toStation.clear();
		toStation.sendKeys("MDU",Keys.ENTER);

     //Uncheck select date check box
	driver.findElement(By.id("chkSelectDateOnly")).click();
    
     
	//To get train name size
	List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
	
	for (int i = 2; i <=trainName.size(); i++) {
		String text = driver
.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
		System.out.println(text);
	}
	
	}
}
