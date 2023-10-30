package ch4_homework;

public class Ex3 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		int sum=0; //합계를 저장하기 위한 변수
		for (int i=1;i<=10;i++) { //10번 돌린다
			for(int j=1;j<=i; j++) { 
		sum+= j; //i를왜 넣냐 sum을 했는데 j를 해야지..
		
		System.out.printf("%d",j);
	}
		}	
		System.out.println(sum);		

}
	}
