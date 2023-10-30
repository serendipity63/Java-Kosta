package ch6;

public class ClassTest1 {

	public static void main(String[] args) {
		// 클래스 파일은 클래스마다 만들어진다
		// main은 public에 붙어있어야함
		// class는 reference 변수
		int n;
		double d;
		int[] arr = new int[3];
//classtest1에서 student을 활용
		Student stu1 = new Student();
		// new라는 연산자가 stu1에 담음 new student가 객체 stu1는 담는곳
		Student stu2;

		stu1.name = "홍길동";
		// 레퍼런스를 통해 넣는다
		stu1.address = "서울시 금천구";
		stu1.grade = 4;
		stu1.num = 10001;

		System.out.println(stu1.info());

	}

}
