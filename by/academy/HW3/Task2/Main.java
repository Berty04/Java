package by.academy.HW3.Task2;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main (String[] args) {
		Test test = new Test();
		System.out.println(test.test("qwe@qwe.com"));
		
		AmericanPhoneValidator phone1 = new AmericanPhoneValidator();
		System.out.println(phone1.validate("+14294758193"));
		
		BelarusPhoneValidator phone2 = new BelarusPhoneValidator();
		System.out.println(phone2.validate("375296757635"));
		
		System.out.println(emailValidator.validate("qwe@qwe.com"));
	}

	static Validator emailValidator = new Validator() {
		public boolean validate (String eMail) {
			return (eMail.matches("^[_a-z0-9]+(\\.[a-z0-9]+)*@[a-z0-9-]+(\\.[a-z]{2,})$"));
		}
	};
}
