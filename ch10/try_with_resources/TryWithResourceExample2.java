package ch10.try_with_resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceExample2 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			File file = new File("text.txt");
			fos = new FileOutputStream(file);
			// 파일이 존재하지 않을 수 있음 -> 예외처리
			String str = "Hello everyone!!";
			fos.write(str.getBytes());	// 예외처리 (남은 파일 시스템이 부족)
		} catch(FileNotFoundException e) {
			System.out.println("올바른 파일명을 입력하세요.");
		} catch(IOException e) {
			System.out.println("쓰기 에러 발생");
		} finally {
			if(fos != null) {
				try {
				fos.close();
				} catch(IOException e) { } 
			}
		}

	}

}
