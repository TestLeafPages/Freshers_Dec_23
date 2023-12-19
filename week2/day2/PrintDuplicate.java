package week2.day2;

public class PrintDuplicate {
public static void main(String[] args) {
	int[] num= {11,32,44,22,11,44,20,10};
	
	//output: 11,44
	
	for (int i = 0; i < num.length; i++) {
		
		for (int j = i+1; j < num.length; j++) {
			
			if(num[i]==num[j]) {//11==32
				System.out.println(num[j]);
			}
		}
	}
	
}
}
