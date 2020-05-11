package by.academy.HW5.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		FileOutputStream f = null;
		ObjectOutputStream o = null;

		ArrayList<User> arrayList = new ArrayList<User>() {
			private static final long serialVersionUID = 1L;
			{
				add(new User("Ivan", "Petrov", 25));
				add(new User("Petr", "Ivanov", 26));
				add(new User("Oleg", "Sergeev", 27));
				add(new User("Sergey", "Sidorov", 28));
				add(new User("Yuri", "Eremeev", 29));
				add(new User("Igor", "Makeev", 30));
				add(new User("Dmitry", "Erofeev", 31));
				add(new User("Alex", "Semenov", 32));
				add(new User("Denis", "Panteleev", 33));
				add(new User("Anton", "Stepanov", 34));
			}
		};

		Path path = Paths.get("C:\\HW\\Task3\\users");
		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

		for (int i = 0; i < arrayList.size(); i++) {
			File file = new File("c:\\HW\\Task3\\users",
					arrayList.get(i).getName() + "_" + arrayList.get(i).getSurname() + ".txt");
			try {
				f = new FileOutputStream(file);
				o = new ObjectOutputStream(f);
				o.writeObject(arrayList.get(i));
				o.close();
				f.close();
			} catch (FileNotFoundException e) {
				System.err.println(e.getMessage());
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		System.out.println("Done!!!");
	}
}
