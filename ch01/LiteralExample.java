package ch01;

public class LiteralExample {

	public static void main(String[] args) {
		int num1 = 10; // 정수 리터럴(default 정수 : int -> 4byte)
		long l1 = 100l; // long 리터럴 : 뒤에 소문자 l 또는 대문자 L을 붙여준다. (8byte 크기)
		float f1 = 3.14f; // float 리터럴 : 뒤에 소문자 f 또는 대문자 F을 붙여준다. (4byte 크기)
		double d1 = 2.23; // 2.23 리터럴 : double 리터럴(default double) (8byte 크기)
		char c1 = 'A'; // 'A' : char 리터럴 (2byte 크기)
		char c2 = '\t'; // escape 문자 : \t, \n, \\
		char c3 = '\\'; // '\'문자를 나타내기 위해서 '\t'의 \와 구분하기위해서 \\ 를 사용
		char c4 = '\'';
		char c5 = '\u3150'; // ㅐ 유니코드
		System.out.println(c5);
		String str = "화창한 오후 입니다."; // 문자열 리터럴
		String str2 = "오늘은 2021년 마지막 일 입니다.";
		byte b1 = 10;
		boolean flag = true; // 논리 리터럴 true 또는 false (1byte)
	}

}
