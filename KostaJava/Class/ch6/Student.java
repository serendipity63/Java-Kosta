package ch6;

public class Student {
	String name;
	String address;
	int grade;
	int num;

	String info() {
		return String.format("이름:%s,주소:%s,학년:%d,학번:%d", name, address, grade, num);

	}
}