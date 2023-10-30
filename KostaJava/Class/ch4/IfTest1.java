package ch4;
public class IfTest1 {
	public static void main(String[] args) {
	 int i=75;
	String grade="";
	 if(i>=90) {
		 grade="A";
		 if(i>=97) {
		grade+="+";
	 } else if(i>=94) {
		 grade+="0";
	 } else {
		 grade+="-"; 
	 }
	} else if(i>=80) {
		grade="B";
		
		
	 System.out.println(grade);
	 }
	}
}


