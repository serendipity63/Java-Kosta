package ch5;
import java.util.Scanner;

/*
 * 입력 데이터 수 :5
 * 95
 * 100
 * 85
 * 77
 * 60
 * 
 * 출력
 * 최소값:60
 * 최대값:100
 */
public class ArrayTest15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수: ");
		int cnt = sc.nextInt(); // 여기까지 데이터 입력하는거

		int arr[] = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		// 초기화 느낌
		for (int i = 1; i < cnt; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];

		}

		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	}
}
