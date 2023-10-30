package ch3;

public class Ex2 {

	public static void main(String[] args) {
		int numOfApples =123;
		int sizeOfBuckets = 10;
		int numOfBucket = (numOfApples/sizeOfBuckets+(numOfApples%sizeOfBuckets>0?1:0));
		// 모든 바구니를 담는 데 필요한 바구니의 수
				
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		

	}

}
//실행결과 13