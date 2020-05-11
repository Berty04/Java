package by.academy.HW2.Task3;

public class Money {
	private long rubles;
	private char kopecs;
		
	public Money(double value) {
		splitToRubAndKop(value);
	}
	
	public long getRubles() {
		return rubles;
	}
	public void setRubles(long rubles) {
		this.rubles = rubles;
	}
	public char getKopecs() {
		return kopecs;
	}
	public void setKopecs(char kopecs) {
		this.kopecs = kopecs;
	}
	
	private void splitToRubAndKop(double val) {
		this.rubles = (long) val;
		this.kopecs = (char) (val *100 % 100);
	}
	
	private long convertToKopecs(long rub, char kop) {
		return rub * 100 + (int)kop;
	}
	
	private void convertToRubles(long value) {
		this.rubles = value / 100;
		this.kopecs = (char)(value % 100); 
	}
	
	public double add(Money addendum) {
		long sum = convertToKopecs(this.rubles, this.kopecs) + convertToKopecs(addendum.rubles, addendum.kopecs);
		convertToRubles(sum);
		return sum / 100;
	}
	
	public double subtract(Money addendum) {
		long sub = convertToKopecs(this.rubles, this.kopecs) - convertToKopecs(addendum.rubles, addendum.kopecs);
		convertToRubles(sub);
		return sub / 100; 
	}
	
	public double multiply(Money addendum) {
		long mul = convertToKopecs(this.rubles, this.kopecs) * convertToKopecs(addendum.rubles, addendum.kopecs);
		convertToRubles(mul / 100);
		return mul / 10000; 
	}
	
	public double divide(Money addendum) {
		double div = (double)convertToKopecs(this.rubles, this.kopecs) / (double)convertToKopecs(addendum.rubles, addendum.kopecs);
		convertToRubles((long)(div * 100));
		return div; 
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.rubles);
		builder.append(",");
		if ((int)this.kopecs < 10) {
			builder.append("0");
		}
		builder.append((int)this.kopecs);
		return builder.toString();
	}	
}
