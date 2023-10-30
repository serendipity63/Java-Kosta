//exc511이랑 유사함
public class ArrayTest7 {

	public static void main(String[] args) {
		int[][] narr = {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120}
		};
		int[][] result = new int[narr.length+1][narr[0].length+1]; //[행개수] [열개수]		
		for(int i=0; i<narr.length;i++) { //행의 개수만큼 반복
			for(int j=0; j<narr[i].length;j++) { //열의 개수만큼 반복
				result[i][j] += narr[i][j];
				result[i][result[i].length-1] += narr[i][j]; 
				//누적시키는거 result[i].length-1>행의 마지막 열 이 케이스엔 4 이게 sum 값 
				//왜 [i]를 쓰냐면 이게 가로값 구하는거니까
				result[result.length-1][j] += result[i][j];
				//이거 세로 값 누걱 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ맞춤 마지막 행 누적
				result[result.length-1][result[i].length-1] += narr[i][j];
				//마지막 행열에 누적 780
				
				
				//같은 열의 마지막 행
			}								
		}
			for(int i=0; i<result.length;i++) { //열의 개수
				for(int j=0; j<result[i].length;j++) {
					System.out.print(result[i][j]+"\t");			
				}
			System.out.println();
			}

		}
}
// 10 20 30 40 100
// 50 60 70 80 260.. so on
// 150 180 ㅇㅇㅇ