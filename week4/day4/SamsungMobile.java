package week4.day4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class SamsungMobile extends AndroidMobile {

	public void qualityVoiceCall() {
		System.out.println("Samsung Mobile Voice Call");
		
	}
	

	public void qualityVideoCall() {
		System.out.println("Samsung Mobile Video Call");
	}
 
	
	public static void main(String[] args) {
		SamsungMobile obj= new SamsungMobile();
		obj.voiceCall();
		obj.makevideoCall();
		obj.gps();
		obj.internetConnectivity();
		obj.qualityVideoCall();
		obj.qualityVoiceCall();
	}
}
