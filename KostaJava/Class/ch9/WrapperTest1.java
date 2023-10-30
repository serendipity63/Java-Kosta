package ch9;

public class WrapperTest1 {

	public static void main(String[] args) {
		int m = 10; // int는 클래스 타입이 아님 그냥 자료형
		Integer n = m; // Boxing: 알아서 int를 integer로 바꿔줌
		int r = n; // Unboxing
		long l = m; // m이 long으로 우선 바뀐다

		Object obj = 100; // Boxing + Upcasting

	}

}
