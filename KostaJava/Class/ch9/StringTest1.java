package ch9;

public class StringTest1 {

	public static void main(String[] args) {
		String a = "a";
		a = "b"; // 주소값이 바뀌는

		int n = 10;
		n = 20;

		String s1 = null;
		String s2 = "";// 빈 문자열도 2바이트짜리 null이 들어가있다 +null로 끝나는 느낌 항상 null이 포함
		char c = 'a';

		String s3 = new String("abc");
		char[] carr = { 'a', 'b', 'c' };
		String s4 = new String(carr);
		System.out.println(s3);
		System.out.println(s4);
		StringBuffer sb = new StringBuffer("abc");
		String s5 = new String(sb);
		System.out.println(s5);

		String bs = "hello"; // immutable
		String cs = bs.concat("world"); // 이어서 새로운 문자열을 만듦
		System.out.println(bs);
		System.out.println(cs);
		System.out.println(bs);
		System.out.println(cs.contains("hello"));
		String filename = "test.txt";
		System.out.println(filename.endsWith("hwp"));

		String[] files = { "test.txt", "temp.hwp", "backup.txt" };
		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith("txt")) {
				System.out.println(files[i]); // txt로 끝나는거만 가지고 오는거
			}

		}

	}

}
