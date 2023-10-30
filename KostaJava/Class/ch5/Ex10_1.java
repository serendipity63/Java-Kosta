package ch5;

//`~!wer을 abc123으로 다시 돌려놓기
public class Ex10_1 {

	public static void main(String[] args) {
		// a~z
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String result = "`~!wer";
		String src = "";
		for (int i = 0; i < result.length(); i++) { // 6번 반복함
			char ch = result.charAt(i);
			// 문자열에서 해당 위치(index)에 있는 문자 변환 ch에 저장

			for (int j = 0; j < abcCode.length; j++) { // abcCode 배열길이만큼 반복함0부터
				if (ch == abcCode[j]) {
					src += (char) (j + 'a');
				}
			}

			for (int j = 0; j < numCode.length; j++) {
				if (ch == numCode[j]) {
					src += j; // (int 값)
				}
			}
		}

		System.out.println("result:" + result);
		System.out.println("src:" + src);

	}
}