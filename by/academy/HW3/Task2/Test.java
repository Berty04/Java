package by.academy.HW3.Task2;

public class Test implements Validator {
	String t;

	public Test(String t) {
		super();
		this.t = t;
	}

	public Test() {
		super();
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	@Override
	public boolean validate(String str) {
		throw new UnsupportedOperationException();
	}
}
