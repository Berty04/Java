package by.academy.HW2.Task5;

abstract class BankingCards {
	private String nameOfCardHolder;
	private String familyNameOfCardHolder;
	private String numberOfBankAccount;
	
	public String getNameOfCardHolder() {
		return nameOfCardHolder;
	}
	public void setNameOfCardHolder(String nameOfCardHolder) {
		this.nameOfCardHolder = nameOfCardHolder;
	}
	public String getFamilyNameOfCardHolder() {
		return familyNameOfCardHolder;
	}
	public void setFamilyNameOfCardHolder(String familyNameOfCardHolder) {
		this.familyNameOfCardHolder = familyNameOfCardHolder;
	}
	public String getNumberOfBankAccount() {
		return numberOfBankAccount;
	}
	public void setNumberOfBankAccount(String numberOfBankAccount) {
		this.numberOfBankAccount = numberOfBankAccount;
	}
	
	public BankingCards(String nameOfCardHolder, String familyNameOfCardHolder, String numberOfBankAccount) {
		super();
		this.nameOfCardHolder = nameOfCardHolder;
		this.familyNameOfCardHolder = familyNameOfCardHolder;
		this.numberOfBankAccount = numberOfBankAccount;
	}
	
	public BankingCards() {
		super();
	}
}
