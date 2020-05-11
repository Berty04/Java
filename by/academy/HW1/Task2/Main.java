package by.academy.HW1.Task2;

import java.util.Scanner;

public class Main {
	public static void main(String ...arg) {
		int monthNumber = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите название мес€ца: ");
		String strMonth = sc.nextLine();
	
		switch (strMonth) {
			case "январь": monthNumber = 1;
			break;
			case "‘евраль": monthNumber = 2;
			break;
			case "ћарт": monthNumber = 3;
			break;
			case "јпрель": monthNumber = 4;
			break;
			case "ћай": monthNumber = 5;
			break;
			case "»юнь": monthNumber = 6;
			break;
			case "»юль": monthNumber = 7;
			break;
			case "јвгуст": monthNumber = 8;
			break;
			case "—ент€брь": monthNumber = 9;
			break;
			case "ќкт€брь": monthNumber = 10;
			break;
			case "Ќо€брь": monthNumber = 11;
			break;
			case "ƒекабрь": monthNumber = 12;
			break;
			default:
			System.out.print("ћес€ца с таким названием не существует!");
		}
		
		if (monthNumber >= 1 && monthNumber <= 12) {
			System.out.println(monthNumber);
		}
		sc.close();		
	}
}
