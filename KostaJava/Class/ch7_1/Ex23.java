package ch7_1;

public class Ex23 {
	public static double sumArea(Shape[] arr) {
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();

		}
		return sum;

	}

	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합:" + sumArea(arr));

	}

}

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0)); // 포인트를 넣어주지 않으면 기본 0,0

	}

	Shape(Point p) { // 생성자
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Circle extends Shape { // abstract class 상속하면 반드시 override해야함 아니면 이걸 abstract하던가
	double r; // 변수

	public Circle() { // 생성자
	}

	public Circle(double r) {
		this.r = r;
	}

	@Override
	double calcArea() {
		return Math.PI * r * r; // final 변수는 대문자로만 쓴다 두단어 이상일 변수명의 경우는 언더바를 쓴다
	}

}

class Rectangle extends Shape {
	int width;
	int height;

	public Rectangle() {

	}

	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;

	}

	@Override
	double calcArea() {
		return width * height;
	}

	public boolean isSquare() {
		return width * height != 0 && width == height;
	}

}

class Point {
	int x;
	int y;

	Point() { // 초기값
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}
