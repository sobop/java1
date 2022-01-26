package ch10;

public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		int numArr[] = new int[] { 1, 3, 5 };	// 0~2 : 3개
		for(int i = 0;i <= numArr.length;i++) {	// 배열에 있는 값을 출력
			System.out.print(numArr[i] + " ");	// i = 3 -> numArr[3]
		}
		System.out.println();
	}
	
	// 예외가 발생이 되면 예외가 발생된 라인에서 프로그램이 종료
	// stacktrace를 출력 : 스택에 저장되어 있는 내용을 출력

}
