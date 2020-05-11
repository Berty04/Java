package by.academy.HW1.Task5;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		double powerOf2 = 0;
		
		while (powerOf2 <= 1_000_000) {
			powerOf2 = Math.pow(2, i);
			i++;
			System.out.println((int)powerOf2);
		}			
	}
}
