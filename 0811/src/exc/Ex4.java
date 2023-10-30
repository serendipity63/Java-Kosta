package exc;
public class Ex4 {
	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
		//100이상이 되는지 구하시오.
		int sum = 0, i;
		for(i=0;;i++) { //왜 i=0으로 안함?
//			if(i%2==0) sum+=-i;
//			else sum+=i;
			if(sum>=100) break;
			sum+= (i%2==0)? -i:i; //:이거 else 라는 뜻임
			if(sum>=100) break;
			
			
		}
		System.out.println("sum:"+sum+", i:"+i);
	
	}

}
