
public class Ex9 {

	public static void main(String[] args) {
		char[][] star = { 
				  { '*', '*', ' ', ' ', ' ' }
				, { '*', '*', ' ', ' ', ' ' }
				, { '*', '*', '*', '*', '*' }
				, { '*', '*', '*', '*', '*' } 
		}; //4x5
		char[][] result = new char[star[0].length][star.length]; //5x4
		//행의 개수가 열의 개수 열의 개수만큼이 행의 개수
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				result[j][star.length-1-i] = star[i][j];
				//열은 3-i 하나하나식 찍어보면 이해완
				//so 4(세로길이)-1
				
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	} // end of main
} // end of class
