package by.academy.HW2.Task2;

public class Main {
	public static void main(String[] args) {
		boolean result;
		ATM atm1 = new ATM(0, 0, 0);
		atm1.replenishmentATM(10, 10, 10);
		
		result = atm1.withdrawalATM(670);
//		if (result == false) {
//			System.out.println("Невозможно выдать требуемую сумму");
//		}
		
		if (!result) {
			System.out.println("Невозможно выдать требуемую сумму");
		}
		
		atm1.replenishmentATM(20, 20, 20);
		result = atm1.withdrawalATM(920);
	}
}
