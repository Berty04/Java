package by.academy.HW1.Task7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Введите Строку1: ");
		String str1 = sc.nextLine();
		System.out.println("Введите Строку2: ");
		String str2 = sc.nextLine();
		
		int lenStr1 = str1.length();
		int lenStr2 = str2.length();
		
		if (lenStr1 == lenStr2) {
			char[] charsFromStr1 = str1.toCharArray();
			char[] charsFromStr2 = str2.toCharArray();
			char[] charsCompare = new char[lenStr1];
						
			for (int i = 0; i < lenStr1; i++) {
				for (int j = 0; j <lenStr2; j++) {
					if (charsFromStr1[i] == charsFromStr2[j]) {
						charsFromStr2[j] = ' ';
						charsCompare[i] = charsFromStr1[i];
						break;
					}				
				}					
			}
			if (Arrays.equals(charsFromStr1, charsCompare)) {
				System.out.println("Строка2 является перестановкой символов Строки1");
			}
			else {
				System.out.println("Строка2 не является перестановкой символов Строки1");
			}
		}
		else {
			System.out.println("Строка2 не является перестановкой символов Строки1");
		}
		sc.close();
	}
}
