package by.academy.HW2.Task1;

public class PeriodOfTime {
	private int hours;
	private int minutes;
	private int seconds;
	private int secondsTotal;
	private String data;

	
	public PeriodOfTime() {
		super();		
	}
	
	public PeriodOfTime(int secondsTotal) {
		super();		
		this.secondsTotal = secondsTotal;
	}
	
	public PeriodOfTime(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
		
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public int getSecondsTotal() {
		return secondsTotal;
	}
	public void setSecondsTotal(int secondsTotal) {
		this.secondsTotal = secondsTotal;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void periodOfTime() {
		int secondsTotal = hours * 360 + minutes * 60 + seconds;
		this.secondsTotal = secondsTotal;
	}
	public int compareTo(PeriodOfTime anotherPeriod) {
		return this.secondsTotal > anotherPeriod.secondsTotal ? 1 : secondsTotal == anotherPeriod.secondsTotal ? 0 : -1;
	}
	
	@Override
	public String toString() {
		int seconds = this.secondsTotal % 60;
				
		int m = (this.secondsTotal - seconds) / 60;
		int minutes = m % 60;
				
		int h = (m - minutes) / 60;
		int hours = h % 24;
				
		data = Integer.toString(hours) + " hours " + Integer.toString(minutes) + " minutes " + Integer.toString(seconds) + " seconds";
		return data;
	}	
}
