package ch5_homework;
public class Ex1 {

	public static void main(String[] args) {
//		a. int[] arr[]; - ok
//		b. int[] arr = {1,2,3,}; - 가능; 쉼표 상관 ㄴㄴ
//		c. int[] arr = new int[5]; - 길이가 5인 int형 배열을 생성
//		d. int[] arr = new int[5]{1,2,3,4,5}- 불가 두번째에 숫자 ㄴㄴ
//		e. int arr[5]; - 배열을 선언할땐 크기지정 ㄴㄴ
//		f. int[] arr[] = new int[3][];
		
//[5-2] 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?		
//		int[][] arr = {
//				{ 5, 5, 5, 5, 5},
//				{ 10, 10, 10},
//				{ 20, 20, 20, 20},
//				{ 30, 30}
//				};
		//2 {30,30}
//[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		
//		for(int i=0; i< arr.length;i++)
//		{
//			sum += arr[i];
//		}
//		
//		System.out.println("sum="+sum);
		
//		2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
				int total = 0;
				float average = 0;
				
				for(int i=0; i<arr.length;i++) {					
					for(int j=0; j<arr[i].length; j++) {
						total += arr[i][j];
						
					}
				}
				average = total/(float)(arr.length * arr[0].length);
				
				System.out.println("totat="+total);
				System.out.println("average="+average);
				} 
				} 
		
	


