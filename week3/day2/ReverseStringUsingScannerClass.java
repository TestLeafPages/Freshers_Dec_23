package week3.day2;

import java.util.Scanner;

public class ReverseStringUsingScannerClass {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the input");
	
	String nextLine=scan.nextLine();
	
	char[] charArray=nextLine.toCharArray();
	
	for (int i =charArray.length-1;i>=0; i--) {
		System.out.print(charArray[i]+"    ");
	}
	
	
	
	
	
	
	
}
}
