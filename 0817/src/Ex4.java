//모든 값의 총합과 평균을 구하는 프로그램
public class Ex4 {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 5, 5, 5, 5, 5 }, 
				{ 10, 10, 10, 10, 10 }, 
				{ 20, 20, 20, 20, 20 }, 
				{ 30, 30, 30, 30, 30 } 
		};
		int total = 0;
		float average = 0;
//여기부터		
		for (int i = 0; i < arr.length; i++) { //이게 4 아님?
			for (int j = 0; j < arr[i].length; j++) { //이건 5고
				total += arr[i][j]; //arr[4][5]같은데
			}
		}
		average = total / (float) (arr.length * arr[0].length);
		//행의 개수 곱하기 열의 개수
		//근데 왜 이건 arr[0]로 쓰는지 모르겠음 다른걸로 바꿔보기 왜 i는 안되는데
		//열의 개수는 엥간하면 걍 [0]으로 하기
//여기까지
		System.out.println("totat=" + total);
		System.out.println("average=" + average);
	} // end of main
} // end of class


