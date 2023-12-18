package week2.day1;

public class SwappingBetweenTwoNumbers2 {
	//with temp variable
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;

		temp=a;
		a=b;
	
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}

}
