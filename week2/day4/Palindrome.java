package week2.day3;

public class Palindrome {
	public static void main(String[] args) {
		// Initialize a String
		String text = "amma";

		// Initialize empty string as reverse
		String reverse = "";
		// convert the String into a character
		char[] charArray = text.toCharArray();

		// Iterate the values from charArray
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.println(charArray[i]);
			reverse = reverse + charArray[i];
		}
		System.out.println(reverse);

		if (reverse.equals(text)) {
			System.out.println("Given text =" + text + " is palindrome");

		} else {
			System.out.println("Given text =" + text + " is not a palindrome");

		}

	}
}
