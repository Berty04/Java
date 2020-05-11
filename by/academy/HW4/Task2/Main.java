package by.academy.HW4.Task2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		System.out.println("---------------------");
		System.out.println("ArrayList");
		System.out.println("---------------------");

		long start = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			arrayList.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList put time is: " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			arrayList.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList get time is: " + (end - start));

		System.out.println("---------------------");
		System.out.println("LinkedList");
		System.out.println("---------------------");

		start = System.currentTimeMillis();
		for (int i = 0; i < 1000_000; i++) {
			linkedList.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList put time is: " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			linkedList.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList get time is: " + (end - start));
	}
}
