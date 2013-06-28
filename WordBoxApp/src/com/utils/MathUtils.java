package com.utils;

import java.util.Calendar;

public class MathUtils {
	
	public static void random(int a){
		int i = (int)(Math.random()*a);
	}
	
	public static void Time(){
		long end = System.currentTimeMillis();
		
		final Calendar c = Calendar.getInstance();
	    final int Year = c.get(Calendar.YEAR);
	    final int Month = c.get(Calendar.MONTH);  // 1월(0), 2월(1)...
	    final int Day = c.get(Calendar.DAY_OF_MONTH);
	    final int DayOfWeek = c.get(Calendar.DAY_OF_MONTH); // 일요일(1), 월요일(2)...
	    final int Hour = c.get(Calendar.HOUR_OF_DAY);  // HOUR는 12시간, HOUR_OF_DAY는 24시간
	    final int Minute = c.get(Calendar.MINUTE);
	    final int Second = c.get(Calendar.SECOND);
	    final int AmPm = c.get(Calendar.AM_PM);  //
	}
	
}
