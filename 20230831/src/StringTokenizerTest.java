import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
//		StringTokenizer st = new StringTokenizer("apple, banana, orange");
//		while (st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		StringTokenizer st = new StringTokenizer("apple#banana$orange, kiwi", "#$,");
		// 구분자를 안주면 스페이스로 구분한다 구분자를 여러개 지정 가능 split은 하나만 가능
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
//		System.out.println(st.countTokens()); //남아있는거
	}

}
