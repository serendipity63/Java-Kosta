package ch7;

class Parent {
	int n;
//	Parent() {
//		System.out.println("Parent()");
//
//	}

	Parent(int n) {
		this.n = n;
		System.out.println("Parent(int n)");
	}
}

class Child extends Parent {
	int m;

	Child() {
		super(0); // 부모의 기본생성자가 아닌 다른 생성자를 호출시키고 싶으면
		System.out.println("Child()"); // Child() 호출해서 출력
	}

	Child(int n, int m) {
		super(n); // n은 부모꺼 초기화 시키는 변수 부모생성자를 먼저 호출시켜야 한다
		this.m = m;

	}
}

public class InheritTest3 {

	public static void main(String[] args) {
//		Parent p = new Parent();
		Child c = new Child(10, 20); // 이게 Parent()이 출력됨 n=10 m=20
	}

}
