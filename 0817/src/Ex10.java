
public class Ex10 {

	public static void main(String[] args) {
		char[] abcCode = //a-z
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
			// 0 1 2 3 4 5 6 7 8 9
			char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			String src = "abc123";
			String result = "";
			// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
			
			//'a' => '`' : abcCode['a'-'a']
			//'f' => '$' : abcCode['f'-'a']
			//'5' => 'y' : numCode['5'-'0']
			
			// 'a' : abcCode[0] : abcCode['a'-'a'] ==abcCode[97-97] == abcCode[0]
			// 'b' : abcCode[1] : abcCode['b'-'a'] ==abcCode[98-97] == abcCode[1]
			// 'z' : abcCode[25]: abcCode['c'-'a'] ==abcCode[122-97] == abcCode[25]
			// '0' : numCode[0] : numCode['0'-'0'] ==numCode[48-48] == numCode[0]
			for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			
			if(ch >='a' && ch<='z') {
				result += abcCode[ch-'a'];
				//a를 0으로 보면 되는 개념 0번째 인덱스 
			} else if (ch >='0' && ch<='9') {
				result += numCode[ch-'0'];
			}
									
			}
			System.out.println("src:"+src);
			System.out.println("result:"+result);

	}

}

//숙제
