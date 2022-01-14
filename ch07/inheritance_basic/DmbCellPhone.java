package ch07.inheritance_basic;
/*
 * - 자식 클래스
 * 부모 클래스를 상속받기 위해서 extends 키워드를 사용하고 부모클래스를 이후에 기술해준다.
 * 부모 클래스가 정의한 필드와 메소드를 상속을 받아서 가지고 있게 된다. -> 사용할 수 있다.
 * 나만의 기능을 추가로 정의할 수 있다. -> 부모가 정의한 기능을 그대로 사용할수도 있고,
 * 나만의 방식으로 다시 재정의할 수 있다.
 * - 상속 : 자식 클래스가 부모 클래스를 선택할 수 있다.
 * - 자바에서는 부모 클래스를 한개만 선택할 수 있다.
 */
public class DmbCellPhone extends CellPhone {
	// 필드
	// 부모가 정의한 필드가 존재한다.
	// 자식이 추가로 필드를 정의할 수 있다.
	int channel;
	
	// 생성자
	public DmbCellPhone(String model, String color, int channel) {
		// 부모객체의 초기화가 먼저 실행이 되어야 함
//		super(); // 생략됨 : 부모객체 CellPhone의 생성자
		// 부모가 정의한 필드를 초기화
		this.model = model;	// 부모 CellPhone이 정의한 필드
		this.color = color;
		this.channel = channel;
	}
	
	// 메소드
	// 부모가 정의한 메소드가 존재한다.
	// 자식이 추가한 메소드를 정의할 수 있다.
	void turnOnDmb() {	// DMB 기능 활성화
		System.out.println("채널" + channel + "번 DMB 방송수신을 시작합니다.");
	}
	
	void changeChannel(int channel) {
		System.out.println("채널" + channel + "으로 변경했습니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	// 부모가 정의한 bell() 메소드를 재정의할 수 있다.
	@Override
	void bell() {
//		super.bell(); default가 부모가 정의한 메소드를 사용
		// 재정의를 할 수 있다.
	}
}
