package ch03;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1 = 647845;
		int v2 = ~v1;	// 1의 보수
		int v3 = v2 + 1;	// 2의 보수
		int v4 = ~v1 + 1;	// 2의 보수

		// 2진수 형태로 출력하려면 앞에 0 붙이기 (0안붙이면 생략)
		System.out.println(toBinaryString(v1) + v1);
		System.out.println(toBinaryString(v2) + v2);
		System.out.println(toBinaryString(v3) + v3);
		System.out.println(toBinaryString(v4) + v4);

	}

	private static String toBinaryString(int value) {
		// int value 32bit , 앞에 0 있으면 생략
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) { // 글자수가 32글자가 될때까지 앞에 0 추가
			str = "0" + str;
		}
		return str;
	}
	private static String toBinaryString(long value) {
		// long value 64bit , 앞에 0 있으면 생략
		String str = Long.toBinaryString(value); // long으로 변환
		while(str.length() < 32) { // 글자수가 64글자가 될때까지 앞에 0 추가
			str = "0" + str;
		}
		return str;
	
	}
}