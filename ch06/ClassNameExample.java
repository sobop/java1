package ch06;

public class ClassNameExample {

	public static void main(String[] args) {
		ClassName ca = new ClassName();		// 객체를 생성
		ca.field1 = "홍길동";
		String name = ca.getField1();
		int f2 = ca.getField2();
		ca.setField1("두만강");	// 문자열 "두만강"을 ca클래스의 field1에 저장 	
		ca.setField2(40);	// 40을 ca클래스의 field2에 저장
	}

}
