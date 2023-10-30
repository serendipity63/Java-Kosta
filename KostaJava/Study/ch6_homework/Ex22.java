package ch6_homework;

// isNumber 메서드를 작성하시오

public class Ex22 {
//	static boolean isNumber(String str) {
//		if(str==null || str.length()==0) return false;
//		for (int i = 0; i < str.length(); i++) { //str.length만큼 돌리기
//			char ch = str.charAt(i);
//			if (!(ch >= '0' && ch <= '9')) {
//				return false;
//			}
//		}
//		return true;
//
//		// char로 변환하기 char length만큼 비교하기?
//		// string class의 charat(int i) 메서드 이용해서 문자열의 i번째 위치한 문자를 얻을 수 있다
//
//	}< 이게 좀더 납득가는 느낌

	static boolean isNumber(String str) {
		if (str == null || str.length() == 0) // 뮨자열이 null이거나 빈문자열이라면 false를 반환한다
			return false;
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) { // str.length만큼 돌리기
			char ch = str.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				flag = false;

			}
		}
		return flag;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

} // 123은 숫자입니까? true 1234o는 숫자입니까? false
