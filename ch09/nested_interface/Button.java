package ch09.nested_interface;

/*
 * 안드로이드 앱에서 볼수 있는 Button 에 대한 소스코드
 */
public class Button {
	interface OnClickListener {	// 중첩인터페이스 : 클래스안에 인터페이스가 있는 경우
		// 추상 메서드 : 버튼이 눌렸을 때 처리하는 이벤트 핸들러(메서드)
		void onClick();
	}
	
	// 필드
	OnClickListener listener;
	
	// Setter
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 버튼이 눌리면 안드로이드 시스템 내부적으로 처리하는 메서드
	void touch() {
		listener.onClick();
	}
}
