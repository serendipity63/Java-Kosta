package ch9;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(100);
		sb.append("abcdefg");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.insert(1, 'p');
		System.out.println(sb);
		System.out.println(sb.length());
		sb.delete(2, 5);
		System.out.println(sb);
		sb.replace(0, 2, "ta");
		System.out.println(sb); // 원본이 바뀜
		sb.reverse();
		System.out.println(sb);
		sb.setCharAt(2, 'E');
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setLength(3); // 원래보다 더 짧게하면 잘린다. 크게하면 스페이스가 삽입된다
		System.out.println(sb);

	}

}
