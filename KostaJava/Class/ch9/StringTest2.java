package ch9;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "Good Luck";
		int idx = str.indexOf('L');
		System.out.println(idx);
		int idx2 = str.indexOf("Good");
		System.out.println(idx2);

		String str2 = "apple place";
		int idx3 = str2.indexOf('a');
		int idx4 = str2.lastIndexOf('e');
		System.out.println(idx3);
		System.out.println(idx4);
		String str3 = str2.replace('p', 't');
		System.out.println(str3);
		System.out.println(str2);
		String str4 = str2.replace("place", "banana");
		System.out.println(str4);

		String fruitStr = "apple,banana,pineapple,melon,strawberry";
		String[] fruitArr = fruitStr.split(",", 2);
		for (int i = 0; i < fruitArr.length; i++) {
			System.out.println(fruitArr[i]);
		}
		String pineapple = fruitStr.substring(13, 22);
		System.out.println(pineapple);

//		System.out.println("Y/N을 선택하세요:");
//		Scanner sc = new Scanner(System.in);
//		String answer = sc.nextLine();
////		if (answer.toLowerCase()=="y") { == 안됨 상수영역의 주소를 가지고 있지 않음
//		if (answer.toLowerCase().equals("y")) {
//			System.out.println("Yes 선택");
//		} else if (answer.toUpperCase().equals("N")) {
//			System.out.println("No 선택");
//		}

		String str5 = "    Hello    ".trim();
		System.out.println(str5);
		Point p = new Point(10, 10);
		String str6 = String.valueOf(p);
		System.out.println(str6);
		String str7 = "" + p; // <이거도 가능
		System.out.println(str7);
	}

}
