package ch11.object_class;

public class SmartPhone {
	// 필드
	private String model;
	private String os;
	
	public SmartPhone(String model, String os) {
		this.model = model;
		this.os = os;
	}

	// 이클립스가 자동으로 재정의해준 toString 메서드
	// 필요하면 이클립스에서 제공해주는 기능을 이용
	@Override
	public String toString() {
		return "SmartPhone [model=" + model + ", os=" + os + "]";
	}
	
	// 재정의 : 객체의 정보를 반환(출력)
//	@Override
//	public String toString() {
//		return "[SmartPhone: model=" + model + ", os=" + os + "]";
//	}
	
}
