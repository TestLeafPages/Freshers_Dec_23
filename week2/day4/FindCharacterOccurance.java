package week2.day3;

public class FindCharacterOccurance {
public static void main(String[] args) {
	
	String text="welcome to testleaf";
	//output: e-->4
	
	/*pseudocode:
	 * Convert the String in to Character
	 * Initialize the temp variable as count
	 * Iterate the character from char[]
	 * check the character occurrence
	 *  if it is match to increase the count
	 * 
	 */
	
	char[] charArray = text.toCharArray();
	
	int count=0;
	
	for (int i = 0; i < charArray.length; i++) {
		
		if( charArray[i]=='e') {
			
			count=count+1;
		}
	}
	
	System.out.println("e - Occurance is "+count);
}
}
