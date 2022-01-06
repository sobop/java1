package ch03;

public class CompareExample {

public static void main(String[] args) {
	float f1 = 0.1f;
	double d1 = 0.1;
	
	int i1 = Float.floatToIntBits(f1);
	System.out.printf("%f\n", f1);
	System.out.println(toBinaryString(i1));	// float 0.1f 비트 출력
	
	float f2 = (float)d1;					// double 0.1을 float로 강제 타입 변환
	int i2 = Float.floatToIntBits(f2);
	System.out.printf("%f\n", f2);
	System.out.println(toBinaryString(i2));	// double 0.1을 float로 강제 타입 변환 후 비트 출력

	long l1 = Double.doubleToLongBits(d1);
	System.out.printf("%f\n", d1);
	System.out.println(toBinaryString(l1));	// double 0.1 비트 출력
	
	double d2 = f1;							// float 0.1f를 double로 자동 타입 변환
	long l2 = Double.doubleToLongBits(d2);
	System.out.printf("%f\n", d2);
	System.out.println(toBinaryString(l2));	// float 0.1f를 double로 자동 타입 변환 후 비트 출력

	System.out.println("f1 == d1 : " + (f1 == d1)); //false 오차다름
	System.out.println("f1 == d1 : " + (f1 == (float)d1)); //true 
}

private static String toBinaryString(long value) {	// long의 비트 출력
	String str = Long.toBinaryString(value);
	while(str.length() < 64) {
		str = "0" + str;
	}
	return str;
}

private static String toBinaryString(int value) {	// int의 비트 출력
	String str = Integer.toBinaryString(value);
	while(str.length() < 32) {
		str = "0" + str;
	}
	return str;
}
}
