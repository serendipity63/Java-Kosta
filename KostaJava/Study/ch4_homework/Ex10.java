package ch4_homework;

public class Ex10 {
//	int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
//	완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)
//	에 알맞은 코드를 넣으시오.
//	[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
//		sum +=num%10; //5 
//		num /= 10; //1234
//		sum +=num%10; //4 
//		num /= 10; //123		
//		sum +=num%10; //3 
//		num /= 10; //12
//		sum +=num%10; //2 
//		num /= 10; //1
//		sum +=num%10; //1 
//		num /= 10; //0
//		
		while(true) {
			if(num==0) break;
			sum +=num%10; 
			num /= 10; // /= 변수 num을 10으로 나눈 후 다시 변수 num에 대입
		}
		System.out.println("sum="+sum);

	}

}



//String snum = num+""; //숫자가 문자열로 바뀜
