package ch02;

/*	데이터 타입 : 컴퓨터에 데이터를 저장하는 유형
 * 정수, 실수, 논리형 
 * 정수형 : byte(1byte), char(2byte), short(2byte), int(4byte), long(8byte)
 * 	- byte : 8 bit
 * 	  + MSB : Most Significant Bit) 비트는 부호 비트이다.
 * 	  + 나머지 7비트를 사용해서 사용 범위(값)을 나타낸다.
 *	  + -2의 7승 ~ +2의 7승-1, 중간에 0이 존재
 *	  + 데이터를 송수신할 때 많이 사용
 *	- char : 16 bit (0 ~ 2의 16승-1) -> 문자(UTF-8) -> 음수가 존재하지 않음
 *	  + 데이터를 전송할 때 문자 단위로 송수신할 때 사용 
 *	- short : 16 bit (부호비트 존재)
 *	  + -2의 15승 ~ +2의 15승-1
 *	- int : 32bit (default) -> 컴퓨터 내부에서 연산을 할 때 default int로 동작
 *	  + -2의 31승 ~ +2의 31승-1 (약 20억)
 *	- long : 64bit
 *	  + -2의 63승 ~ +2의 63승-1
 * 실수형 : float(4byte), double(8byte)
 * 	- float : 부호비트(1bit) + 지수 부분(8bit) + 가수 부분(23bit)
 * 	- double : 부호비트(1bit) + 지수 부분(11bit) + 가수 부분(52bit)
 * 논리형 : boolean(1byte) true or false
 * 
 * 정수를 컴퓨터에서는 어떻게 저장하는가?
 *  - 부호 비트 : 최상위 비트
 *  양수 : 음의 수의 1의 보수 + 1 = 각 비트의 값이 0이면 1로, 1이면 0으로 변경한 값
 *  0001(+1)의 음수인 -1을 구하는 방법
 *  음수 : 양의 수의 1의 보수 + 1 = 각 비트의 값이 0이면 1로, 1이면 0으로 변경한 값
 *  0001의 1의 보수 = 1110
 *  2의 보수 = 1110 + 1 = 1111 (-1) 
 */
public class ByteExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) { // 반복문 i값이 0~4까지 5번을 반복실행
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
		
	}

}
