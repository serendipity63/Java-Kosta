package ch2;

public class Ex8 {

	public static void main(String[] args) {
		int x =1;
		int y =2;
		int z =3;
		
		int tmp = x; //tmp =1 x=null
		x= y; //x=2 y=null
		y=z;//y=3 z=null
		z=tmp; //z=1

		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
			

	}

}
