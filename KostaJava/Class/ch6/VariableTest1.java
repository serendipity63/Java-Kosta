package ch6;

class MyClass { // 여기 들어있는 변수는 정의에 불과함
	int num;
	static int snum;

	void setNum(int n) {

	}
}

public class VariableTest1 {

	public static void main(String[] args) {
		int n; // 자동초기화x 지역변수(method 안에 선언된 변수
		MyClass mc = new MyClass(); // num 변수 생성 new에 인해 생성된 변수는 자동초기화o
		// System.out.println(n); //초기화 하지 않고 사용시 에러
		System.out.println(mc.num); // 초기화 하지 않고 사용 가능
	}

}
//힙영역 동적으로 메모리 생성? 
