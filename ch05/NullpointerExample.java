package ch05;

public class NullpointerExample {

	public static void main(String[] args) {
		String str1 = new String("한겨울");
		// String str2 = null; // 참조 X
		String str2 = method();
		System.out.println(str1.length()); // 문자열 길이 출력
		System.out.println(str2.length());
		if (str2 != null) {
			System.out.println(str2.length());
		}
		
	}

	private static String method() { // 메소드의 실행결과 null이 올수있다
		// TODO Auto-generated method stub
		return null;
	}

}
