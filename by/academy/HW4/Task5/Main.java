package by.academy.HW4.Task5;

public class Main {
	public static void main(String[] args) {
		int[] array = new int[8];

		try {
			for (int i = 0; i < 10; i++) {
				array[i] = i;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array is to small, expand the array");
		}
	}
}
