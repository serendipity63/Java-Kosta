package ch6_1;

//static 관련 강의
class Number {
	int inum;
	static int snum;

	void imethod() {
		inum = 10;
		snum++; // instance 메서드에서는 static 변수 사용 가능
		imethod2(); // instance에서는 static instance 메소드 호출 가능
		smethod();
	}

	void imethod2() {

	}

	static void smethod() {
		snum = 100;
//		inum=10; //static method에서는 instance 변수 사용 불가
		smethod2();
//		imethod(); //static 메소드에서는 instance 메서드 호출 불가		
	}

	static void smethod2() {

	}
}

public class StaticTest1 {
	public static void main(String[] args) { // 대표 static이 main(main은 자동호출이니까 static이여야만 한다
// static(class)변수는 객체 생성없이 사용 가능(프로그램 시작 시 이미 변수가 생성되었기때문)
		System.out.println(Number.snum);
		Number.smethod(); // method static 변수도 동일

//		System.out.println(Number.inum); instance 변수는 객체 생성해야만 사용 가능
//		Number.imethod(); instance methods는 객체 생성해야만 호출 가능
		Number n = new Number();
		System.out.println(n.inum);
		System.out.println(n.snum); // static 변수는 레퍼런스를 통해서도 접근 가능
		n.imethod();
		n.smethod();

	}

}
