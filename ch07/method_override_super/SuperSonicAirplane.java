package ch07.method_override_super;

// 초음속 비행기

public class SuperSonicAirplane extends Airplane {
	public static final int NORMAL_MODE = 1;		// 일반 모드
	public static final int SUPERSONIC_MODE = 2;	// 초음속 모드
	
	int mode;	// 일반 비행 모드, 초음속 비행 모드
	
	@Override
	void fly() {
		if(mode == NORMAL_MODE) {
			super.fly();	// 일반 비행 모드로 운행
		} else {	// 초음속 모드
			System.out.println("초음속 모드로 비행을 합니다.");
		}
	}
}
