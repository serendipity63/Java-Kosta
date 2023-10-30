package ch4;
public class WhileTest3 {
	public static void main(String[] args) {
		int sum=0, i=1; //for문이랑은 다르게 미리 초기화를 시켜줘야함 sum초기화는 포문이랑 똑같고
		while(i<=10) {
			sum+=i;
			i++;
			System.out.println(i);
		}
		System.out.println(sum);
	}

}
//while test예제
/* 이걸 포문으로 바꾸면이럼
 * int sum=0;
 * for(int i=1; i<=10; i++);
 * sum+=i
 */


