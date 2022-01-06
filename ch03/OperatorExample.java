package ch03;

public class OperatorExample {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 20;
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int remain = num1 % num2;
		
		String value4 = "JDK" + 8 + 4; // "JDK84"
		String value5 =  8 + 4 + "JDK"; // "12JDK"
		
		int s1 = 90;
		int s2 = 86;
		int avg = (s1 + s2) / 2;
		if(avg >= 90) {
			System.out.println("A 학점");	
		} else if(avg >= 80) {
			System.out.println("B 학점");
		} else if(avg >= 70) {
			System.out.println("C 학점");
			
		}
		/*쉬프트 연산자 : 비트 이돟 -> 좌로 이동,우로 이동
		 * << : 2배로 값이 커지는 것
		 * >> : 1/2로 값이 줄어드는 것.
		 */
		int var1 = 0b0100;
		System.out.println(var1);
		int var2 = var1 << 2;	// var1을 왼쪽으로 2비트 이동(shift) ->4배
		System.out.println(var2);
		int var3 = var1 >> 1;	// var1을 오른쪽으로 1비트 이동(shift) -> 2로나눔
		System.out.println(var3);
		
		int m1 = -16;
		int m2 = m1 << 2;
		int m3 = m1 >> 2;
		System.out.println("m1=" + m1 + ", m2=" + m2 + ", m3=" + m3);
		System.out.println(Integer.toBinaryString(m1));
		System.out.println(Integer.toBinaryString(m2));
		System.out.println(Integer.toBinaryString(m3));
	}

}
