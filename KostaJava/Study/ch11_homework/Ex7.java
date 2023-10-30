package ch11_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ex7 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>(); // student객체를 저장할 arraylist 생성
		list.add(new Student("이자바", 2, 1, 70, 90, 70));
		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 2, 80, 80, 90));
		Collections.sort(list, new BanNoAscending());
		// list를 bannoascending comparator
		Iterator<Student> it = list.iterator();
//		iterator를 사용하여 리스트를 순회
		while (it.hasNext()) // 다음 항목이 있을 때까지 반복
			System.out.println(it.next()); // 다음 항목 출력
	}
}

class BanNoAscending implements Comparator<Student> {
	// BanNoAscending 클래스는 Student를 비교하는 Comparator
	public int compare(Student s1, Student s2) {
		// 두 학생 객체를 비교하는 compare 메서드
		int ret = s1.ban - s2.ban; // 반 비교
		if (ret == 0) {// 반이 같다면
			ret = s1.no - s2.no; // 번호 비교
		}
		return ret;
	}

}

//남궁성,1,1,90,70,80,240,80.0 
//김자바,1,2,80,80,90,250,83.3 
//홍길동,1,3,100,100,100,300,100.0 
//이자바,2,1,70,90,70,230,76.7 
//안자바,2,2,60,100,80,240,80.0