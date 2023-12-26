package week3.day2;

public class LearnStringBuffer {
public static void main(String[] args) {
	
	StringBuffer buffer=new StringBuffer("test");
	System.out.println(buffer);
	buffer.append("leaf");
	System.out.println(buffer);
	//buffer.reverse();
	System.out.println(buffer);
	
	int length = buffer.length();
	System.out.println(length);
	
	buffer.deleteCharAt(0);
	System.out.println(buffer);
	StringBuilder builder=new StringBuilder();
	
}
}
