package by.academy.HW5.Task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		String sourceText = "";
		String targetText = "";
		BufferedReader br = null;
		PrintWriter pw1 = null;
		PrintWriter pw2 = null;
		Random random = new Random();

		Path path = Paths.get("C:\\HW\\Task4");
		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

		try {
			pw2 = new PrintWriter(new BufferedWriter(new FileWriter("c:\\HW\\Task4\\result.txt", false)));
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		for (int i = 1; i <= 100; i++) {
			File file = new File("c:\\HW\\Task4", Integer.toString(i) + ".txt");
			try {
				pw1 = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));
				br = new BufferedReader(new FileReader("c:\\HW\\Task2\\text.txt"));
				pw2 = new PrintWriter(new BufferedWriter(new FileWriter("c:\\HW\\Task4\\result.txt", true)));
				
				while ((sourceText = br.readLine()) != null) {
					targetText = sourceText.substring(0, random.nextInt(sourceText.length() + 1));
				}
				br.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
			
			pw1.print(targetText);
			pw1.close();
			pw2.print(file + ": " + file.length() + " байт(а);\n");
			pw2.close();
		}
		System.out.println("Done!!!");
	}
}
