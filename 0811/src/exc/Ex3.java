package exc;

public class Ex3 {
	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오. 별찍기 비슷한
		int sum = 0;
		for(int i=1; i<=10; i++) { //왜 i=0으로 안함?
			for(int j=1; j<=i; j++) {
				sum+=j;
						
			}
		}
		System.out.println(sum);
	
	}

}
