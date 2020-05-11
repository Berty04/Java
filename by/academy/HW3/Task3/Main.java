package by.academy.HW3.Task3;

public class Main {
	public static void main(String[] args) {
		Box<Integer> arrayBox  = new Box<Integer>();
		
		for(int i = 0; i < arrayBox.getArraySize(); i++) {
			arrayBox.add(i);
		}
		
		System.out.print("The actual elements of array:");
		for(int i = 0; i < arrayBox.getArraySize(); i++) {
			System.out.print(" " + arrayBox.get(i));
		}
		System.out.println("\nThe actual size of array is: " + arrayBox.getArraySize());
		
		arrayBox.add(7);
		System.out.println("The last filled element of array is: " + arrayBox.getLastFilled());
		
		System.out.print("The actual elements of array:");
		for(int i = 0; i < arrayBox.getArraySize(); i++) {
			System.out.print(" " + arrayBox.get(i));
		}
		System.out.println("\nThe actual size of array is: " + arrayBox.getArraySize());
		
		System.out.println("The first element of array is: " + arrayBox.getFirst());
		System.out.println("The last element of array is: " + arrayBox.getLast());

		arrayBox.removeByIndex(2);
		arrayBox.removeByValue(7);
		
		System.out.print("The actual elements of array:");
		for(int i = 0; i < arrayBox.getArraySize(); i++) {
			System.out.print(" " + arrayBox.get(i));
		}	
		System.out.println("\nThe actual size of array is: " + arrayBox.getArraySize());
	}
}
