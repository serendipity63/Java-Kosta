package ch7;

class A {
	// 1. A() {} 이렇게 A의 기본생성자를 만들어야 처음에 에러가 안 뜰 수 있다
	A(int m) {
	}
}

class B extends A { // A의 기본생성자를 만들어야함

	B(int m) { // 2. 아니면 B의 기본생성자를 만들던가
		super(m); // 부모가 실제 있는 유형으로 super를 붙이면 됨
	}

}

public class InheritTest4 {

	public static void main(String[] args) {

	}

}
