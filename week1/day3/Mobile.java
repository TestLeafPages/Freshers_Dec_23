package weeek1.day3;

public class Mobile {
	
	public String companyName="TestLeaf";
	private  String  MyCompName ="TestLeaf";
protected int cvvNumber=2344;
	
	public void samsung() {
		
		System.out.println("My Samsung Mobile");
		
		
	}
	
	private void redmi() {
		
		System.out.println("My Redmi Mobile");
		
	}
	
	
	void infinix() {
		
	}
	
	protected void realme() {
		System.out.println("My realme mobile");
	}
	
	
	public static void main(String[] args) {
		
		Mobile obj = new Mobile();
		obj.samsung();
		obj.redmi();
		obj.infinix();
		obj.realme();
		
		System.out.println(obj.cvvNumber);
		
System.out.println(obj.MyCompName);		
	}
	
	

}
