package ch12.sec2_make_thread;

import java.awt.Toolkit;

// Thread 클래스를 상속해서 자식 클래스를 정의
public class WorkerThread extends Thread {
	@Override
	public void run() {
		// 스레드의 실행부
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch(Exception e) { }
		}
	}
}
