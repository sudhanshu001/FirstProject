import java.sql.Date;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTime());
		c.setTime(Date.parse("03-12-2017"));
		c.setTimeZone(TimeZone.getTimeZone("EST"));
		
		
		System.out.println(c.isWeekDateSupported());
	}

}
