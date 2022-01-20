package ch07.inheritance_basic;

/*
 * 자식 클래스
 * - 부모 클래스를 상속받기 위해서 extends 키워드를 사용하고 부모클래스를 이후에 기술해 준다.
 * - 부모 클래스가 정의한 필드와 메소드를 상속을 받아서 가지고 있게 된다. -> 사용할 수 있다.
 * - 나만의 기능을 추가로 정의할 수 있다. -> 새로운 클래스를 정의한다.
 * - 부모가 정의한 기능을 재정의 할 수 있다. -> 부모가 정의한 기능을 그대로 사용할수도 있고,
 * 		나만의 방식으로 다시 재정의할 수 있다.
 * - 상속 : 자식 클래스가 부모 클래스를 선택할 수 있다.
 * - 자바에서는 부모 클래스를 한 개만 선택할 수 있음. 여러 개를 상속할 수 없음
 * - C++에서는 다중(여러 개를) 상속이 가능
 * - 상속을 통해서 새로운 휴대폰을 휴대폰을 개발할 수 있다.
 */
public class DmbCellPhone extends CellPhone {
	// 필드
	// 부모가 정의한 필드가 존재한다.
	// 자식이 추가로 필드를 정의할 수 있다.
	int channel;
	
	// 생성자 : 필드를 초기화
	public DmbCellPhone(String model, String color, int channel) {
		// 부모객체의 초기화가 먼저 실행이 되어야 함. 부모가 먼저 존재해야 하기 때문에
//		super();	// 생략됨 : 부모 객체 CellPhone의 생성자 -> 주석처리 가능
		// 부모가 정의한 필드를 초기화
		this.model = model;	// 부모 CellPhone이 정의한 필드
		this.color = color;
		this.channel = channel;
	}
	
	// 메소드
	// 부모가 정의한 메소드가 존재한다.
	// 자식이 추가한 메소드를 정의할 수 있다.
	void turnOnDmb() {	// DMB 기능을 활성화
		System.out.println("채널 " + channel + "번 DMB 방송수신을 시작합니다.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "으로 변경했습니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	// 부모가 정의한 bell() 메소드를 재정의할 수 있음
	@Override	// @Override 어노테이션을 사용할 수 있다. -> 컴파일러에게 재정의하였음을 알림
	void bell() {
//		super.bell();	// default가 부모가 정의한 메소드를 사용
		// 재정의를 하면 된다.
	}
}
