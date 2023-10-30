package ch7;

class Shape {
	String color;

	void draw() {
		System.out.println("shape");
	}
}

class Circle extends Shape {
	int x;
	int y;
	int r;

	@Override
	void draw() {
		System.out.println("circle");
	}
}

public class PolinoTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.color = "green";
		c.r = 20;
		c.x = c.y = 10;
		c.draw();

		Shape s = new Circle(); // upcasting 자식객체를 부모 레퍼런스 타입에 받은거
		s.color = "red";
//		s.x=10; 불가능, 부모 타입의 정보만 가능
		s.draw(); // 다형성:상속과 upcasting, override가 된 메서드는 자식 객체를 부모 타입의 변수로 호출 시 자식의 메서드가 실행된다
	}

}
