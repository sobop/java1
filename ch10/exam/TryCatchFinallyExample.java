package ch10.exam;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for(int i = 0;i <= 2; i++) {	// i=2: ArrayIndexOutOfBounsException
			try {
				value = Integer.parseInt(strArray[i]);	// 10
			} catch(ArrayIndexOutOfBoundsException e) {	// i=2
				System.out.println("인덱스를 초과했음");
			} catch(NumberFormatException e) {	// i=1
				System.out.println("숫자로 변경할 수 없음");
			} finally {
				System.out.println(value);
			}
		}
	}

}