package ch04;

public class LoopExample {

	public static void main(String[] args) {
		int total = 0;
		/* 디버깅
		 * break poin를 잡아준다 : 프로그램의 중단점을 추가
		 * step over : 한 줄씩 실행 (메소드 있으면 메소드까지 실행)
		 * step into : 메소드안으로 실행이 이동(메소드 안 디버깅을 계속 수행)
		 * resume : 현재 라인에서 다음 break point까지 실행
		 */
		
		for(int i = 1; i <= 10; i++) {
			total = total + i;
		}
		System.out.println(total);
	}

}
