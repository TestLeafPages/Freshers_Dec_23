package week3.day2;

public class PalindromeUsingNumber {
public static void main(String[] args) {
	//initialize the variable as num
	int num=12345;
	
	//initialize the temp variable as sum
	int sum=0;
	//Initialize the variable 
	int expectedResult=num;
	
	while(num>0) {
	//find remainder in given number
	int remainder=num%10;
	//add the remainder in sum
	sum=(sum*10)+remainder;
	
	num=num/10;
}
		System.out.println(sum);
	
	if(sum==expectedResult) {
		System.out.println("Given number is a Palindrome");
	}else {
		System.out.println("Given number is not a Palindrome");
	}
	
	
	
	
	
	
	
}
}
