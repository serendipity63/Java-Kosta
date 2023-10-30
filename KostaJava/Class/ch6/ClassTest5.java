package ch6;

class Account {
	String id;
	String name;
	int balance;

	Account() {
	}

	Account(String aid, String aname, int money) {
		id = aid; // 초기화
		name = aname;
		balance = money;
	}; // 생성자
		// 이름이 같을 경우 가장 가깝게 선언된 변수만 인식함

	String info() {
		return String.format("계좌번호:%s,이름:%s,잔액:%d", id, name, balance);
	}

	void deposit(int money) { // 밸런스를 바꿈
		balance += money;

	}

	void withdraw(int money) { // 역할 밸런스를 바꿈
		if (balance >= money) {
			balance -= money;
		}
	}
}

class Bank {
	Account[] accs = new Account[100]; // 객체 만들어서 배열에 담아야함
	// 길이가 100인 Account타입의 참조변수 배열
	int accCnt;

	// makeAccount method 만들기?
	void makeAccount(String id, String name, int money) {
		Account acc = new Account(id, name, money); // Account 인스턴스의 주소를 acc에 저장

	}

	void allAccountInfo() {
		for (int i = 0; i < accCnt; i++) {
			System.out.println(accs[i].info()); // for문을 이용해서 전체 계좌 정보를 불러온다
		}
	}

	Account searchAccById(String id) {
		for (int i = 0; i < accCnt; i++) {
			if (accs[i].id.equals(id)) {
				return accs[i];

			}
		}
		return null;
	}

	void accountInfo(String id) {
		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;

		}
		System.out.println(acc.info());
	}

	// for문 사용해서 매칭되는 배열을 찾는다

	void deposit(String id, int money) {

		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		acc.deposit(money);
	}

	void withdraw(String id, int money) {

		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;

		}
		acc.deposit(money);
	}

}

//계좌번호: 10001, 이름: 고길동, 잔액: 100000
public class ClassTest5 {
	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.makeAccount("10001", "고길동", 100000);
		bank.makeAccount("10002", "김길동", 200000);

		bank.allAccountInfo();
		// 계좌번호: 10001, 이름: 고길동, 잔액:100000
		// 계좌번호: 10002, 이름: 김길동, 잔액:200000 싹다 뜨게해야함

		bank.accountInfo("10001"); // "10001"< 파라미터
		// 계좌번호:10001, 이름: 고길동, 잔액:100000

		bank.deposit("10001", 10000);
		bank.accountInfo("10001");
//		// 계좌번호:10001, 이름: 고길동, 잔액:110000
//
		bank.withdraw("10001", 5000);
		bank.accountInfo("10001");
		// 계좌번호:10001, 이름: 고길동, 잔액:105000

//		Account acc1 = new Account();
//		acc1.id = "10001";
//		acc1.name = "고길동";
//		acc1.balance = 100000;
//		System.out.println(acc1.info());
//		acc1.deposit = (100000);
//		System.out.println(acc1.info());
//		acc1.withdraw = (100000);
//		System.out.println(acc1.info());
	}

}
