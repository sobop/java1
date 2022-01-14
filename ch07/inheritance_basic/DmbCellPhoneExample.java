package ch07.inheritance_basic;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmb1 = new DmbCellPhone("삼성", "검정", 10); 
		dmb1.channel = 10;	// 자식 클래스
		dmb1.model = "LG";	// 부모 클래스
		dmb1.color = "흰색";	// 부모 클래스
		dmb1.powerOn();
		dmb1.bell();		// 부모 클래스가 정의한 메소드를 사용
		dmb1.changeChannel(11);
		dmb1.sendMessage("안녕하세요?");
		dmb1.reciveMessage("반갑습니다.");
		dmb1.turnOffDmb();
		dmb1.powerOff();
	}

}
