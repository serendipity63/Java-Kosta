package ch6;

class MyMath {
	static int add(int x, int y) { // int x=10; int y=20;
		int result = x + y;
		return result;
	}

	static int multi(int x, int y) {
		int result = x * y;
		return result;
	}
}

public class MethodTest1 {
	public static void main(String[] args) {
//		MyMath nm = new MyMath();
		int res = MyMath.add(10, 20); // method 호출 걍 값을 넣기 그래서 int안써도 ㄱㅊ ref를 통해서 호출
		System.out.println(res); // return은 호출한 그 자리에 온다 그걸 res에 담았다
		res = MyMath.multi(100, 200);
		System.out.println(res);
	}

}
