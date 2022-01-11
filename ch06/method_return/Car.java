package ch06.method_return;

public class Car {
	// 필드
	int gas;
	
	// 생성자
	
	// 매소드 : 매개변수의 유무, 반환형의 유무 -> 4개의 유형
	/* 매개변수 	반환형
	 * O		O
	 * O		X (void)
	 * X		O
	 * X		X
	 * 
	 * 매개변수의 유무 : 메소드를 실행하기 위하여 외부(메소드를 호출하는 곳)에서
	 * 				데이터를 넣어줄 필요가 있는가?
	 * 반환형의 유무 : 메소드를 호출한 곳이 메소드를 실행하고 나서 그 결과를 받을 필요가 있는가?
	 */
	void setGas(int gas) {	// 매개변수로 받은 값을 필드값으로 대입 ->
							// 반환값이 불필요 -> 반환형 void
		this.gas = gas;
	}
	
	int getGas() {	// 매개변수가 필요없음
		return gas;	// gas 값을 가져와야 하므로 반환형은 int
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return;	// return 없으면 계속 실행
			}
		}
	}
}
