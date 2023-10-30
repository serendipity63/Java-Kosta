package ch4;

public class Ex2 {

	public static void main(String[] args) {
		// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
		int sum=0;
		
		for(int i=1; i <= 20; i++) {
			if(i%3==0 || i%2==0) //3의 배수와 2의 배수를 모두 거르는
				continue; //조건식이 참이 되어 continue 문이 수행되면 블럭의 끝으로 이동한다. break와 달리 반복문을 벗어나지 않는다
			sum += i;

		} //여기로 가는거
		System.out.println(sum); //이건 포문을빠져나와야함 왜냐면 포문 안에서는 계속 더함 누적으로
	}

}
