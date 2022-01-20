package ch07.method_override_super;

public class SuperSonicExample {

	public static void main(String[] args) {
		SuperSonicAirplane ssa = new SuperSonicAirplane();
		ssa.mode = SuperSonicAirplane.NORMAL_MODE;
		ssa.fly();	// 일반 비행을 한다.
		ssa.mode = SuperSonicAirplane.SUPERSONIC_MODE;
		ssa.fly();	// 초음속 비행
	}

}
