package ch02;

// int : 32bit 정수 -> default -> CPU의 연산의 기본
public class IntExample {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 012; // 8진수는 앞에 0이 추가됨
		int var3 = 0xA; // 16진수는 앞에 0x가 추가됨
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

	}

}
