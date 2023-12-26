package week3.day2;

public class ArmStrongNumber {
public static void main(String[] args) {
	int num=153;
	
	int sum=0;
	
	int ans=num;
	while(num>0) {
	int remainder=num%10;
	  sum =sum+remainder*remainder*remainder;
	num=num/10;
}
	
	if(sum==ans) {
		System.out.println("The given number is a Armstrongnumber");
	}else {
		System.out.println("The given number is not a Armstrongnumber");
	}
	
	
	
}
}
