package ph.rico.spring;

import java.util.Calendar;

public class Bean0308A {
	private Calendar calendar;

	public Bean0308A(Calendar calendarArg) {
		super();
		this.calendar = calendarArg;
	}
	
	public int getYear() {
		return this.calendar.get(Calendar.YEAR);
	}
}
