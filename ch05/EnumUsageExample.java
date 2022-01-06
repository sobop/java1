package ch05;

import java.util.Calendar;

public class EnumUsageExample {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DATE);
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}

}
