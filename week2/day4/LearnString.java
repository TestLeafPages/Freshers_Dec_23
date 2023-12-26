package week2.day3;

public class LearnString {
public static void main(String[] args) {
	
	//Initialize a String
	String text="           i          love    chicken    briyani                 ";
   //i  love chicken briyani
	
//1 solution
	String trim = text.trim();
	//Segirate the String into words
	String[] split = trim.split("\\s+");
	
//2nd Solution 	
	//to get the size of words
	System.out.println(split.length);
	
	//Initialize the temp variable as count
	int count=0;
	//Iterate the values from split
	for (int i = 0; i < split.length; i++) {
		count=count+1;
		System.out.println(split[i]);
	}
	
	System.out.println(count);
}
}
