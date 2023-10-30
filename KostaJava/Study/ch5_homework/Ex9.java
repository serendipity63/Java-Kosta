//주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
package ch5_homework;
public class Ex9 {

	public static void main(String[] args) {
	char[][] star = {
			  { '*', '*', ' ', ' ', ' ' }
			, { '*', '*', ' ', ' ', ' ' }
			, { '*', '*', '*', '*', '*' }
			, { '*', '*', '*', '*', '*' } };
	char[][] result = new char[star[0].length][star.length];
	for (int i = 0; i < star.length; i++) {
		for (int j = 0; j < star[i].length; j++) {
			System.out.print(star[i][j]);
		}
		System.out.println();
	}
	System.out.println();
	for (int i = 0; i < star.length; i++) {
		for (int j = 0; j < star[i].length; j++) {
			result[j][star.length-1-i] = star[i][j]; //열은 3-i 하나하나식 찍어보면 이해완 so 4(세로길이)-1
			// int x = j;
			// int y = star.length-1-i;
			// result[x][y]=star[i][j];
		
		}
	}
	for (int i = 0; i < result.length; i++) {
		for (int j = 0; j < result[i].length; j++) {
			System.out.print(result[i][j]);
		}
		System.out.println();
	}
}
}
