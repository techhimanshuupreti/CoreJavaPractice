package com.upreti.practice.date;

import java.util.Calendar;

public class DateRelated {
	  public String findWeekDayName(int month, int day, int year) {
		   	Calendar calendar = Calendar.getInstance();
		   	calendar.set(year, month-1, day);
		   	String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		   	return days[calendar.get(Calendar.DAY_OF_WEEK) - 1].toUpperCase();
		   }
}
