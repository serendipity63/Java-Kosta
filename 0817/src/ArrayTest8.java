
public class ArrayTest8 {

	public static void main(String[] args) {
		int n=10;
		int m=n;
						
		int[]narr1 = {1,2,3,4};
		int[]narr2 = new int [4];
		System.arraycopy(narr1, 0, narr2, 0, narr1.length);  //deep copy
//		narr2=narr1; //shallow copy
		narr2[0] = 100;
		
		for(int i=0; i<narr1.length; i++) {
			System.out.print(narr1[i]+",");
			
		}
		System.out.println();
		for(int i=0; i<narr2.length; i++) {
			System.out.print(narr2[i]+",");

	}

}
}