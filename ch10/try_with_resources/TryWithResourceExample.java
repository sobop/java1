package ch10.try_with_resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceExample {

	public static void main(String[] args) {
		File file = new File("text.txt");
		try (FileOutputStream fos = new FileOutputStream(file);) {	
			// ()안에는 자원을 획득하는 문장을 작성 -> 자원반납을 JVM이 알아서 처리를 한다.
			// finally에서 자원을 반납할 필요가 없음
			// FileOutputStream은 Closable interface를 구현하였음.
			// try with resources를 사용하려면 Closable interface를 구현해야한다.
			// 파일이 존재하지 않을 수 있음 -> 예외처리
			String str = "Hello everyone!!";
			fos.write(str.getBytes());	// 예외처리 (남은 파일 시스템이 부족)
		} catch(FileNotFoundException e) {
			System.out.println("올바른 파일명을 입력하세요.");
		} catch(IOException e) {
			System.out.println("쓰기 에러 발생");
		}

	}

}
