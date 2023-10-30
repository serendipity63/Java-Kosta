package ch7_1;

class TempClass {
	final int x; // final이지만 인스턴스 용도: 객체들이 각각 다른 값으로 초기화
	static final int sx = 100; // 고정값으로 같이 쓰고 싶으면 static

	TempClass(int x) { // 생성자에서 초기화 하거나 명시적 초기화 하거나
		this.x = x; // instance final은 생성자에서 초기화 한다.
		// 모든 다른 객체가 시리얼넘버처럼 값을 차지하고 있겠다?
//		sx=x; static final은 생성자에서 초기화 할 수 없다.
	}

	void method(int x) {
		// this.x=x;<불가
	}
}

public class FinalTest1 {

	public static void main(String[] args) {
		final int n;
		n = 10;
//		n=20;
		System.out.println(n);

		new TempClass(20);
		new TempClass(30);
	}

}
