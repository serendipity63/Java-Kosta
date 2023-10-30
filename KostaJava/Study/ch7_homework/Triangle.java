package ch7_homework;

public class Triangle extends Shape {
	Point p1 = new Point(); // 아니면 Point p1;도 괜찮음 대신 public triangle에 p1= new Point();해줘야함
	Point p2 = new Point();
	Point p3 = new Point();

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	public Triangle() {

	}

	public Triangle(String color, Point p1, Point p2, Point p3) { // xpo
		super(color);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Triangle(String color, int p1x, int p1y, int p2x, int p2y, int p3x, int p3y) {

		super(color);
		this.p1.x = p1x;
		this.p1.y = p1y;
		this.p2.x = p2x;
		this.p2.y = p2y;
		this.p3.x = p3x;
		this.p3.y = p3y;
	}

	@Override
	public String draw() {
		return String.format("[삼각형:색(%s),점1(%d,%d),점2(%d,%d),점3(%d,%d)]", color, p1.x, p1.y, p2.x, p2.y, p3.x, p3.y);

//				"[삼각형: 색:" + color + "점1" + p1.x + "," + p1.y + "점2" + p2.x + "," + p2.y + "점3" + p3.x + "," + p3.y+ "]";
	}

}
