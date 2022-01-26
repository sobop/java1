package ch10.try_with_resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// 파일에 쓰기
		
		File file = new File("test.txt");
		try (FileOutputStream fos = new FileOutputStream(file);
				) {
			// ()안에는 자원을 획득하는 문장을 작성 -> 자원반납을 JVM이 알아서 처리를 한다.
			// finally에서 자원을 반납할 필요가 없음
			// FileOutputStream은 AutoClosable interface를 구현하였음.
			// try with resources를 사용하려면 AutoClosable interface를 구현해야 한다.
			// ()안에는 자원 반납을 하는 클래스를 얻는 동작만 기술. 다른 문장을 같이 쓸 수 없음.
			// 파일이 존재하지 않을 수 있음 -> 예외처리를 해 달라.
			String str = "Hello everyone!!";
			fos.write(str.getBytes());	// 예외처리 (남은 파일시스템이 부족) 
		}catch(FileNotFoundException e) {
			// 디렉토리에 쓰기가 불가능한 경우(금지되어 있는 경우)
			System.out.println("올바른 파일명을 입력하세요.");
		} catch (IOException e) {
			System.out.println("쓰기 에러 발생");
		}
	}

}
