package ch3;
public class OperTest3 {
	public static void main(String[] args) {
		System.out.println((float)10/4); //정수 나누기 정수는 정수 ㅇㅇ 피연산자 중 표현범위가 큰 타입으로 형변환 한다
		
		
		int kor=99, eng=88, math=100;
		int tot=kor+eng+math;
		double avg=tot/3.0;
		System.out.println("총점:"+tot+", 평균:"+avg);
		
		int mod = 10%4;
		System.out.println(mod);
		
		byte a=10;
		byte b=20;
		byte c=(byte)(a+b);
		System.out.println(c);
		
		int i1=100000;
		int i2=200000;
		long res = (long)i1*i2;
		System.out.println(res);
		
		long i3=100000*100000l;
		System.out.println(i3);
		
		int i4=100000*100000/100000;
		System.out.println(i4);
		int i5=100000/100000*100000;
		System.out.println(i5);
	}

}
