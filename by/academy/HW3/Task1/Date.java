package by.academy.HW3.Task1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
	public Day day;
	public Month month;
	public Year year;

	public Date(int d, int m, int y) {
		super();
		this.day = new Day(d);
		this.month = new Month(m);
		this.year = new Year(y);
	}
	public Date (String data) {
		this.day = new Day(Integer.parseInt((data.substring(0, 2)).trim()));
		this.month = new Month(Integer.parseInt((data.substring(3, 5)).trim()));
		this.year = new Year(Integer.parseInt((data.substring(6)).trim()));
	}
	public Date() {
		super();
	}
	private class Day {
		public int d;
		public Day(int d) {
			super();
			this.d = d;
		}
	}
	private class Month {
		public int m;
		public Month(int m) {
			super();
			this.m = m;
		}
	}
	private
	class Year {
		public int y;
		public Year(int y) {
			super();
			this.y = y;
		}
	}
	public void dayOfWeek() {
		Calendar calendar = new GregorianCalendar(year.y, month.m, day.d);
		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
			case 1: System.out.println(day.d + "." + month.m + "." + year.y + " is a " + DaysOfWeek.MONDAY); break;
			case 2: System.out.println(day.d + "." + month.m + "." + year.y + " is a " + DaysOfWeek.TUESDAY); break;
			case 3: System.out.println(day.d + "." + month.m + "." + year.y + " is a " + DaysOfWeek.WEDNESDAY); break;
			case 4: System.out.println(day.d + "." + month.m + "." + year.y + " is a " + DaysOfWeek.THURSDAY); break;
			case 5: System.out.println(day.d + "." + month.m + "." + year.y + " is a " + DaysOfWeek.FRIDAY); break;
			case 6: System.out.println(day.d + "." + month.m + "." + year.y + " is a " + DaysOfWeek.SATURDAY); break;
			case 7: System.out.println(day.d + "." + month.m + "." + year.y + " is a " + DaysOfWeek.SUNDAY); break; 	
		}
	}
	public void intercalaryYearCheck() {
		if(year.y % 4 != 0 || year.y % 100 == 0 && year.y % 400 != 0) {
			System.out.println(year.y + " isn't an intercalary year");
		} else {
			System.out.println(year.y + " is an intercalary year");
		}
	}
	public int daysBetween(Date anotherData) {
		int daysDifference = 0;
		
		Calendar calendar1 = new GregorianCalendar(year.y, month.m, day.d);
		int dayNumber1 = calendar1.get(Calendar.DAY_OF_YEAR);
		
		Calendar calendar2 = new GregorianCalendar(anotherData.year.y, anotherData.month.m, anotherData.day.d);
		int dayNumber2 = calendar2.get(Calendar.DAY_OF_YEAR);
		
		if(anotherData.year.y > year.y) {
			if(anotherData.month.m > month.m) {
				daysDifference = dayNumber2 + (365 - dayNumber1) + (anotherData.year.y - year.y) * 365;
			} else {
				daysDifference = dayNumber2 + (365 - dayNumber1) + (anotherData.year.y - year.y - 1) * 365;
			}
		} else if (anotherData.year.y < year.y) {
			if(anotherData.month.m < month.m) {
				daysDifference = dayNumber1 + (365 - dayNumber2) + (anotherData.year.y - year.y) * 365;
			} else {
				daysDifference = dayNumber1 + (365 - dayNumber2) + (anotherData.year.y - year.y - 1) * 365;
			}
		} else if (anotherData.year.y == year.y) {
			if(dayNumber2 > dayNumber1) {
				daysDifference = dayNumber2 - dayNumber1;
			} else if (dayNumber2 < dayNumber1) {
				daysDifference = dayNumber1 - dayNumber2;
			} else if (dayNumber2 == dayNumber1) {
				daysDifference = 0;
			}
		}
		return daysDifference;
    }
}
