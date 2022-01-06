package ch04;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu;
		boolean run = true;
		do {
			System.out.print("메뉴 입력 : ");
			menu = scanner.nextInt(); // 메뉴를 입력받음
			switch(menu) { 
			case 1:
				System.out.println("1 입력됨");
				break;
			case 2:
				System.out.println("2 입력됨");
				break;
			case 3:
				System.out.println("3 입력됨");
				break;
			default:
				System.out.println(menu + " 입력됨");
				run = false;
			}
		} while(run);
		scanner.close();

	}

}
