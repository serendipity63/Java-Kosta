import java.util.Iterator;
import java.util.Map;
import java.util.Scanner; //자바 폴더 안에 유틸 폴더 안에 스캐너
import java.util.TreeMap;

import acc.Account; //다른 패키지에 있는 Account class 불러오기
import acc.SpecialAccount;
import exc.BankError;
import exc.BankException;

public class Bank {
	Map<String, Account> accs = new TreeMap<>(); // 정렬
	Scanner sc = new Scanner(System.in);

	int menu() throws BankException {

		System.out.println("[코스타 은행]");
		System.out.println("1.계좌개설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.계좌조회");
		System.out.println("5.전체계좌조회");
		System.out.println("0.종료");
		System.out.println("선택>>");

		int sel = Integer.parseInt(sc.nextLine());
		if (!(sel >= 0 && sel <= 5)) {
			throw new BankException("메뉴오류", BankError.MENU);
		}

		return sel;

	}

	void selAccMenu() throws BankException {
		System.out.println("[계좌개설]");
		System.out.println("1.일반계좌");
		System.out.println("2.특수계좌");
		System.out.println("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		switch (sel) {
		case 1:
			makeAccount();
			break;
		case 2:
			makeSpecialAccount();
			break;
		default:
			throw new BankException("메뉴오류", BankError.MENU);

		}
	}

	void makeAccount() throws BankException {
		System.out.println("[일반계좌개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		if (accs.containsKey(id)) { // 중복계좌번호 거르기
			throw new BankException("계좌오류", BankError.EXISTID);
		}
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		accs.put(id, new Account(id, name, money));

	}

	void makeSpecialAccount() throws BankException {
		System.out.println("[특수계좌개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		if (accs.containsKey(id)) { // 중복계좌번호 거르기
			throw new BankException("계좌오류", BankError.EXISTID);

		}
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급(VIP-V,Gold-G, Silver-S,Normal-N):");
		String grade = sc.nextLine();
		// 추가 특수계좌 클래스
		accs.put(id, new SpecialAccount(id, name, money, grade)); // 업캐스팅 다형성 적용

	}

	void deposit() throws BankException {
		System.out.println("[입금]");
		System.out.print("계좌 번호:");
		String id = sc.nextLine();
		if (!accs.containsKey(id)) {
			throw new BankException("계좌오류", BankError.NOID);
		}
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		accs.get(id).deposit(money); // id를 가지고 deposit을 호출한다
	}

	void withdraw() throws BankException {
		System.out.println("[출금]");
		System.out.print("계좌 번호:");
		String id = sc.nextLine();
		if (!accs.containsKey(id)) {
			throw new BankException("계좌오류", BankError.NOID);
		}
		System.out.print("출금액:");
		int money = Integer.parseInt(sc.nextLine());
		accs.get(id).withdraw(money);

	}

	void accountInfo() throws BankException {
		System.out.println("[계좌조회]");
		System.out.print("계좌 번호:");
		String id = sc.nextLine();
		if (!accs.containsKey(id)) {
			throw new BankException("계좌오류", BankError.NOID);
		}
		System.out.println(accs.get(id));
	}

	void allAccountInfo() {
		System.out.println("[전체 계좌 조회]");
		Iterator<Account> it = accs.values().iterator(); // iterator활용
		while (it.hasNext()) {
			System.out.println(it.next());
		}

//		for(Account acc: accs.values()) { //향상된 포문
//			System.out.println(acc);
//		}		

	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		int sel;
		while (true) {
			try {
				sel = bank.menu(); // menu는 인스턴스 매서드
				if (sel == 0)
					break;
				switch (sel) {
				case 1:
					bank.selAccMenu();
					break;
				case 2:
					bank.deposit();
					break;
				case 3:
					bank.withdraw();
					break;
				case 4:
					bank.accountInfo();
					break;
				case 5:
					bank.allAccountInfo();
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("입력형식이 맞지 않습니다. 다시 선택하세요.");

			} catch (BankException e) {
				System.out.println(e);

			}

		}

	}
}
