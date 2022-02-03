package ch12.sec2_make_thread;

import java.awt.Toolkit;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		// 멀티 스레드를 생성 : 람다식 사용
		// () : run 메소드의 매개변수() -> {추상메소드를 재정의한 실행부분}
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch(Exception e) { }
			}
		
		});
		thread.start();	// run()메소드가 실행됨
		//	스레드를 동작시키려면 start() 메소드를 호출해야 한다.
	}

}
