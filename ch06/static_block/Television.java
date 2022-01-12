package ch06.static_block;

public class Television {
	static String company = "Samsung";
	static String model = "OLED";
	static String info;
	String color;
	int size;
	
	// static block에서 정적 멤버 필드의 초기화를 한다.
	static {	// static block : '{'로 시작하고 '}'로 닫는 범위 안을 말한다
		info = company + "-" + model;
	}
	// 순서상으로는 위에서 아래로 진행됨.
	
	static void staticMethod() {
//		color = "검정색";	// 인스턴스 필드는 객체화가 되어야만 사용할 수 있으므로 에러
		Television tv1 = new Television();	// 특정 객체가 생성되면 참조변수를 통해 사용
		tv1.color = "검정색";
		// 정적 필드에는 접근 가능
		company = "LG";		// 정적 필드에 접근가능
//		setcolor("은빛");		// 인스턴스 멤버 메소드를 호출할 수 없다.
		tv1.setColor("은빛");
	}
	
	// 인스턴스 맴버 메소드
	public void setColor(String color) {	// 어떤 특정한 객체의 메소드로 실행
		this.color = color;
		System.out.println("회사: " + company);	// 정적 멤버 필드에 접근 가능
			// 정적 멤버 필드는 프로그램이 실행되는 처음부터 존재하므로 접근 가능
		staticMethod();	// 정적 맴버 메소드를 호출할 수 있음.
	}
}
