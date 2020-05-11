package by.academy.HW3.Task1;

public class Main {
	public static void main(String[] args) {
		Date data1 = new Date(15, 04, 2018);
		data1.dayOfWeek();
		data1.intercalaryYearCheck();
		
		String dataStr = "16-02-2020";
		if (validator(dataStr)) {
			Date data2 = new Date(dataStr);
			data2.dayOfWeek();
			data2.intercalaryYearCheck();
			
			int resultOfCompare = data1.daysBetween(data2);
			System.out.println(resultOfCompare + " days are between the two entered dates");
		}
		else {
			System.out.println("Date format is incorrect");
		}
	}
	
	private static boolean validator(String data) {
		return data.matches("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$");
	}
}
