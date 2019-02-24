package com.webstack.util;

public class CalendarUtil {

	final static String days[] = {"Monday","Thuesday","Wednesday","Thurseday","Friday","Saturday","Sunday"};
	
	public static String[] getDays() {
		String allDays[] = new String[days.length];
		int i =0;
		for (String string : days) {
			allDays[i++] = string;
		}
		return allDays;
	}
	
	public static String getThirdDayOfWeek() {
		return days[2];
	}
	
}
