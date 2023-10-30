package ch4_homework;
//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
//100이상이 되는지 구하시오.
public class Ex4 {

	public static void main(String[] args) {
		int sum=0; //총합
		int num=0;
		int s=1; //값의 부호를 바꾸는 변수
		for(int i=1; true;i++, s=-s) { //조건식이 true니까 무한반복문 가능
			num = s*i; // i와 부호 s를 곱해서 더할 값을 구함
			sum += num;
			
			if(sum>=100)
				break;			
		}
		
		System.out.println(num); //199까지 더해야함
		System.out.println(sum);
	}

}
//홀수는 더하고 짝수는 뺀다

