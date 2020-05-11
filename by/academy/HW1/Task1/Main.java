package by.academy.HW1.Task1;

import java.util.Scanner;

public class Main {
	public static void main(String... arg) {
		double multiplier = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите сумму покупки в магазине: ");
		double purchaseAmount = sc.nextDouble();
		System.out.println("Введите возраст покупателя: ");
		int ageBuyer = sc.nextInt();
		sc.close();
		
		if (purchaseAmount < 100) {
			multiplier = 1 - 0.05;
		} else if (purchaseAmount >= 100 && purchaseAmount < 200) {
			multiplier = 1 - 0.07;
		} else if (purchaseAmount >= 200 && purchaseAmount < 300) {
			if (ageBuyer > 18) {
				multiplier = 1 - (0.12 + 0.04);
			} else {
				multiplier = 1 - (0.12 - 0.03);				
			}
		} else if (purchaseAmount >= 300 && purchaseAmount < 400) {
			multiplier = 1 - 0.15;			
		} else if (purchaseAmount >= 400) {
			multiplier = 1 - 0.2;			
		}
		
		double finalPrice = purchaseAmount * multiplier;
		String formattedDouble = String.format("%.2f", finalPrice);
		System.out.println("ФИНАЛЬНАЯ ЦЕНА: " + formattedDouble);		
	}
}