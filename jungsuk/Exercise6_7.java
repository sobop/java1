package jungsuk;

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	double getDistance(int i, int j) {
		int a = i - x;
		int b = j - y;
		return Math.sqrt(a*a + b*b);
	}
}

public class Exercise6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);
		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2));
		}
}
