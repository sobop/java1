package ch09.anonymous_implement_class;

/* 프로그램을 이해하는 방법
 * 1. 각 메서드의 시작부분과 끝부분에 출력문을 넣는다. -> 중간 중간에 프린트문을 넣는다.
 * 2. 디버거를 사용해서 프로그램의 실행을 따라가는 방법 : breakpoint를 잘 넣어주어야 한다.
 */
public class WindowExample {

	public static void main(String[] args) {
		Window w = new Window();
		// 버튼을 누르면 안드로이드 시스템이 버튼에 대하여 핸들러를 처리
		// 대신 프로그램으로 처리
		w.btn1.touch();	// 버튼 1이 눌리면 처리하는 것을 불러준다.
		w.btn2.touch();
	}

}
