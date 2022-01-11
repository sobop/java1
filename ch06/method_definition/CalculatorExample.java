package ch06.method_definition;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator("샤프"); // 계산기 생성
		int sum = myCalculator.add(20, 30);
		long sum2 = myCalculator.add(300L, 400L);
		System.out.println("20 + 30 = " + sum);
		System.out.println("300L + 400L = " + sum2);
		
		byte b1 = 10;
		byte b2 = 20;
		sum = myCalculator.add(b1, b2);
		System.out.println(b1 + " + " + b2 + " = " + sum);
		
		/* 메소드 오버로딩의 대표적인 사례 : println 메소드
		byte b1 = 10;
		System.out.println(b1);
		char c1 = 'A';
		System.out.println(c1);
		int i1 = 100;
		System.out.println(i1);
		System.out.println("문자열을 전달");	// String
		println 메소드 : 메소드 오버로딩
		*/
		
//		int total1 = myCalculator.sum1(1, 2, 3);	// 에러
//		total1 = myCalculator.sum1(1, 2, 3, 4 ,5);	// 에러
		// 배열 객체를 생성하고 값들을 넣어줌 -> 지원을 한다.
		// 메소드를 배열 형태로 정의할때는 가변배열을 지원하지 않는다.
//		total1 = myCalculator.sum1(new int[] {1, 2, 3});
		
		int total2 = myCalculator.sum2(1, 2, 3);
		System.out.println(total2);
		total2 = myCalculator.sum2(1, 2, 3, 4, 5);
		System.out.println(total2);
		total2 = myCalculator.sum2(new int[] {1, 2, 3});
		System.out.println(total2);
		
		// Calculator 클래스의 메소드에 접근하려면
		// 참조변수를 사용해서 구체적인 객체의 메소드에 접근
		myCalculator.printModel();
	}

}
