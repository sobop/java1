package ch05;

public class ArrayDefinitionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arr2 = null;
//		arr2 = {10, 20, 30};	// 배열 생성 불가능 -> 배열의데이터 타입(?)
		arr2 = new int[] {10, 20, 30};	// 참조변수를 먼저 선언하고, 나중에 배열을 생성. new int[] 생성자 사용해야함.
//		arr2 = new int[3] {1, 2, 3};	// {} 사용시 {} 안의 데이터가 생성되므로 int[]를 사용(개수 지정할 필요없음)
		arr2 = new int[3];	// 3개가 생성되고 초기값은 0이 된다.
		int arr3[] = new int[5];
		double darr[] = new double[10];
		darr[0] = 2.14;
		String[] strArr = new String[10];
		strArr[0] = "홍길동";
		
	}

}
