package ch12.sec2_make_thread;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// 멀티 스레드를 생성 : Runnable의 익명구현 객체를 사용하는 방법
		// 익명 구현 객체를 만드는 방법 : 클래스 이름이 없으므로 인터페이스 이름으로 생성자
		Thread thread = new Thread(new Runnable() {

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
			
		});
		thread.start();	// run()메소드가 실행됨
		//	스레드를 동작시키려면 start() 메소드를 호출해야 한다.
	}

}
