package ch8;

public class ExceptionTest1 {

	public static void main(String[] args) {
		String str = null; // null로 초기화하는거랑 ""는 다르다 null로 초기화하면 값 자체를 null로 하는데 ""로 하면 가르키는 값이 null이다
		int[] arr = new int[5];

		try {

			System.out.println(str.toString());
			for (int i = 0; i <= arr.length; i++) {
				arr[i] = i * 10;

			}

		} catch (NullPointerException e) { // NullPointerException도 클래스이다
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("종료");
	}
}