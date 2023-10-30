package ch2;

public class Ex2_1 {

	public static void main(String[] args) {
		int sum =0;
		
		for(int i=1; i <=20; i++) {
			if(i%2!=0 && i%3!=0) //만약 2의배수도 아니고 3의 배수도 아니면
				sum +=i;
				
		}
			System.out.println(sum);
	}

}
//책 풀인데 이게 좀더 직관적인 느낌
