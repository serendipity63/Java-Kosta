package ch6_1;

class Account {
	String id;
	String name;
	int balance;

	Account(String id, String name, int balance) {
		this.id = id; // this는 구별하기 위해서 쓴다 class 안의 메서드에만 쓴다
		this.name = name;
		this.balance = balance;

	}

	String info() {
		return "계좌번호:" + this.id + ",이름:" + this.name + ",잔액" + this.balance;

	}

}

public class ThisTest1 {

	public static void main(String[] args) {
		Account acc1 = new Account("10001", "홍길동", 100000);
	}

}
