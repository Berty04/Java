package by.academy.HW2.Task5;

abstract class CreditCards extends BankingCards {
	private int currency;
	private long creditLimit;
	public String partnerProgram;
	
	public int getCurrency() {
		return currency;
	}
	public void setCurrency(int currency) {
		this.currency = currency;
	}
	public long getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(long creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getPartnerProgram() {
		return partnerProgram;
	}
	public void setPartnerProgram(String partnerProgram) {
		this.partnerProgram = partnerProgram;
	}
	
	public CreditCards(String nameOfCardHolder, String familyNameOfCardHolder, String numberOfBankAccount, int currency,
			long creditLimit, String partnerProgram) {
		super(nameOfCardHolder, familyNameOfCardHolder, numberOfBankAccount);
		this.currency = currency;
		this.creditLimit = creditLimit;
		this.partnerProgram = partnerProgram;
	}
	
	public CreditCards() {
		super();
	}
	
	public CreditCards(String nameOfCardHolder, String familyNameOfCardHolder, String numberOfBankAccount) {
		super(nameOfCardHolder, familyNameOfCardHolder, numberOfBankAccount);
	}
}
