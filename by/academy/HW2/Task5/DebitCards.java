package by.academy.HW2.Task5;

abstract class DebitCards extends BankingCards {
	private int currency;
	private double interestOnAccountBalance;
	public String partnerProgram;
	
	public int getCurrency() {
		return currency;
	}
	public void setCurrency(int currency) {
		this.currency = currency;
	}
	public double getInterestOnAccountBalance() {
		return interestOnAccountBalance;
	}
	public void setInterestOnAccountBalance(double interestOnAccountBalance) {
		this.interestOnAccountBalance = interestOnAccountBalance;
	}
	public String getPartnerProgram() {
		return partnerProgram;
	}
	public void setPartnerProgram(String partnerProgram) {
		this.partnerProgram = partnerProgram;
	}
	
	public DebitCards(String nameOfCardHolder, String familyNameOfCardHolder, String numberOfBankAccount, int currency,
			double interestOnAccountBalance, String partnerProgram) {
		super(nameOfCardHolder, familyNameOfCardHolder, numberOfBankAccount);
		this.currency = currency;
		this.interestOnAccountBalance = interestOnAccountBalance;
		this.partnerProgram = partnerProgram;
	}
	
	public DebitCards() {
		super();
	}
	
	public DebitCards(String nameOfCardHolder, String familyNameOfCardHolder, String numberOfBankAccount) {
		super(nameOfCardHolder, familyNameOfCardHolder, numberOfBankAccount);
	}
}
