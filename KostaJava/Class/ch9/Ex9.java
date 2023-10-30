package ch9;

public class Ex9 {
	static String delChar(String src, String delCh) {
		StringBuilder sb = new StringBuilder(src);
		for (int i = 0; i < delCh.length(); i++) {
			int idx = 0;
			while (true) {
				idx = sb.indexOf(delCh.charAt(i) + "", idx); // 0번째는 ~를 찾는다
				if (idx < 0) // 0보다 작으면 없다는 뜻이니까 빠져나감
					break;
				sb.deleteCharAt(idx); // n번째 캐릭터를 삭제함

			}

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}

//(1!2@3^4~5) -> 12345
//(1 2 3 4 5) -> (12345)
//선생님풀이
