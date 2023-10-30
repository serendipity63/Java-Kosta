//package ch7_1;
//
//public class Ex22 {
//}
//
//abstract class Shape {
//	Point p;
//
//	Shape() {
//		this(new Point(0, 0)); // 필드?
//
//	}
//
//	Shape(Point p) { // 생성자
//		this.p = p;
//	}
//
//	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
//
//	Point getPosition() {
//		return p;
//	}
//
//	void setPosition(Point p) {
//		this.p = p;
//	}
//}
//
//abstract class Circle extends Shape {
//	double radius;
//
//	public Circle() {
//	}
//
//	public Circle(double radius) {
//	}
//
//	@Override
//	double calcArea() {
//		return Math.PI * radius * radius;
//	}
//
//}
//
//abstract class Rectangle extends Shape {
//	int width;
//	int height;
//
//	public Rectangle() {
//		super(); // 좌표 설정
//
//	}
//
//	public Rectangle(int width, int height) {
//		this.height = height;
//		this.width = width;
//
//	}
//
//	@Override
//	double calcArea() {
//		return width * height;
//	}
//
//	public boolean isSquare() {
//		if (width == height) {
//			return true;
//		}
//		return false;
//
//	}
//
//}
//
//class Point {
//	int x;
//	int y;
//
//	Point() { // 초기값
//		this(0, 0);
//	}
//
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	public String toString() {
//		return "[" + x + "," + y + "]";
//	}
//}
