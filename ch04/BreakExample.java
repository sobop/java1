package ch04;
/*
 * break : 반복문 또는 switch문을 벗어나고자 할 때 사용
 * 
 */
public class BreakExample {

	public static void main(String[] args) {
		/*
		for(int i = 2;i <= 9;i++) {
			System.out.println(i + "단");
			for(int j = 1;j <= 9;j++) {
				if(j > i) {	// i*i까지만 실행하고 그 이후는 반복문을 벗어나도록 break
					break;	// for문을 벗어남
				}
				System.out.println(i + " * " + j + " = " + i*j);
				// i단이면 i*i까지만 출력을 하고 싶다.
				// 2(i)*1(j), 2*2, 2*3(실행하지 않음), 2*4
			}
			System.out.println();
		}
		*/
	
		// 바깥 for문을 벗어나는 방법
		// outer : 라벨 (위치를 나타냄, go to 문에서도 사용)
		outer: for(int i = 2;i <= 9;i++) {
			System.out.println(i + "단");
			for(int j = 1;j <= 9;j++) {
				if(j > i) {	// i*i까지만 실행하고 그 이후는 반복문을 벗어나도록 break
					break;	// 중첩 for문을 벗어남
				}
				if(i > 5) {
					break outer;	// 바깥 for문을 벗어남
				}
				System.out.println(i + " * " + j + " = " + i*j);
				// i단이면 i*i까지만 출력을 하고 싶다.
				// 2(i)*1(j), 2*2, 2*3(실행하지 않음), 2*4
			}
			System.out.println();
		}
	}

}
