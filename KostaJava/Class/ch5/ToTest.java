package ch5;
import java.util.Scanner;

public class ToTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		int money = 0;
		int[] coins = { 5000, 1000, 500 };
		int[] price = { 1500, 2500, 2500, 2000, 3000 };

		while (true) { // 무한반복문
			System.out.println("[코스타 카페]");
			System.out.println("1. 아메리카노(1500원)");
			System.out.println("2. 카페라떼(2500원)");
			System.out.println("3. 카푸치노(2500원)");
			System.out.println("4. 에스프레소(2000원)");
			System.out.println("5. 카페모카(3000원)");
			System.out.println("0. 종료");
			System.out.println("메뉴를 선택하세요>");
			sel = sc.nextInt();
			if (sel == 0)
				break;
			System.out.println("돈을 넣으세요>");
			money = sc.nextInt();

			if (money < price[sel - 1]) { // sel-1 인덱스 값을 맞추기 위해서
				// 이거 sel이랑 price 매칭하려고, 근데 만약 매칭 한 값보다 input한 돈이 적으면
				System.out.println("돈이 부족합니다.");
				// 돈이 부족합니다 라는 프린트를 내놓음
				continue;

			}
			int change = money - price[sel - 1]; // <잔돈계산
			System.out.println("잔돈: ");
			for (int i = 0; i < coins.length; i++) {
				int cnt = change / coins[i];
				// 잔돈 몇개씩 있는지 계산함
				if (cnt > 0) {
					System.out.println(String.format("%d(%d)", coins[i], change / coins[i]));
				}
				change %= coins[i];
				// 잔돈은 코인의 나머지값?
			}
			System.out.println();
		}
	}
}

// 0이면 종료 아니면 계속 화면 유지
//코스타 카페 안에 다 들어가야함
// 1. 입금이 가격보다 작을 경우 : 돈이 부족합니다.
// 2. 잔돈: 500(1) ,100(0), 50(0), 10(0)
// 우선 1-4 사이의 메뉴를 골라야함> 그 고른 메뉴의 가격을 홀드
//  그 후 내가 돈을 투입함> 그리고 거기에 매칭되는 가격을 뺌
// 그리고 거기에다가 거스름돈 매칭함