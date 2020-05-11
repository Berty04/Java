package by.academy.HW1.Task3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите тип данных: ");
		String strDataType = sc.nextLine();
		
		switch (strDataType) {
			case "int": 
				System.out.println("¬ведите число int: ");
				int varInt = sc.nextInt();
				System.out.println(varInt % 2);
			break;
			case "double":
				System.out.println("¬ведите число double: ");
				double varDouble = sc.nextDouble();
				System.out.println(varDouble * 0.7);
				break;	
			case "float":
				System.out.println("¬ведите число float: ");
				float varFloat = sc.nextFloat();
				System.out.println(varFloat * varFloat);
			break;	
			case "char":
				System.out.println("¬ведите символ: ");
				char varChar = sc.next().charAt(0);
				System.out.println((int)varChar);	
			break;	
			case "String":
				System.out.println("¬ведите строку: ");
				String varString = sc.nextLine();
				System.out.println("Hello " + varString);
			break;	
			default:
				System.out.println("Unsupported type");		
		}
		sc.close();
	}
}
