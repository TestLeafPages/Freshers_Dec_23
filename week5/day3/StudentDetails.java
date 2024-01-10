package week5.day3;

public class StudentDetails {
	
	
	String studentName;
	int registerNumber;
	long mobileNumber;
	
	StudentDetails(){
		System.out.println("Default constructor");
	}
	StudentDetails(String studentName,int registerNumber,long mobileNumber){
		this();
		this.studentName=studentName;
	    this.	registerNumber=registerNumber;
		this.mobileNumber=mobileNumber;
		
		System.out.println(studentName);
		System.out.println(registerNumber);
		System.out.println(mobileNumber);
	}
	
public static void main(String[] args) {
	StudentDetails student=new StudentDetails("Mani",123129112,9834892364L);
//	System.out.println(student.studentName);
//	System.out.println(student.registerNumber);
//	System.out.println(student.mobileNumber);
	
	
}
}
