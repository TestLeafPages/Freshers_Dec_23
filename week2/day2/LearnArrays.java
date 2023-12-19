package week2.day2;

import java.util.Arrays;

public class LearnArrays {
public static void main(String[] args) {
	
	int[] num= {1,4,7,9,2,5,3,6,8};
	
	//To get the size of an Array
	int arraySize = num.length;
	System.out.println(arraySize);
	
	
	//to sort the given in ascending order
	Arrays.sort(num);
	
	System.out.println(Arrays.toString(num));
	
	//Iterate the values o to arraylength
	
	for (int i = 0; i < arraySize; i++) {
		System.out.println(num[i]);
	}
	
	
	for (int i = arraySize-1; i>=0; i--) {
		System.out.println(num[i]);
	}
	
	
}
}
