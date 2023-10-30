package ch5_homework;

public class Ex10_1 {

	public static void main(String[] args) {
		char[] abcCode = // a-z
				{ '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
						'}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String result = "`~!wer";
		String src = "";

		for (int i = 0; i < result.length(); i++) {
			char ch = result.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				for (int j= 0; j < numCode.length; j++) {
					if (ch == numCode[j]) {				
				src += j;
					}
				}	
				// a를 0으로 보면 되는 개념 0번째 인덱스
			} else {
				for(int k = 0; k <abcCode.length; k++) {
					if (ch == abcCode[k]) {
						src+= (char)(k +'a');
					}
				}
			}

		}
		System.out.println("result:" + src);
		System.out.println("src:" + result);

	}
}
// 인덱스를 찾아내서 'a'를 더하고
// 암호화된 글씨를 캐릭터로 변환
// 'a' => '`' : abcCode['a'-'a']
// 'f' => '$' : abcCode['f'-'a']
// '5' => 'y' : numCode['5'-'0']

// 'a' : abcCode[0] : abcCode['a'-'a'] ==abcCode[97-97] == abcCode[0]
// 'b' : abcCode[1] : abcCode['b'-'a'] ==abcCode[98-97] == abcCode[1]
// 'z' : abcCode[25]: abcCode['c'-'a'] ==abcCode[122-97] == abcCode[25]
// '0' : numCode[0] : numCode['0'-'0'] ==numCode[48-48] == numCode[0]