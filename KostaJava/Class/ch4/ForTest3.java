package ch4;
public class ForTest3 {

	public static void main(String[] args) {
		int cnt=10;
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<i+1; j++ ) {
			System.out.print("*");
			
		}
			System.out.println();
	}

}
}
//별찍기 예제
//* :i=0,1,j<1
//** :i=1,2,j<2
//하나씩 증가하는
