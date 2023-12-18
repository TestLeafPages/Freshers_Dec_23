package week2.day1;

public class SwappingBetweenTwoNumbers {
	//without temp variable
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	a=a+b;// a=10+20 a=30
	b=a-b;// b= 30-20 b=10
	a=a-b;// a=30-10 a=20
	System.out.println(a);
	System.out.println(b);
}

}
