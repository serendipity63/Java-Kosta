package ch3;
public class OperTest2 {

	public static void main(String[] args) {
		int i=-10;
		i = +i; //i*1
		System.out.println(i);
		i = -i; //i*(-1)
		System.out.println(i);

		boolean power = false;
		power = !power;
		System.out.println(power);
		power = !power;
		System.out.println(power);
		
		int j=10;
		System.out.println(j);
		j=~j;
		System.out.println(j);
		
	}

}
