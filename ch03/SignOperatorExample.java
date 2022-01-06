package ch03;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;;
		int result1 = +x;
		int result2 = -x;
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100;	
		//short result3 = -s;  메모리(short : 16bit)랑 CPU동작(int : 32bit)랑 다르다
		int result3 = -s;
		System.out.println(result3);
		short result4 = (short)-s; // 강제 타입변환
		System.out.println(result4);
	}

}
