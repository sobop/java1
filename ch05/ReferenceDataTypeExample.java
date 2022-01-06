package ch05;

public class ReferenceDataTypeExample {

	public static void main(String[] args) {
		// 기본 데이터 타입 : 정수, 실수, 논리형 -> 값을 저장
		// 참조 데이터 타입 : 배열타입, 열거형 타입, 클래서 타입, 인터페이스 타입 -> 주소값을 저장
		String kdhong = "홍길동";
		String hobby = "독서";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		if(kdhong == str2) {
			System.out.println("같은 객체 참조");
		} else {
			System.out.println("다른 객체 참조");
		}
		
		if(str3 == str2) { // 참조변수에 저장된 값을 비교
			System.out.println("같은 객체 참조");
		} else {
			System.out.println("다른 객체 참조");
		}
		
		if(str2.equals(str3)) { // 참조 변수가 가리키는 곳의 내용을 비교
			System.out.println("같은 내용");
		} else {
			System.out.println("다른 내용");
		}
	}

}
