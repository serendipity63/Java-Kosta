package ch9_homework;

public class Ex9 {
	public static String delChar(String src, String delCh) {
		String s = new String(src);
		for (int i = 0; i < delCh.length(); i++) {
			s = s.replace(String.valueOf(delCh.charAt(i)), "");

		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}

//(1!2@3^4~5) -> 12345
//(1 2 3 4 5) -> (12345)