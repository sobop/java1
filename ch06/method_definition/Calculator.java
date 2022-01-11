package ch06.method_definition;

public class Calculator {
		// 필드
		String owner;	// 소유자
		String model;	// 모델명
		
		// 생성자 : 필드를 초기화
		public Calculator() { // default 생성자 -> 생성자 정의 안해도 컴파일러가 있는것으로 간주 
			
		}
		
		// 생성자 오버로딩
		public Calculator(String model) {	// 매개변수로 model을 받아서 필드에 저장
			this.model = model;
			printModel();	// Calculator 클래스 내에 있는 다른 메소드를 호출
		}

		// 메소드 : 기능, 동작
		public int add(int num1, int num2) { // 두개의 정수 더하는 기능
			return num1 + num2;	// 메소드의 실행 부분 : 반환형이 int이므로 return 사용
		}
		
		// 메소드 오버로딩
		public long add(long l1, long l2) {	// long값 더하기
			return l1 + l2;
		}
		
		public double add(double d1, double d2) {
			return d1 + d2;
		}
		
		// 반환형이 없을 경우 void 사용
		// 메소드 별로 주소가 있음
		public void printModel() {
			System.out.println("모델명: " + model);
		}
		
		int sum1(int[] values) {
			int total = 0;
			for(int i = 0; i < values.length; i++) {
				total += values[i];
			}
			return total;
		}
		int sum2(int ... values) {	// values : 배열, ... : 가변배열을 지원
			int total = 0;
			for (int i =0; i< values.length; i++) {
				total += values[i];
			}
			return total;
		}
}
