package week2.day2;

import java.util.Arrays;

public class FindMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int values[]= {1,2000,500,900,1000};
int arraySize=values.length;
Arrays.sort(values);//1,500,900,1000,2000

System.out.println(values[arraySize-1]);



}
}