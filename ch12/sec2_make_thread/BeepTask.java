package ch12.sec2_make_thread;

import java.awt.Toolkit;	// 자바 그래픽 처리를 하는 라이브러리

// Runnable : 인터페이스
// run() 추상 메소드를 가지고 있다 (스레드 작업을 하는 메소드)
// 스레드 작업을 하는 구현 클래스를 생성
// 멀티스레드 작업 : 출력을 하면서 동시에 비프음을 발생시킨다.

public class BeepTask implements Runnable {
	// Runnable 인터페이스의 추상 메소드를 재정의 : 스레드 작업을 하는 메소드
	@Override
	public void run() {
		// 스레드 작업을 수행
		// 0.5초마다 비프음을 발생시킨다.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
				// 처리를 하지 않고 다른 스레드가 작업을 하도록 대기 상태로 간다.
			} catch(Exception e) { }
		}
	}

}
