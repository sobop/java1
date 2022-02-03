package ch12.sec2_make_thread;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// 방법 1 : Thread 객체를 생성하면서 매개변수로 Runnable 구현객체를 대입
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();	// BeepTask의 run()메소드가 실행됨
		
		// main() 스레드가 작업을 계속 실행함
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) { }
		}
	}

}
