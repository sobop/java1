package ch15.list_collection_vector;

import java.util.List;
import java.util.Vector;

// Vector : List의 구체객체의 하나인데 동기화(Synchronization)를 지원한다.
// 여러 사람이 하나의 화장실(변기) 이용하는 것과 같다.
// 동시에 두 스레드가 사용할 수 없다.
// 어느 하나의 스레드가 사용을 하면 lock이 걸려서 다른 스레드는 사용 불가
// 사용하고 있는 스레드가 다 사용하면 lock을 푼다.
// 다른 스레드가 사용할 수 있다.
// Object 클래스의 메소드 wait(), notify() 메소드를 사용

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("제목1", "내용1", "글쓴이1"));	// 0
		list.add(new Board("제목2", "내용2", "글쓴이2"));	// 1
		list.add(new Board("제목3", "내용3", "글쓴이3"));	// 2 (삭제)
		list.add(new Board("제목4", "내용4", "글쓴이4"));	// 3
		list.add(new Board("제목5", "내용5", "글쓴이5"));	// 4 (삭제)
		
		list.remove(2);
		list.remove(3);
		
		for(int i = 0;i < list.size();i++) {
			Board board = list.get(i);
			System.out.println(board);	// board.toString()을 호출
		}
	}

}
