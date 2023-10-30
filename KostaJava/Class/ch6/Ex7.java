package ch6;

class MyPoint {
	int x;
	int y;

//문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서
//드로 정의하시오.
//double getDistance(int x1, int y1) {
//	return Math.sqrt(x - x1) * (x - x1) + (y - y1) * (y - y1);
	double getDistance(MyPoint pos) {
		return Math.sqrt((x - pos.x) * (x - pos.x) + (y - pos.y) * (y - pos.y));
	}
}

public class Ex7 {

	public static void main(String[] args) {
		MyPoint pos1 = new MyPoint();
		pos1.x = 1;
		pos1.y = 1;

		MyPoint pos2 = new MyPoint();
		pos2.x = 2;
		pos2.y = 2;

//		System.out.println(pos1.getDistance(2,2));
		System.out.println(pos1.getDistance(pos2));

	}

}
