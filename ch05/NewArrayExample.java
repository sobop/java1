package ch05;

import java.util.Arrays;

//배열은 한번 생성할 떄 크기가 고정된다.
//따라서 더 큰 배열을 사용하려면 새로 생성해야한다.
//기존에 있던 데이터를 복사할 필요가 있다.
public class NewArrayExample {

	public static void main(String[] args) {
		int oldArr[] = {2, 4, 6};
		int newArr[] = new int [5];
		
		// 1. for문
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		
		// 2. System.arrayCopy를 이용하는 방법
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length );
		printArray(newArr);
		
		System.out.println();
		
		// 3. Arrays.copyOf를 사용하는 방법
		int newArr2[] = Arrays.copyOf(oldArr, oldArr.length + 3);
		printArray(newArr);
	}

	private static void printArray(int[] newArr) {
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}

}
