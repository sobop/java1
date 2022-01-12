package ch06.final_keyword;

public class Television {
	public static final int MIN_VOLUME = 0;	// 상수 (변경되지않는 수)
	public static final int MAX_VOLUME = 100;	// 상수 -> 이름으로 의미 파악가능하게하기
		// 대문자로 작성
		// 연속된 단어는 _ 를 사용해서 단어연결
	int volume;
	
	public void setVolume(int volume) {
		if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}
	}
}
