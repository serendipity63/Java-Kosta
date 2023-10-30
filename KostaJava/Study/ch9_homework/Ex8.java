package ch9_homework;

public class Ex8 {
	static double round(double d, int n) {
		double p = Math.pow(10, n);
		return Math.round(d * p) / p;
	}

	public static void main(String[] args) {
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));

	}
}
//3.1
//3.14
//3.142
//3.1415
//3.1415

//math.round(3.1415*math.pow(10,1))/10.0