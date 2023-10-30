package ch11;

//클래스를 새로 생성하고 새로 정의하는 느낌?
class Data<T> { // 미정데이터 T(아무거나 ㄱㄴ) 보통 대문자
	T data;

	void setData(T data) {
		this.data = data;

	}

	T getData() {
		return data;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		Data<String> d = new Data<>();
		d.setData("hong");
		String s = d.getData();
		System.out.println(s);

		Data<Integer> d2 = new Data<>();
		d2.setData(200);
		int n = d2.getData();
		System.out.println(n);

		Data<Person> d3 = new Data<>();
		d3.setData(new Person("james", 30));
		Person p = d3.getData();
		System.out.println(p);

		// d2=d; //X, 다른 타입으로 생성된 제너릭 객체는 동일한 클래스가 아니다.(상속관계도 아니다)
		Data<Person> d4 = new Data<>();
//		d3=d4; //O, 같은 타입으로 생성된 제너릭 객체는 동일한 클래스다
	}

}
