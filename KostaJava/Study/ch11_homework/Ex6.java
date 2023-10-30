package ch11_homework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	// <Student>:제네릭 타입, 클래스나 인터페이스를 일반화하여 다양한 타입에 대해 재사용 가능한코드를 작성할 수 있도록 해줌
	// Student class가 comparable 인터페이스를 구현한다
	// comparable인터페이스에 정의된 compareto 메서드를 반드시 구현해야 한다
	// student 클래스가 다른 student 객체과 비교 가능하도록 하는 인터페이스 구현
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	// 생성자: 학생 정보 초기화
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() { // 총점 계산 메서드
		return kor + eng + math;
	}

	float getAverage() { // 평균 계산 메서드
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() { // 객체 정보 문자열 반환
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	// comparable 인터페이스의 compareto 메서드 구현
	public int compareTo(Student o) {
		return name.compareTo(o.name); // 이름을 기준으로 학생들을 비교하여 정렬

	}

} // class Student

public class Ex6 {
	static int getGroupCount(TreeSet<Student> tset, int from, int to) {
		SortedSet<Student> ss = tset.subSet(new Student("", 0, 0, from, from, from), new Student("", 0, 0, to, to, to));
//from과 to는 비교대상 점수만 가지고 비교한다 
		return ss.size();
	}

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getTotal() - o2.getTotal(); // 평균을 기준으로 정렬 왜냐면 토탈이 크면 평균도 크니까
//				if (o1.getAverage() > o2.getAverage())
//					return 1;
//				else if (o1.getAverage() < o2.getAverage())
//					return -1;
//				else
//					return 0;
			}
		});

//		Treeset<Student> set = new Treeset<>();

		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));

		Iterator<Student> it = set.iterator();// 반복자

		while (it.hasNext())
			System.out.println(it.next());

		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
}
