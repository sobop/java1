package ch09.nested_interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();	// 화면에 있는 버튼
		// 안드로이드 시스템에서는 이벤트 핸들러를 등록
		btn.setOnClickListener(new CallListener());
		btn.touch();	// 안드로이드 시스템에서 내부적으로 처리되는 메서드
			// 사용자가 버튼을 누르는 것을 프로그램으로 나타낸 것
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
