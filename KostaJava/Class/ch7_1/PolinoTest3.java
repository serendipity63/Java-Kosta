package ch7_1;

class Base {
	int x = 1;

	void method() {
		System.out.println("Base method");
	}
}

class Derived extends Base {
	int x = 2;
	int y = 3;

	void method() { // overriding
		System.out.println("Derived method");
	}
}

public class PolinoTest3 {
	public static void main(String[] args) {
		Base base1 = new Derived(); // up casting 자식 객체를 생성해서 부모에 넣음
		base1.method();// 자식꺼가 호출됨 다형성
		base1.x = 10; // base1.y =20;

		Base base2 = new Base(); // up casting 자식 객체를 생성해서 부모에 넣음
		base2.method();

		if (base1 instanceof Derived) {
			Derived derived1 = (Derived) base1; // downcasting
			derived1.y = 20;

		}
		if (base2 instanceof Derived) {
			Derived derived2 = (Derived) base2; // downcasting
			derived2.y = 30;

		}
		Base base3 = new Derived();
		base3.method(); // Derived method 호출
		System.out.println(base3.x);

	}

}
