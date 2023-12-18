package week2.day1;

public class Factorial {
public static void main(String[] args) {
	//Factorial:
		  int number=5;

		//5*4*3*2*1
		int fact=1;

		for(int i=5; i>=1;i--){
			fact=fact*i;
			System.out.println(fact);
		}
//		       i =5//5
//		                   2 -> 4 // 5*4 =20
//		                   3 -> 3 // 20*3 =60
//		                   4 -> 2 // 60*2 =120
//		                   5 -> 1 // 120 *1 =120

}
}
