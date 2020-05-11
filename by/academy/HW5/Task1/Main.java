package by.academy.HW5.Task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = null;

		Path path = Paths.get("c:\\HW\\Task1");
		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

		File file = new File("c:\\HW\\Task1\\information.txt");
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("Please, enter a text using the keyboard:");
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			if (!str.equals("stop")) {
				pw.println(str);
			} else {
				System.out.println("Text input is completed");
				sc.close();
				break;
			}
		}
		pw.close();
	}
}
