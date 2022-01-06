package ch04.exam;

public class Exercise8 {

	public static void main(String[] args) {
		for(int x = 5; x >=1 ; x--) {
			for(int y = 1; y < x; y++) {
				System.out.print(" ");
			}
			for (int y = 5; y >= x; y--) {
				System.out.print("*");
			}

			System.out.println(); //줄바꿈
			
		}
	}
}
