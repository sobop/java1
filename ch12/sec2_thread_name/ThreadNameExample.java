package ch12.sec2_thread_name;

public class ThreadNameExample {

	public static void main(String[] args) {
		// main 스레드가 동작
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		Thread threadA = new ThreadA();
		threadA.start();
		
		Thread threadB = new ThreadB();
		threadB.start();
	}

}
