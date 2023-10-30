
public class Ex4_1 {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 5, 5, 5, 5, 5 }, 
				{ 10, 10, 10, 10, 10 }, 
				{ 20, 20, 20,  }, 
				{ 30, 30, 30, 30, 30 } 
		};
		int total = 0;
		float average = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) { //이게 4 아님?
			for (int j = 0; j < arr[i].length; j++) { //이건 5고
				total += arr[i][j]; //arr[4][5]같은데
	}
			count+=arr[i].length;
		}
		

	average = total / (float)count;
		System.out.println("totat=" + total);
		System.out.println("average=" + average);
}
}
