package by.academy.HW7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		User user = new User();

		Class<User> userClass = User.class;

		System.out.println("----------------------------Method-----------------------------------");
		Method getFirstNameMethod;
		try {
			getFirstNameMethod = userClass.getMethod("getFirstName");
			System.out.println(getFirstNameMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method setFirstNameMethod;
		try {
			setFirstNameMethod = userClass.getMethod("setFirstName", String.class);
			System.out.println(setFirstNameMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method getLastNameMethod;
		try {
			getLastNameMethod = userClass.getMethod("getLastName");
			System.out.println(getLastNameMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method setLastNameMethod;
		try {
			setLastNameMethod = userClass.getMethod("setLastName", String.class);
			System.out.println(setLastNameMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method getAgeMethod;
		try {
			getAgeMethod = userClass.getMethod("getAge");
			System.out.println(getAgeMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method setAgeMethod;
		try {
			setAgeMethod = userClass.getMethod("setAge", int.class);
			System.out.println(setAgeMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method getDateOfBirthMethod;
		try {
			getDateOfBirthMethod = userClass.getMethod("getDateOfBirth");
			System.out.println(getDateOfBirthMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method setDateOfBirthMethod;
		try {
			setDateOfBirthMethod = userClass.getMethod("setDateOfBirth", String.class);
			System.out.println(setDateOfBirthMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method getLoginMethod;
		try {
			getLoginMethod = userClass.getMethod("getLogin");
			System.out.println(getLoginMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method setLoginMethod;
		try {
			setLoginMethod = userClass.getMethod("setLogin", String.class);
			System.out.println(setLoginMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method getPasswordMethod;
		try {
			getPasswordMethod = userClass.getMethod("getPassword");
			System.out.println(getPasswordMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method setPasswordMethod;
		try {
			setPasswordMethod = userClass.getMethod("setPassword", String.class);
			System.out.println(setPasswordMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method getEmail;
		try {
			getEmail = userClass.getMethod("getEmail");
			System.out.println(getEmail.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method setEmail;
		try {
			setEmail = userClass.getMethod("setEmail", String.class);
			System.out.println(setEmail.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method printUserInfo;
		try {
			printUserInfo = userClass.getMethod("printUserInfo");
			System.out.println(printUserInfo.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method toString;
		try {
			toString = userClass.getMethod("toString");
			System.out.println(toString.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("----------------------------Methods----------------------------------");
		Method[] methods = userClass.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}

		System.out.println("----------------------------Field------------------------------------");
		try {
			Field firstNameField = userClass.getField("firstName");
			System.out.println(firstNameField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field lastNameField = userClass.getField("lastName");
			System.out.println(lastNameField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field ageField = userClass.getField("age");
			System.out.println(ageField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field dateOfBirthField = userClass.getField("dateOfBirth");
			System.out.println(dateOfBirthField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field loginField = userClass.getField("login");
			System.out.println(loginField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field passwordField = userClass.getField("password");
			System.out.println(passwordField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field emailField = userClass.getField("email");
			System.out.println(emailField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		System.out.println("----------------------------Fields-----------------------------------");
		Field[] fields = userClass.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}

		System.out.println("------------------------Declared Method------------------------------");
		try {
			Method getFirstNameDeclaredMethod = userClass.getDeclaredMethod("getFirstName");
			System.out.println(getFirstNameDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method setFirstNameDeclaredMethod = userClass.getDeclaredMethod("setFirstName");
			System.out.println(setFirstNameDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method getLastNameDeclaredMethod = userClass.getDeclaredMethod("getLastName");
			System.out.println(getLastNameDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method setLastNameDeclaredMethod = userClass.getDeclaredMethod("setLastName");
			System.out.println(setLastNameDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method getAgeDeclaredMethod = userClass.getDeclaredMethod("getAge");
			System.out.println(getAgeDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method setAgeDeclaredMethod = userClass.getDeclaredMethod("setAge");
			System.out.println(setAgeDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method getDateOfBirthDeclaredMethod = userClass.getDeclaredMethod("getDateOfBirth");
			System.out.println(getDateOfBirthDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method setDateOfBirthDeclaredMethod = userClass.getDeclaredMethod("setDateOfBirth");
			System.out.println(setDateOfBirthDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method getloginDeclaredMethod = userClass.getDeclaredMethod("getLogin");
			System.out.println(getloginDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method setloginDeclaredMethod = userClass.getDeclaredMethod("setLogin", String.class);
			System.out.println(setloginDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method getPasswordDeclaredMethod = userClass.getDeclaredMethod("getPassword");
			System.out.println(getPasswordDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method setPasswordDeclaredMethod = userClass.getDeclaredMethod("setPassword", String.class);
			System.out.println(setPasswordDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method getemailDeclaredMethod = userClass.getDeclaredMethod("getEmail");
			System.out.println(getemailDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method setemailDeclaredMethod = userClass.getDeclaredMethod("setEmail", String.class);
			System.out.println(setemailDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method printUserInfoDeclaredMethod = userClass.getDeclaredMethod("printUserInfo");
			System.out.println(printUserInfoDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Method toStringDeclaredMethod = userClass.getDeclaredMethod("toString");
			System.out.println(toStringDeclaredMethod.getName());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		System.out.println("------------------------Declared Methods-----------------------------");
		Method[] declaredMethods = userClass.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}

		System.out.println("-------------------------Declared Field------------------------------");
		try {
			Field firstNameField = userClass.getDeclaredField("firstName");
			System.out.println(firstNameField.getName());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field lastNameField = userClass.getDeclaredField("LastName");
			System.out.println(lastNameField.getName());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field ageField = userClass.getDeclaredField("age");
			System.out.println(ageField.getName());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field dateOfBirthField = userClass.getDeclaredField("dateOfBirth");
			System.out.println(dateOfBirthField.getName());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field loginField = userClass.getDeclaredField("login");
			System.out.println(loginField.getName());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field passwordField = userClass.getDeclaredField("password");
			System.out.println(passwordField.getName());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		try {
			Field emailField = userClass.getDeclaredField("email");
			System.out.println(emailField.getName());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		System.out.println("-------------------------Declared Fields-----------------------------");
		Field[] declaredFields = userClass.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field.getName());
		}

		System.out.println("---------------------------Set values--------------------------------");
		try {
			Field firstNameField = userClass.getDeclaredField("firstName");
			firstNameField.set(user, "John");
			System.out.println("firstName: " + firstNameField.get(user));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field lastNameField = userClass.getDeclaredField("lastName");
			lastNameField.set(user, "Connor");
			System.out.println("lastName: " + lastNameField.get(user));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field ageField = userClass.getDeclaredField("age");
			ageField.setInt(user, 20);
			System.out.println("age: " + ageField.getInt(user));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field dateOfBirthField = userClass.getDeclaredField("dateOfBirth");
			dateOfBirthField.set(user, "01.01.2000");
			System.out.println("dateOfBirth: " + dateOfBirthField.get(user));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field loginField = userClass.getDeclaredField("login");
			loginField.set(user, "JoCo");
			System.out.println("login: " + loginField.get(user));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field passwordField = userClass.getDeclaredField("password");
			passwordField.set(user, "$John01.01.2000");
			System.out.println("password: " + passwordField.get(user));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field emailField = userClass.getDeclaredField("email");
			emailField.set(user, "john.connor@gmail.com");
			System.out.println("email: " + emailField.get(user));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.println("---------------------------Get values--------------------------------");
		try {
			Field firstNameField = userClass.getDeclaredField("firstName");
			String firstNameValue = (String) firstNameField.get(user);
			System.out.println("firstName: " + firstNameValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field lastNameField = userClass.getDeclaredField("lastName");
			String lastNameValue = (String) lastNameField.get(user);
			System.out.println("lastName: " + lastNameValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field ageField = userClass.getDeclaredField("age");
			int ageValue = ageField.getInt(user);
			System.out.println("age: " + ageValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field dateOfBirthField = userClass.getDeclaredField("dateOfBirth");
			String dateOfBirthValue = (String) dateOfBirthField.get(user);
			System.out.println("dateOfBirth: " + dateOfBirthValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field loginField = userClass.getDeclaredField("login");
			String loginValue = (String) loginField.get(user);
			System.out.println("login: " + loginValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field passwordField = userClass.getDeclaredField("password");
			String passwordValue = (String) passwordField.get(user);
			System.out.println("password: " + passwordValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field emailField = userClass.getDeclaredField("email");
			String emailValue = (String) emailField.get(user);
			System.out.println("email: " + emailValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.println("----------------------toString via invoke()--------------------------");
		try {
			Method toStringMethod = userClass.getMethod("toString");
			Object resultValue = toStringMethod.invoke(user);
			System.out.println(resultValue);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
