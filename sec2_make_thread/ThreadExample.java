package ch12.sec2_make_thread;

import java.awt.Toolkit;

/*
 * 멀티 프로세스 : 하나의 컴퓨터에서 동시에 여러개의 프로그램(프로세스)이 실행되는 것
 * - 실행되는 프로그램 하나하나를 프로세스라 한다.
 * - OS는 시간을 쪼개서(보통 50us 정도) scheduling을 통해서 실행될 프로세스를 정한다.
 * 멀티 스레드 : 하나의 프로세스(프로그램)내에서 여러가지 작업을 동시에 처리를 하기 위해서 멀티스레드를 사용한다.
 * 스레드 만드는 방법
 * 1. Thread 클래스로부터 생성 -> 새로운 스레드를 생성하면서 매개변수로 Runnable
 * 	   인터페이스를 구현한 구현객체를 대입하는방법
 * 2. 스레드클래스를 상속해서 자식 스레드를 생성
 */
public class ThreadExample {

	public static void main(String[] args) {
		// 방법 2
		Thread thread = new Thread() {	// 익명 객체 : Thread 클래스를 상속
			// Thread 클래스의 run() 메소드를 재정의
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch(Exception e) { }
				}
			}
			
		};
		thread.start();	// WorkerThread 클래스의 run() 메소드가 실행된다.
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) { }
		}
	}

}
