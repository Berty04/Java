package by.academy.HW2.Task1;

public class Main {
	public static void main(String[] args) {
		PeriodOfTime period1 = new PeriodOfTime(90);
		System.out.println(period1.getSecondsTotal());
		
		PeriodOfTime period2 = new PeriodOfTime(0, 1, 25);
		period2.periodOfTime();
		System.out.println(period2.getSecondsTotal());
		
		int resultOfCompare = period1.compareTo(period2);
		System.out.println(resultOfCompare);
		
		PeriodOfTime period3 = new PeriodOfTime(90);
		System.out.println(period3);
		
		PeriodOfTime period4 = new PeriodOfTime(0, 1, 25);
		period4.periodOfTime();
		System.out.println(period4);
	}
}