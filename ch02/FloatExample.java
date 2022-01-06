package ch02;

public class FloatExample {

	public static void main(String[] args) {
		float f1 = 9.1234567f;
		int i = Float.floatToIntBits(f1);
		System.out.printf("%f\n", f1);
		System.out.printf("0%s\n", Integer.toBinaryString(i));

	}

}
