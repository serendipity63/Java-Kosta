
public class ArrayTest4 {

	public static void main(String[] args) {
		String hex = "13A0C";
		String[] binary = new String[] {
				"0000", "0001", "0010", "0011", //0123
				"0100", "0101", "0110", "0111", //4567
				"1000", "1001", "1010", "1011", //89A(10)B(11)
				"1100", "1101", "1110", "1111" //C(12),D(13),E(14),F(15)
			};
		String result = "";
		
		for(int i=0; i< hex.length(); i++) { //hex 문자개수 세어서 그거만큼 반복?
			char ch = hex.charAt(i); //hex를 char타입으로 변환 문자열에서 캐릭터를 가지고 오는
			if(ch >='0' && ch<='9') {
				result += binary[ch-'0'];
			} else {
				result += binary[9+ch-'A'+1];
			}
			
		}
		System.out.println("hex:"+hex); //hex 문자열을 프린트함
		System.out.println("binary:"+result);
	}
}
//출력결과
//hex: 13AOC
//binary: ㅇㅇㅇ