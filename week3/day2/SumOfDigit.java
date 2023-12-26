package week3.day2;

public class SumOfDigit {
public static void main(String[] args) {
	int num=12345;
	int sum=0;
	
	while(num>0) {
	int remainder=num%10;


	System.out.println(sum);
	num=num/10;
	}
	
}
}
