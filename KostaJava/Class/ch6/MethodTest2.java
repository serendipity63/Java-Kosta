package ch6;

class Data {
	int x;

}

public class MethodTest2 {
	static void increment(int x) { // return type void increment method만듬
		x += 1;
		System.out.println(x); // 11
	}

	static void increment(Data d) {
		d.x += 1;
		System.out.println(d.x); // 11

	}

	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;

		increment(data.x); // 파라미터 인트
		System.out.println(data.x); // 10

		increment(data); // data주소를 넘김
		System.out.println(data.x); // 11 원본을 바꾸어서?
	}

}
