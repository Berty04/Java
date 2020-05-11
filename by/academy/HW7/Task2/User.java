package by.academy.HW7.Task2;

public class User extends Person {
	protected String login;
	protected String password;
	protected String email;

	public User(String login, String password, String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public User() {
		super();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	protected void printUserInfo() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(dateOfBirth);
		System.out.println(email);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [firstName: ");
		builder.append(firstName);
		builder.append(", lastName: ");
		builder.append(lastName);
		builder.append(", age: ");
		builder.append(age);
		builder.append(", dateOfBirth: ");
		builder.append(dateOfBirth);
		builder.append(", login: ");
		builder.append(login);
		builder.append(", password: ");
		builder.append(password);
		builder.append(", email: ");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
}
