

import java.util.Calendar;
import static java.util.Calendar.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.TreeSet;


public class ObserveDate{
	public static void main(String args [])
	{
		Date today = new Date();
		DateFormat df = new SimpleDateFormat("dd-MM-YYYY");
	
		df.setTimeZone(TimeZone.getTimeZone("EST"));
		String time = df.format(today);
		System.out.println(time);//
		
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		while(!isBusinessDay(cal))
		{
			cal.add(DATE, 1);
		}
		System.out.println("next business day is "+cal.getTime());
}
	public static boolean isBusinessDay(Calendar cal){
		// check if weekend
		if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
			return false;
		}
		
		// check if New Year's Day
		if (cal.get(Calendar.MONTH) == Calendar.JANUARY
			&& cal.get(Calendar.DAY_OF_MONTH) == 1) {
			return false;
		}
		
		// check if Christmas
		if (cal.get(Calendar.MONTH) == Calendar.DECEMBER
			&& cal.get(Calendar.DAY_OF_MONTH) == 25) {
			return false;
		}
		
		// check if 4th of July
		if (cal.get(Calendar.MONTH) == Calendar.JULY
			&& cal.get(Calendar.DAY_OF_MONTH) == 4) {
			return false;
		}
		
		// check Thanksgiving (4th Thursday of November)
		if (cal.get(Calendar.MONTH) == Calendar.NOVEMBER
			&& cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 4
			&& cal.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
			return false;
		}
		
		// check Memorial Day (last Monday of May)
		if (cal.get(Calendar.MONTH) == Calendar.MAY
			&& cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY
			&& cal.get(Calendar.DAY_OF_MONTH) > (31 - 7) ) {
			return false;
		}
		
		// check Labor Day (1st Monday of September)
		if (cal.get(Calendar.MONTH) == Calendar.SEPTEMBER
			&& cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 1
			&& cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
			return false;
		}
		
		// check President's Day (3rd Monday of February)
		if (cal.get(Calendar.MONTH) == Calendar.FEBRUARY
		&& cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 3
		&& cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
		return false;
		}
		
		// check Veterans Day (November 11)
		if (cal.get(Calendar.MONTH) == Calendar.NOVEMBER
		&& cal.get(Calendar.DAY_OF_MONTH) == 11) {
		return false;
		}
		
		// check MLK Day (3rd Monday of January)
		if (cal.get(Calendar.MONTH) == Calendar.JANUARY
		&& cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 3
		&& cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
		return false;
		}
		
		// IF NOTHING ELSE, IT'S A BUSINESS DAY
		return true;
	}
}