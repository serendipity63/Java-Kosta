package ch6;

public class Ex3_4_5 {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());

	}
}

class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		float avg = (float) getTotal() / 3;
		// 75.545 => 76
		// 75.545*10=> 755.45=>755(round)/10.0->75.5
		return Math.round(avg * 10) / 10.0f;
	}

	String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
}

//class를 제대로 분리할것
