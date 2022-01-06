package ch05;

import javax.sound.midi.SysexMessage;

public class GetArgumentExample {
	
	//GetArgumentExample 10 20
	public static void main(String[] args) {
	// 프로그램의 입력 파라미터가 String[] args에 들어온다.
		if(args.length != 2) {	// 사용 방법을 몰라서 잘못 입력한 경우
			System.out.println("GetArgumentExample num1 num2");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}

}
