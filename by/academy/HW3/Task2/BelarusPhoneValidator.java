package by.academy.HW3.Task2;

public class BelarusPhoneValidator implements Validator {
	String phoneNumber;

	public BelarusPhoneValidator(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public BelarusPhoneValidator() {
		super();
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public boolean validate (String phoneNumber) {
		if (phoneNumber.matches("^\\+375[0-9]{9}$")) {
			return true;
		} else {
			return false;
		}
	}
}
