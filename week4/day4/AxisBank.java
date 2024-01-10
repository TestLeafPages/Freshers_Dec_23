package week4.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class AxisBank extends RBI {

	public void deposit() {
		super.deposit();
		System.out.println("deposit - Axis");
	}
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		
		axis.deposit();
		axis.saving();
	}
}
