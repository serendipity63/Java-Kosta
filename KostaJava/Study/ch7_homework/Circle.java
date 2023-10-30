package ch7_homework;

public class Circle extends Shape {
	Point point = new Point(); // 클래스 가져오는거
	int radius;

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle() {

	}

	public Circle(String color, Point point, int radius) {
		super(color);
		this.point = point;
		this.radius = radius;

	}

	public Circle(String color, int point, int point2, int radius) {
		super(color);
		this.point.x = point;
		this.point.y = point2;
		this.radius = radius;

	}

	@Override
	public String draw() {
		return String.format("[원:색(%s),중심점(%d,%d),반지름(%d)]", color, point.x, point.y, radius);
//				[원:색(red),중심점(10,10),반지름(20)]
//				"[원: 색:" + color + "중심" + point.x + "," + point.y + "반지름" + radius + "]";
//getcolor과 getradius가 낫다		
	}
}
