package week4.day4;

public class AndroidMobile extends Mobile  {

	
	public void gps() {
		
		System.out.println("GPS");
	}
	
	public void internetConnectivity() {
		
		System.out.println("Internet Connectivity");
	}
	
	
	public static void main(String[] args) {
		
		AndroidMobile obj = new AndroidMobile();
		
		obj.gps();
		obj.internetConnectivity();
		obj.voiceCall();
		obj.makevideoCall();
		
		}
	
}
