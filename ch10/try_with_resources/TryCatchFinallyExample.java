package ch10.try_with_resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// 파일에 쓰기
		FileOutputStream fos = null;
		try {
			File file = new File("test.txt");
			fos = new FileOutputStream(file);
			// 파일이 존재하지 않을 수 있음 -> 예외처리를 해 달라.
			String str = "Hello everyone!!";
			fos.write(str.getBytes()); // 예외처리 (남은 파일시스템이 부족)
		} catch (FileNotFoundException e) {
			// 디렉토리에 쓰기가 불가능한 경우(금지되어 있는 경우)
			System.out.println("올바른 파일명을 입력하세요.");
		} catch (IOException e) {
			System.out.println("쓰기 에러 발생");
		} finally {
			if (fos != null) { // 자원(resource) 반납
				try {
					fos.close();
				} catch (IOException e) {
				} // 자원 반납
			}
		}
	}

}
