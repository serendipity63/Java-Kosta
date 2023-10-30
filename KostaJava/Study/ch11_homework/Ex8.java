package ch11_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student1 implements Comparable<Student1> {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank;

// 총점
// 전교등수
	Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public int compareTo(Student1 s) {
		int ret = s.total - s.total;
		return ret;

		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank // 새로추가
		;
	}
}

public class Ex8 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		
		for(Student1 list: )

//		1. 반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다. 1.1 총점(total)이 이전총점(prevTotal)과 같으면
//		이전 등수(prevRank)를 등수(schoolRank)로 한다. 1.2 총점이 서로 다르면,
//		등수(schoolRank)의 값을 알맞게 계산해서 저장한다.
//		이전에 동점자 였다면, 그 다음 등수는 동점자의 수를 고려해야한다. (실행결과 참고)
//		1.3 현재 총점과 등수를 이전총점(prevTotal)과 이전등수(prevRank)에 저장한다.
	}

	public static void main(String[] args) {
		ArrayList<Student1> list = new ArrayList<>();
		list.add(new Student1("이자바", 2, 1, 70, 90, 70));
		list.add(new Student1("안자바", 2, 2, 60, 100, 80));
		list.add(new Student1("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student1("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student1("김자바", 1, 2, 80, 80, 90));
		calculateSchoolRank(list);
		Iterator<Student1> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}
}