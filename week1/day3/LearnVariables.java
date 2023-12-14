package weeek1.day3;

public class LearnVariables {
 	String name="test";
	
  public void add() {
	  int b=10;
			  System.out.println("add"+name);
  }
  public void sub() {
	 
	  System.out.println("sub"+name);
  }
  
public static void main(String[] args) {
	 int a=10;
	System.out.println(a);
	
	LearnVariables variable=new LearnVariables();
	variable.add();
	variable.sub();
	
}
}
