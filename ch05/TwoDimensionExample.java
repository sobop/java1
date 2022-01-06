package ch05;
/*
 * 2차원 배열
 * int[][] twod = new int[2][3];	//행렬
 */
public class TwoDimensionExample {

	public static void main(String[] args) {
		int twod[][] = new int[2][3];	// 방법 1
		
		int[][] arr2 = {{2, 3, 4}, {10, 20, 30}};	// 방법 2
		
		int[][] arr4 = new int[2][];
		arr4[0] = new int[2];
		arr4[1] = new int[3];
		
		arr4[0] = new int[] {2, 3};
		arr4[1] = new int[] {10, 20, 30};
		
		for(int i = 0; i < arr4.length; i++) {
			for(int j = 0; j < arr4[1].length; j++) {
				System.out.printf("%4d", arr4[i][j]);
			}
		}
		System.out.println();
	}

}
