package com.webstack.client;

import com.webstack.util.CalendarUtil;

public class ClientTest {

	public static void main(String[] args) {
		String allDays[] = CalendarUtil.getDays();
		
		System.out.println("Third Day:: "+CalendarUtil.getThirdDayOfWeek());
		
		allDays[2] = "Holiday";
		
		System.out.println("Third Day:: "+CalendarUtil.getThirdDayOfWeek());
	}

}
