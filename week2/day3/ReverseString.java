package week2.day3;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		
		String str="TestLeaf";
		String rev="";
		char[] charArray=str.toCharArray();

		for(int i=charArray.length-1;i>=0;i--){

		rev=rev+charArray[i];
	

	}
		System.out.println(rev);
	
	
	
	
	}
}
