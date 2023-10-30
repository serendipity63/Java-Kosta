package ch9_homework;

public class Ex4 {
	static void printGraph(int[] dataArr, char ch) {
		for (int n : dataArr) { // 향상된 포문, 데이터를 하나하나 참조해서 쓸때
			for (int i = 0; i < n; i++) {
				System.out.print(ch);
			}
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		printGraph(new int[] { 3, 7, 1, 4 }, '*');
	}
}
//***3
//*******7
//*1
//****4