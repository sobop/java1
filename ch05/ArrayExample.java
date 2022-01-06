package ch05;

public class ArrayExample {

	public static void main(String[] args) {
		int[] arr1 = new int[30];	// int 배열 생성 (30개) 값 설정 안하면 0.
		int arr2[] = {1, 3, 5};		// 생성 후 초기값 넣어준다. 초기값 개수만큼 배열 생성됨.

		for(int i = 0;i < 30;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0;i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		arr1[0] = 20;	// 하나의 요소에 접근. index 사용해서 접근가능.
		arr1[10] = 30;	// index는 0부터 시작한다.
		
		for(int i = 0;i < 30;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// System.out.println(arr1[30]);	// 31번째 접근이라 오류
		
		int arr3[] = null;	//null 주의
		System.out.print(arr3[0]);
	}

}
