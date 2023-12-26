package week3.day2;

public class PalindromeUsingNumber_String {
public static void main(String[] args) {
	//initialize the variable as num
	//int num=121;
	String num="121";
	int parseInt = Integer.parseInt(num);
	//initialize the temp variable as sum
	int sum=0;
	//Initialize the variable 
	int expectedResult=parseInt;
	
	while(parseInt>0) {
	//find remainder in given numvber
	int remainder=parseInt%10;
	//add the remainder in sum
	sum=(sum*10)+remainder;
	
	parseInt=parseInt/10;
}
	
	System.out.println(sum);
	
	if(sum==expectedResult) {
		System.out.println("Given number is a Palindrome");
	}else {
		System.out.println("Given number is not a Palindrome");
	}
	
	
	
	
	
	
	
}
}
