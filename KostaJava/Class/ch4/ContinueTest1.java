package ch4;

public class ContinueTest1 {

	public static void main(String[] args) {
		int sum = 0;
		// for(int i=1; i<=100; i++) {
		// if(i%2==0) sum+=i;
		// }
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0)
				continue; // 이하의 반복문을 수행하지 않고 증감식으로 감
			sum += i;
		}
		System.out.println(sum);

	}

}