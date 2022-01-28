package ch15.list_collection_vector;

public class Board {	// 게시글
	String subject;	// 제목
	String content;	// 내용
	String writer;	// 작성자
	
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
}
