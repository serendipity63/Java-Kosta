package ch7_homework;

public class Rectangle extends Shape {
	Point p1 = new Point(); // 2 int
	int width;
	int height;

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle() {

	}

	public Rectangle(String color, Point p1, int width, int height) {
		super(color);
		this.p1 = p1;
		this.width = width;
		this.height = height;

	}

	public Rectangle(String color, int point, int point2, int width, int height) {
		super(color);
		this.p1.x = point;
		this.p1.y = point2;
		this.width = width;
		this.height = height;
	}

	@Override
	public String draw() {
		return String.format("[사각형:색(%s),시작점(%d,%d),너비(%d),높이(%d)]", color, p1.x, p1.y, width, height);
//				"[사각형:" + " 색:" + color + "시작점" + p1.x + "," + p1.y + "너비" + width + "높이" + height + "]";
	}

}
// 포인트 찾는거 변수
// stringformat 하기
