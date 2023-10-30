package ch6;

class MyNumber {
	int num; // 클래스 내 변수는 클래스 내 메소드들이 공유한다.

	void func1(int n) {
		int number = n;
		num = number;
	}

	void func2(int n) { // 같아보여도 다른거
		int number = n;
		num = number;
	}
}

class MyMath2 {
	int x, y;

	int add() {
		return x + y;
	}

	int multi() {
		return x * y;
	}
}

public class VariableTest2 {

	public static void main(String[] args) {
		MyNumber mn = new MyNumber();
		System.out.println(mn.num); // 0
		mn.func1(10);
		System.out.println(mn.num); // 10
		mn.func2(20);
		System.out.println(mn.num); // 20

		MyMath2 mm = new MyMath2();
		mm.x = 10;
		mm.y = 20;
		System.out.println(mm.add()); // 30
		System.out.println(mm.multi()); // 200
	}

}
