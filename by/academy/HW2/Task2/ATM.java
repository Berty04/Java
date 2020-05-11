package by.academy.HW2.Task2;

public class ATM {
	private int banknotes20Qty;
	private int banknotes50Qty;
	private int banknotes100Qty;
	
	public ATM() {
		super();
	}
	
	public ATM(int banknotes20Qty, int banknotes50Qty, int banknotes100Qty) {
		super();
		this.banknotes20Qty = banknotes20Qty;
		this.banknotes50Qty = banknotes50Qty;
		this.banknotes100Qty = banknotes100Qty;
	}
	public int getBanknotes20Qty() {
		return banknotes20Qty;
	}
	public void setBanknotes20Qty(int banknotes20Qty) {
		this.banknotes20Qty = banknotes20Qty;
	}
	public int getBanknotes50Qty() {
		return banknotes50Qty;
	}
	public void setBanknotes50Qty(int banknotes50Qty) {
		this.banknotes50Qty = banknotes50Qty;
	}
	public int getBanknotes100Qty() {
		return banknotes100Qty;
	}
	public void setBanknotes100Qty(int banknotes100Qty) {
		this.banknotes100Qty = banknotes100Qty;
	}
	
	public void replenishmentATM(int banknotes20Qty, int banknotes50Qty, int banknotes100Qty) {
		this.banknotes20Qty += banknotes20Qty;
		this.banknotes50Qty += banknotes50Qty;
		this.banknotes100Qty += banknotes100Qty;
	}
	
	public boolean withdrawalATM (int withdrawalAmount) {
		int withdrawalBanknotes100Qty = 0;
		int withdrawalBanknotes50Qty = 0;
		int withdrawalBanknotes20Qty = 0;
		
		int restOfAmountAfter100 = 0;
		int restOfAmountAfter50 = 0;
		int restOfAmountAfter20 = 1;
		
		for (int i = 1; i <= 2 && restOfAmountAfter20 != 0; i++) {
			withdrawalBanknotes100Qty = withdrawalAmount / 100;
			if (withdrawalBanknotes100Qty < this.banknotes100Qty) {
				restOfAmountAfter100 = withdrawalAmount - withdrawalBanknotes100Qty * 100;
			} else {
				withdrawalBanknotes100Qty = this.banknotes100Qty;
				restOfAmountAfter100 = withdrawalAmount - this.banknotes100Qty * 100;
			}	
						
			withdrawalBanknotes50Qty = restOfAmountAfter100 / 50;
			if (withdrawalBanknotes50Qty < this.banknotes50Qty) {
				restOfAmountAfter50 = restOfAmountAfter100 - withdrawalBanknotes50Qty * 50;
			} else {
				if (i == 1) {
					withdrawalBanknotes50Qty = this.banknotes50Qty;
					restOfAmountAfter50 = restOfAmountAfter100 - this.banknotes50Qty * 50;
				} else {
					withdrawalBanknotes50Qty = this.banknotes50Qty - 1;
					restOfAmountAfter50 = restOfAmountAfter100 - withdrawalBanknotes50Qty * 50;
				}
			}	
						
			withdrawalBanknotes20Qty = restOfAmountAfter50 / 20;
			if (withdrawalBanknotes20Qty < this.banknotes50Qty) {
				restOfAmountAfter20 = restOfAmountAfter50 - withdrawalBanknotes20Qty * 20; 
			} else {
				withdrawalBanknotes20Qty = this.banknotes20Qty;
				restOfAmountAfter20 = restOfAmountAfter50 - this.banknotes20Qty * 20;
			}
		}
					
		if (restOfAmountAfter20 == 0) {
			System.out.println("Banknotes withdrawed: " + withdrawalBanknotes100Qty + " banknotes x 100 BYN, " 
		                                                + withdrawalBanknotes50Qty + " banknotes x 50 BYN, "
		                                                + withdrawalBanknotes20Qty + " banknotes x 20 BYN");
			
			this.banknotes100Qty -= withdrawalBanknotes100Qty;
			this.banknotes50Qty -= withdrawalBanknotes50Qty;
			this.banknotes20Qty -= withdrawalBanknotes20Qty;
			
			System.out.println("Banknotes rest: " + this.banknotes100Qty + " banknotes x 100 BYN, "
					                              + this.banknotes50Qty + " banknotes x 50 BYN, "
					                              + this.banknotes20Qty + " banknotes x 20 BYN" );
			return true;
		} else {
			return false;
		}
	}
}
