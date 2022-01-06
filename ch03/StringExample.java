package ch03;

public class StringExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 8;
		String str2 = "JDK" + 8 + 1;
		String str3 = str2 + "JDK"; // 메모리 많이 차지
		String str4 = 4 + 5 + "JDK"; // 덧셈먼저
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
