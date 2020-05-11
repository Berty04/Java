package by.academy.HW4.Task3;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Integer[] array = new Integer[] { 1, 2, 3, 4, 5, 6 };
		Box<Integer> box = new Box<>(array);
		Iterator<Integer> iterator = box.iterator();

		System.out.println("iterator:");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
