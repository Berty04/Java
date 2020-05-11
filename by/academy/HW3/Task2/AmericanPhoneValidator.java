package by.academy.HW3.Task2;

public class AmericanPhoneValidator implements Validator {
	String phoneNumber;

	public AmericanPhoneValidator(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public AmericanPhoneValidator() {
		super();
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public boolean validate (String phoneNumber) {
		if (phoneNumber.matches("^\\+1[0-9]{10}$")) {
			return true;
		} else {
			return false;
		}
	}
	
}
