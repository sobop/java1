package jungsuk;

public class Exercise6_6 {
	static double getDistance(int x, int y, int x1, int y1) {
		int i = x1 - x;
		int j = y1 - y;
			return Math.sqrt(i*i + j*j);	
	}
	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
	}
}
