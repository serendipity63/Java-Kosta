package ch6;

class Person { // 정의
	String name;
	int age;

	String info() { // method 정의 ()<파라미터or아규먼트
		return "이름:" + name + " 나이:" + age;
	}
}

public class ClassTest2 {
	public static void main(String[] args) {
		Person per1 = new Person();
		// Person type new Person으로 객체 생성 변수 생성 메모리 2개 생성 (네임 에이지)
		per1.name = "홍길동";
		per1.age = 30;
		System.out.println(per1.info()); // info method 호출(실행)
		// 왠지 엑셀 느낌남 기능 갖다 쓴다

		Person[] parr = new Person[5];
		// Person배열 생성 reference 5개 생성 객체5개x
		parr[0] = new Person();
		parr[1] = new Person();
		parr[2] = new Person();
		parr[3] = new Person();
		parr[4] = new Person();
		// 이제 5개의 객체 생성

	}

}
