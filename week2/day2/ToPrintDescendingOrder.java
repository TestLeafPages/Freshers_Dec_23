package week2.day2;

import java.util.Arrays;

public class ToPrintDescendingOrder {
public static void main(String[] args) {
	//Initialize an Array
	int[] values={100,600,300,200,400,500};

	//Expected output: 600,500,400,300,200,100

	//to change the order in given array
	Arrays.sort(values);

	//iterate the values from 0 to Array length 
	for(int i=values.length-1;i>=0;i--){
	System.out.println(values[i]);

	}
}
}
