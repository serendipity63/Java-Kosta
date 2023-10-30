package ch4;
public class BreakTest1 {
	public static void main(String[] args) {
		outer : for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("*");
				if(i==j) break outer;
			}
			System.out.println();
			}
		}

	}

