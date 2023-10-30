package ch4;

public class WhileTest1 {

	public static void main(String[] args) {
		int dan=2, i=1;
		
		while(i<=9) {
 			System.out.println(String.format("%dx%d=%2d", dan, i, dan*i));
			i++;			
		}

		}
}
	
//뭔 무한반복이야 왜냐면 중괄호를 안쳤잖아.. 끝내는게 없어서 무한반복으로 돌아가는거

