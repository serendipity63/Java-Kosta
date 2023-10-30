
public class Ex10_1 {

	public static void main(String[] args) {
		char[] abcCode = // a-z
				{ '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
						'}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String result = "`~!wer";
		String src = "";
		// 인덱스를 찾아내서 'a'를 더하셈
		// 암호화된 글씨를 캐릭터로 변환
		for (int i = 0; i < result.length(); i++) { //믄자열을 돌림
			char ch = result.charAt(i); // 하나의 캐릭터를 가지고옴
			int idx = -1; //왜 -1이지? 이거 질문할것
			if (ch >= 'a' && ch <= 'z') {
				for (int j = 0; j < numCode.length; j++) {
					if (ch == numCode[j]) {
						idx = j;
						break;
					}
				}
				if(idx!=-1) src += (char)('0'+idx);
				src += (char) ('0' + idx); // ch+ch>int>ch 이거 어디감
			} else {
				for (int j = 0; j < abcCode.length; j++) {
					if (ch == abcCode[j]) {
						idx = j;
						break;
					}
				}
				src += (char) ('a' + idx);
			}

		}
		System.out.println("result:" + result);
		System.out.println("src:" + src);
	}
}
