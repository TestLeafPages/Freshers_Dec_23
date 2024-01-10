package week5.day2;

public class ReplaceAllMethod {
public static void main(String[] args) {
	String name="test123@jfnf563";
	
//	String replaceAll = name.replaceAll("[0-9]", "");
	String replaceAll = name.replaceAll("[^a-z]", "");

	System.out.println(replaceAll);

}
}
