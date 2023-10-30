package ch4;

public class Ex15 {

	public static void main(String[] args) {
		int number = 12345;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		
//		result = 1 : 1
//		result = 1*10+2 :12
//		result = (1*10+2)*10+3 :123
//		result = ((1*10+2)*10+3)*10+2 :1232
//		result = ((1*10+2)*10+3)*10+2)*10+1 :1232

		while(tmp != 0) { //tmp가 0이 아닐때까지 돌리셈 회분수는 12321 13531 이런 숫자 거꾸로 
			result = result*10+tmp%10;
			tmp /= 10;
		}
		System.out.println(result);
		if(number == result)
		System.out.println( number + "는 회문수 입니다.");
		else
		System.out.println( number + "는 회문수가 아닙니다.");
		} // main

	}


