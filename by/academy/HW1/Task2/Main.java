package by.academy.HW1.Task2;

import java.util.Scanner;

public class Main {
	public static void main(String ...arg) {
		int monthNumber = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� �������� ������: ");
		String strMonth = sc.nextLine();
	
		switch (strMonth) {
			case "������": monthNumber = 1;
			break;
			case "�������": monthNumber = 2;
			break;
			case "����": monthNumber = 3;
			break;
			case "������": monthNumber = 4;
			break;
			case "���": monthNumber = 5;
			break;
			case "����": monthNumber = 6;
			break;
			case "����": monthNumber = 7;
			break;
			case "������": monthNumber = 8;
			break;
			case "��������": monthNumber = 9;
			break;
			case "�������": monthNumber = 10;
			break;
			case "������": monthNumber = 11;
			break;
			case "�������": monthNumber = 12;
			break;
			default:
			System.out.print("������ � ����� ��������� �� ����������!");
		}
		
		if (monthNumber >= 1 && monthNumber <= 12) {
			System.out.println(monthNumber);
		}
		sc.close();		
	}
}
