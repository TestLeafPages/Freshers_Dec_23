package week2.day2;

public class PrintDuplicate2 {
public static void main(String[] args) {
	//Initialize an Array
	int[] numbers={1,3,5,7,8,2,3,5,1,7};
	//Iterate the values from 0 to array length
	for (int i = 0; i < numbers.length; i++) {
		//Iterate the j loop, j loop starts from j =i+1
	for (int j =i+1; j < numbers.length; j++) {
		//If it is match ,it will print duplicate values
		if (numbers[i]==numbers[j]) {
			//print duplicate numbers
			System.out.println(numbers[i]);
		}
	}	
	}
}
}
