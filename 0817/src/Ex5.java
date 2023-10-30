
public class Ex5 {

	public static void main(String[] args) {
	// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = { 500, 100, 50, 10 };
		
		int money = 2680;
		System.out.println("money=" + money);
//걍 2680 출력		
		for (int i = 0; i < coinUnit.length; i++) {
		//coinunit의 length값 만큼 돌리기 aka계속하기
		if (money / coinUnit[i] > 0) {
// 2680/동전이 0보다 크면	
//2680/500=5 ...so on
		System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]);
//			String.format(, args)
//출력해라 0번째에 있는 값 500+원+(돈/동전(큰거부터)
				money %= coinUnit[i];				
//돈 거스른 값 주는거 계속 돌리는거 몫값			
			}
		}
	}
}