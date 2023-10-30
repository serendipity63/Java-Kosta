package ch5;
import java.util.Scanner;

//100 미만의 양의 정수들이 주어진다
//입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고
//그때까지 입력된 정수의 십의 자리 숫자가 각각 몇개인지 
//작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)
//입력:10 55 3 63 85 61 85 0(끝) 무조건 100 미만
//출력:
//0:1
//1:1
//5:1
//6:2
//8:2
//입력 받아서 0이면 끝나는 무한반복문 or do while
public class ArrayTest11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[10];

		while (true) {
			int num = 0;
			num = sc.nextInt();
			if (num == 0)
				break;
			cnt[num / 10]++; // 인덱스
		}

		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] > 0) {
				System.out.println(String.format("%d : %d", i, cnt[i]));
			}

		}

	}

}
// 0이 아닐때까지 반복한다