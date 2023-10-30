package ch8;

public class ExceptionTest4 {
	public static void method1() throws Exception {
		String str = null;
		try {

			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("method1에서 처리");
			throw new Exception("예외 다시 생성");

		}

	}

	public static void main(String[] args) {
		try {
			method1();

		} catch (Exception e) {
			System.out.println("main에서 처리");
		}
		System.out.println("main 나머지 처리");

	}
}
