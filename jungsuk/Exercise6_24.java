package jungsuk;

public class Exercise6_24 {

	static int abs(int value) {
		if(value < 0) {
			int i = 0;
			i = -value;
			return i;
		}
		return value; 
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value));
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
	}
}
