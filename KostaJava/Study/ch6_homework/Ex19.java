package ch6_homework;

public class Ex19 {
	public static void change(String str) {
		str += "456";

	}

	public static void main(String[] args) {
		int n = 10;
		String str = "ABC123";
		String str1 = "ABC123";
		System.out.println(str == str1);
		String str2 = new String("ABC123");
		String str3 = new String("ABC123");
		System.out.println(str2 == str3);
//		System.out.println(str);
//		change(str);
//		System.out.println("After change:" + str);
	}

}
//바뀌지 않는다 왜??