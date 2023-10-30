package ch7_homework;

//company와 유사 다 포함한다
public class ShapeSet {

	Shape[] shapes = new Shape[100];
	int count;

	public void add(Shape shapee) {
		shapes[count++] = shapee;

	}

	public void allShapeDraw() {
		for (int i = 0; i < count; i++) {
			System.out.println(shapes[i].draw());
		}

	}

}
