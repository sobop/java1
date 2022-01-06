package ch04;

import java.util.Scanner;
public class IfExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in) ; //키보드로부터 입력받기
		System.out.print("점수 입력 : "); // 점수를 입력하도록 안내문 출력
		int num = scanner.nextInt(); // 점수 입력 받기
		// 엔터키('\n')를 입력해야 데이터읽음
		if(num >= 90) {
			System.out.println("A학점");
		} else if(num >= 80) {	
			System.out.println("B학점");
		} else if(num >= 70) {	
			System.out.println("C학점");
		}else if(num >= 60) {	
			System.out.println("D학점");
		}else {	
			System.out.println("F학점");
		}
	}

}