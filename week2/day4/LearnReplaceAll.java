package week2.day3;

public class LearnReplaceAll {
public static void main(String[] args) {
	
	String text="testleaf12345@gmail.com";
	
	//replaceAll
	
	 String replaceAll = text.replaceAll("[^0-9]", "");
	 
	 System.out.println(replaceAll);
	 
	 
	
}
}
