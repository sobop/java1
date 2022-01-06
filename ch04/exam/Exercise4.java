package ch04.exam;

public class Exercise4 {

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			int x = (int)(Math.random() *6 + 1);
			int y = (int)(Math.random() *6 + 1);
			System.out.println("(" + x + "," + y + ")");
			if (x + y == 5) {
				run = false;
			}
		}
		

	}

}
