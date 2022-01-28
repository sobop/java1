package ch15.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/*
 * 동기화가 지원되는 Map
 * HashMap : 단일 스레드
 * HashTable : 멀티 스레드
 * 사용방법은 HashMap과 동일
 */
public class HashTableExample {

	public static void main(String[] args) {
		// 어떤 정보를 저장 : (아이디, 비밀번호)의 쌍
		// 데이터베이스 흉내를 냄
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해 주세요.");
			System.out.print("아이디: ");
			String id = scanner.nextLine();	// 한 줄씩 읽는 메소드 : \r\n이 끝에 들어간다.
			System.out.print("비밀번호: ");
			String password = scanner.nextLine();
			System.out.println();
			
			// 로그인 과정 : 아이디가 존재하는지?
			// 아이디가 존재하면, 비밀번호가 맞는지?
			// 아이디와 비밀번호가 일치하면 로그인 성공
			// 아이디와 비밀번호가 일치하지 않으면 로그인 실패
			if(map.containsKey(id)) {	// 존재하는 아이디를 검사
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}
