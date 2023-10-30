package ch4_homework;
public class Ex2 {
	public static void main(String[] args) {
		//1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		int sum = 0; //누적해야할 값 반드시 0으로 초기화
		for(int i=1; i<=20; i++) { //근데 왜 i를 1로 해야함? 0이면 뭐가 다름?
			if(i%2==0 || i%3==0) continue;
			sum+= i;
		//for(for(int i=0; i<=20; i++) {
			//if(!(i%2==0 || i%3==0)){
			//sum += i;
			
		}
		System.out.println(sum);
		}
	}


