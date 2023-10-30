package ch7_homework;

public abstract class Shape {
//employee와 유사
	String color;

	public Shape() {

	}

	public Shape(String color) {
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract String draw(); // 나는 이 함수가 필요한데 껍데기만 필요함abstract
	// string draw 대신 void draw()가능
}
