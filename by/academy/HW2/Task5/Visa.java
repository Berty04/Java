package by.academy.HW2.Task5;

import java.util.Date;

public class Visa extends CreditCards {
	private long cardNumber;
	private int secureCode;
	private Date dateOfValidity;
	
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getSecureCode() {
		return secureCode;
	}
	public void setSecureCode(int secureCode) {
		this.secureCode = secureCode;
	}
	public Date getDateOfValidity() {
		return dateOfValidity;
	}
	public void setDateOfValidity(Date dateOfValidity) {
		this.dateOfValidity = dateOfValidity;
	}
	
	public Visa(String nameOfCardHolder, String familyNameOfCardHolder, String numberOfBankAccount, int currency,
			long creditLimit, String partnerProgram, long cardNumber, int secureCode, Date dateOfValidity) {
		super(nameOfCardHolder, familyNameOfCardHolder, numberOfBankAccount, currency, creditLimit, partnerProgram);
		this.cardNumber = cardNumber;
		this.secureCode = secureCode;
		this.dateOfValidity = dateOfValidity;
	}
	
	public Visa() {
		super();
	}
	
	public Visa(String nameOfCardHolder, String familyNameOfCardHolder, String numberOfBankAccount, int currency,
			long creditLimit, String partnerProgram) {
		super(nameOfCardHolder, familyNameOfCardHolder, numberOfBankAccount, currency, creditLimit, partnerProgram);
	}
}