package ch06.getter_settter;

public class Car {
	private int speed;	// 현재는 접근 권한이 default -> private로 권한주면 수정불가능 
	private String company;
	private String model;
	private int seatNum;
	private int wheelNum;
	private String owner;
	private boolean run;
	
	// 필드에 접근할 수 있는 방법을 제공 : 읽기(Getter), 쓰기(Setter) 권한을 부여하는 메소드
	// 이클립스에서 Getter와 Setter를 만드는 방법을 제공한다
	// Getter : get필드명(대문자로시작)
	public int getSpeed() {	// 필드의 값을 읽을수 있음
		return speed;
	}
	
	// Setter : set필드명(대문자로시작)
	public void setSpeed(int speed) {	// 잘못된값이 저장되는 것을 방지
		if(speed >= 0) {	// speed가 음수가 되는 것을 방지할 수 있음
			this.speed = speed;
		}
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public int getWheelNum() {
		return wheelNum;
	}

	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	// getter
	public boolean isRun() {	// getRun
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}
	
}
