//다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’을 찍어서 그래프
public class Ex8 {

	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		
		for (int i = 0; i < answer.length; i++) {
			
//			if(answer[i]==1) counter[0]++;
//			else if(answer[i]==2) counter[1]++;
//			else if(answer[i]==3) counter[2]++;
//			else if(answer[i]==4) counter[3]++;
			counter[answer[i]-1]++; //중복값 카운트
		}
		for (int i = 0; i < counter.length; i++) {			
			System.out.print(counter[i]);
			for (int j = 0; j < counter[i]; j++) { 
				System.out.print("*"); //별 프린트
				
			}
			System.out.println();
		}
	} // end of main
} // end of class