package com.hk.app;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		// cal 공유해도 괜찮다.
		Calendar cal = Calendar.getInstance();
		// 싱글톤
		// if (cal != null) Calendar cal = new Calendar()
		// else cal
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); // 0부터 시작
		
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
	}
}
