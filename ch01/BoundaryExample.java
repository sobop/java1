package ch01;

public class BoundaryExample {
	public BoundaryExample() {
		var1 = 30;
	}

	public static void main(String[] args) {
		int num1 = 10;	// 로컬 변수 : 나를 감싸는 '{'와 '}' 안에서만 존재하는 변수
		
		if(num1 == 10) {
			int num2 = 20;	// 로컬 변수 : if문 내에서만 사용 가능
			System.out.println(num2);
		}

//		System.out.println(num2);	// 이미 삭제되어 존재하지 않음
//									// 프로그램의 실행 순서는 위에서부터 아래로 차례대로 실행
//		for(int i =0;i < 10; i++) { // 변수 i는 for문 내에서만 사용 가능
//			;
//		}
//		System.out.println(i);	// 에러 : 변수 i는  for문내에서만 사용가능
//		System.out.println(j);	// 에러 : 변수를 선언하기 전에 사용할 수 있음 (프로그램은 위에서 아래로 실행된다.)
								// 변수를 사용하려면 먼저 선언과 초기화를 해야 함
		int j;	// main 메소드 내에서 존재
		for(j = 0;j < 10;j++) { // 반복문
			;
		}
		System.out.println(j);	// 사용 가능 -> 10을 출력
		System.out.println("num1 = " + num1);	// num1은 main() 메소드 안에서 사용 가능
	}	

	int var1;	// 예외 (뒤에서 변수 선언) -> 순서(앞/뒤)에 관계없음 
}
