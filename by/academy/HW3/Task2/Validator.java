package by.academy.HW3.Task2;

public interface Validator {
	boolean validate(String str);
	
	@Deprecated
	public default boolean test(String t) {
		if (t.matches("^\\+1[0-9]{10}$") || 
			t.matches("^\\+375[0-9]{9}$") ||
			t.matches("^[_a-z0-9]+(\\.[a-z0-9]+)*@[a-z0-9-]+(\\.[a-z]{2,})$")) {
			return true;
		} else {
			return false;
		}
	}
}
