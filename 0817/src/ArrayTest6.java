
public class ArrayTest6 {

	public static void main(String[] args) {
		int[][] narr = {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120}
		};
		
		int sum = 0;
		
		for(int i=0; i<narr.length;i++) { //행의 개수
			for(int j=0; j<narr[i].length;j++) { //열의 개수?
				sum += narr[i][j]; //왜 narr[i]를 쓰냐면 서랍을 생각하면 됨
				//그 가변적 배열이 아니면 n번째 서랍의 칸의 개수를 구해야 하기 때문에 그래서
				//narr[i].length는 4임 narr.length는 3이고 
				
				
				
			}
		}
		System.out.println(sum); //<이건 모든 토탈
	

	}

}
//근데 여기서 완전 토탈을 구하려면 어떻게 하지?