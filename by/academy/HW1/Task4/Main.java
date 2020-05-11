package by.academy.HW1.Task4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите число: ");
		int number = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= 10 && number > 0 && number <= 10; i++) {
			System.out.println(number + " * " + i + " = " + number * i);				
		}		
	}
}
