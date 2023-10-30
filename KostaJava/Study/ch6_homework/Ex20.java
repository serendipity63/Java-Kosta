package ch6_homework;

/*[6-20] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음. 메서드명 : shuffle
기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
처리한 배열을 반환한다.
반환타입 : int[]
매개변수 : int[] arr - 정수값이 담긴 배열*/
public class Ex20 {

	static int[] shuffle(int[] arr) { // result가 int 배열이여서
//		int[] mixarr = new int[arr.length];
//		System.arraycopy(arr, 0, mixarr, 0, arr.length); // arr을 복제
		int[] mixarr = arr.clone();
		for (int i = 0; i < 100; i++) {
			int idx1 = (int) (Math.random() * arr.length);
			int idx2 = (int) (Math.random() * arr.length);
			int tmp = mixarr[idx1];
			mixarr[idx1] = mixarr[idx2];
			mixarr[idx2] = tmp;
		}
		return mixarr;
	}

	public static void main(String[] args) {

		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		System.out.println("---------------------------------");
		int[] result = shuffle(original); // original 가져와서 섞음
		System.out.println(java.util.Arrays.toString(original));
		System.out.println(java.util.Arrays.toString(result));
		System.out.println(original == result);

//		shuffle(original);
//		System.out.println(java.util.Arrays.toString(result));

//original 과 result가 같지 않게?
// 이거 꼭 복습할것		
	}

}
