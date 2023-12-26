package week2.day3;

public class LearnStringMethods {
public static void main(String[] args) {
	String word="    Welcome to testleaf     ";
	
	
	String trim = word.trim();
	
	System.out.println(trim);
	
	
	String text1="testleaf";
	String text2="testleaf";
	
	boolean equals = text1.equals(text2);
	
	if(text1.equals(text2)) {
		System.out.println("both are equal");
	}else {
		System.out.println("both are not equal");
	}
	
	if(text1==text2) {
		System.out.println("using =="+"both are equal");
	}else {
		System.out.println("using =="+"both are not equal");
	}
	
	
	String word1=new String("chennai");
	String word2=new String("chennai");
	
	if(word1.equals(word2)) {
		System.out.println("new keyword"+"both are equal");
	}else {
		System.out.println("new keyword"+"both are not equal");
	}
	
	
	if(word1==word2) {
		System.out.println("using =="+"both are equal");
	}else {
		System.out.println("using =="+"both are not equal");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
