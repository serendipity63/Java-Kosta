package ch5;
import java.util.Scanner;

/*
 * 입력 데이터 수 : 5
 * 95
 * 100
 * 85
 * 77
 * 60
 * 
 * 출력
 * 60 77 85 95 100
 * */

public class ArrayTest14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수: ");
		int cnt = sc.nextInt(); // 여기까지 배열 입력

		int[] arr = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int tmp = 0;
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

//5개 데이터를 입력하고 그 데이터를 정렬하는 것
//더블 정렬 알고리즘
//별표치기 같은거
//포문 이용해서 