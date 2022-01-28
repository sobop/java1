package ch15.list_collection;

import java.util.ArrayList;
import java.util.List;

/*	Collection : 데이터를 효과적으로 저장하기 위한 수단을 제공 (인터페이스)
 * 	 - 어떤 객체든지 저장할 수 있다. 여러가지 객체를 저장하지 않고, 한 가지 객체만 저장
 *   - 어떤 객체를 저장할지를 결정을 하면 그 객체만 저장, 사용
 *   - 크기의 제약이 없다. -> 시스템이 허용하는한 무한대로 사용(추가) 가능 -> 자동으로 크기 조절
 *  List, Set, Map 타입이 존재 : 인터페이스
 *  구현 객체를 사용해서 구체화를 한다.
 *  
 * 	List : 배열과 유사
 * 	 - 순서를 유지 : index를 사용
 *   - 중복 저장이 가능
 *   - 보통 데이터베이스에 정보를 저장하는 경우 많이 사용 : 회원정보, 게시글, 상품정보
 *     ...
 *   - 구현 객체 : ArrayList(단일 스레드), Vector(멀티 스레드, 병렬처리),
 *   	LinkedList(양방향)
 *    + ArrayList : 데이터 추가 시 맨 뒤에 저장하는 것이 일반적이다.
 *    	* 중간에 껴넣으려면 오랜 시간이 소요된다.
 *    + LinkedList : 중간에 켜넣는 것이 빠르다.
 *   
 *  Set : 집합
 *   - 순서가 없다.
 *   - 중복을 허용하지 않음.
 *  Map : (키, 값)의 쌍으로 저장
 *   - 키값은 고유해야 한다.
 *   - 검색이 빠르다.
 *   - 설정 값을 저장할 때 많이 사용
 * 
 */
public class ListExample {

	public static void main(String[] args) {
		// 인터페이스 = 구현객체 : 자동타입변환
		// 비어있는 ArrayList 객체를 생성
		List<String> list = new ArrayList<String>();	// ArrayList를 생성
		// String을 저장
		list.add("홍길동");	// add : 맨뒤에 추가된다.
		list.add("감자바");
		list.add("두만강");
		list.add(0, "이수만");	// 맨 앞에 추가
		for(int i = 0;i < list.size();i++) {	// size() : 리스트의 크기
			// i번째에 있는 값을 얻는다.
			String name = list.get(i);	// i번째 값을 얻을 수 있다.
			System.out.println("이름 : " + name);
		}
		System.out.println();
		
		// enhanced for문을 사용해서 반복
		for(String name : list) {
			System.out.println("이름 : " + name);
		}
		
		List<String> list2 = new ArrayList<String>();
		list2.add("한강");
		list2.add("두만강");
		list2.add("압록강");
		
		list.addAll(list2);	// 리스트를 추가
		printList(list);
		
		list.remove(4);	// 한강 삭제
		list.remove("두만강");	// 한 개만 삭제됨 (처음 만나는 것을 삭제)
		printList(list);
		
		list.clear();	// 모두 삭제
		printList(list);
		System.out.println(list.isEmpty());

		List<Member> mList = new ArrayList<Member>();
		mList.add(new Member("kdhong", "홍길동"));	// 0
		mList.add(new Member("hdkang", "강호동"));	// 1
		Member member = mList.get(0);
		System.out.println("id=" + member.id + ", name=" + member.name);
		mList.add("다른것");	// Member 객체만 추가 가능
	}

	private static void printList(List<String> list) {
		System.out.println();
		for(String name : list) {
			System.out.println("이름 : " + name);
		}
	}
}

class Member {
	String id;
	String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
}