package ch4_homework;

public class Ex9 {
	//숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
	//드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
	//어야 한다. (1)에 알맞은 코드를 넣으시오.
	//[Hint] String클래스의 charAt(int i)을 사용
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) { 
			char ch = str.charAt(i); // '1' :49
			//string으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
			sum += ch-'0'; //49-48 아스케코드값 어쩌곻 그러니까 1이됨
		}
		System.out.println("sum="+sum);
		}
		}

//문자열은 null로 끝난다

//or sum+= str.charat(i)-'0';
