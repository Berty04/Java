package by.academy.HW5.Task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		String tmpStr;

		try {
			br = new BufferedReader(new FileReader("c:\\HW\\Task2\\text.txt"));
			pw = new PrintWriter(new BufferedWriter(new FileWriter("c:\\HW\\Task2\\result.txt", false)));
			while ((tmpStr = br.readLine()) != null) {
				String[] str = tmpStr.split("\\s");
				for (String element : str) {
					pw.print(element);
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		pw.close();
		System.out.println("Done!!!");
	}
}
