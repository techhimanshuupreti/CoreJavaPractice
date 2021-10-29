
import java.util.Calendar;

import com.upreti.practice.stringrelated.StringRelatedMethods;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("hello");
		
		int dayOfMonth=9;
		int month = 9;
		int year = 2021;
		
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(year, month, dayOfMonth);
//		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
//		String name =days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
//	    System.out.println("Current day = " + name);
	    
	    StringRelatedMethods stRelatedMethods = new StringRelatedMethods();
	    String output = stRelatedMethods.findDay(month, dayOfMonth, year);
	   System.out.println(output);
	}
}
