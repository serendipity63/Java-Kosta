package ch7;

class Person {
	int age;
	String name;

	Person() {
	}

	Person(String name, int age) { // 생성자
		this.name = name;
		this.age = age;

	}

	String info() {
		return "이름:" + name + ",나이:" + age;
	}
}

class Student extends Person {
	String major;
	int grade;

	Student() { // 이건 왜 했지?

	}

	Student(String name, int age, String major, int grade) {
		super(name, age);
//		this.name=name;
//		this.age=age;
		this.major = major;
		this.grade = grade;

	}

	@Override // 부모의 메서드를 재정의 한다. overriding !=overloading
	String info() { // 상속이 전제조건
		// TODO Auto-generated method stub
		return super.info() + "전공:" + major + ",학년:" + grade;
		// this랑 비슷하지만 super는 부모꺼를 의미한다

	}
}

public class InheritTest1 {
	public static void main(String[] args) {
		Student stud1 = new Student(); // 자식 객체를 통해 부모 클래스의 속성과 메서드를 사용할 수 있다.
		stud1.name = "열심히";
		stud1.age = 20;
		stud1.major = "산업공학";
		stud1.grade = 2;
		System.out.println(stud1.info()); // 부모의 인포기능 갖다 씀

		Student stud2 = new Student("돈많은", 40, "금융", 3); // ㅇㅁ

		Person per1 = new Person();
		per1.name = "내로남불";
		per1.age = 30;
//		per1.major = "얌체과"; //부모 객체는 자식의 속성과 메서드를 사용할 수 없다.
//		per1.grade = 3;
		System.out.println(per1.info());
	}

}
