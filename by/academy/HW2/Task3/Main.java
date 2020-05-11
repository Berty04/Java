package by.academy.HW2.Task3;

public class Main {
	public static void main(String[] args) {
		Money amount1 = new Money(550.50);
		Money amount2 = new Money(225.12);
		
		amount1.add(amount2);
		System.out.println(amount1);
		
		amount1.subtract(amount2);
		System.out.println(amount1);
		
		amount1.multiply(amount2);
		System.out.println(amount1);
		
		amount1.divide(amount2);
		System.out.println(amount1);
	}
}
