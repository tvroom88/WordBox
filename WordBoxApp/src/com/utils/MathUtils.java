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
	    final int Month = c.get(Calendar.MONTH);  // 1��(0), 2��(1)...
	    final int Day = c.get(Calendar.DAY_OF_MONTH);
	    final int DayOfWeek = c.get(Calendar.DAY_OF_MONTH); // �Ͽ���(1), ������(2)...
	    final int Hour = c.get(Calendar.HOUR_OF_DAY);  // HOUR�� 12�ð�, HOUR_OF_DAY�� 24�ð�
	    final int Minute = c.get(Calendar.MINUTE);
	    final int Second = c.get(Calendar.SECOND);
	    final int AmPm = c.get(Calendar.AM_PM);  //
	}
	
}
