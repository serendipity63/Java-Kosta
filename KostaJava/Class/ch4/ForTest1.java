package ch4;
public class ForTest1 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {   //증감, i+=2
			if(i%2==0) {
					sum+=i;
					System.out.println(i); //2의 배수만 더하
		}
		}
			System.out.println(sum);


	}
}
