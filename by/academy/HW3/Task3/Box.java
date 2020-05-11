package by.academy.HW3.Task3;

import java.util.Arrays;

public class Box<T> {
	private T[] array;
	int arrayLength;

	@SuppressWarnings("unchecked")
	public Box(int arrayLength) {
		super();
		this.arrayLength = arrayLength;
		this.array = (T[]) new Object[arrayLength];
	}
	
	@SuppressWarnings("unchecked")
	public Box() {
		super();
		this.array = (T[]) new Object[16];
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public int getArrayLength() {
		return arrayLength;
	}

	public void setArrayLength(int arrayLength) {
		this.arrayLength = arrayLength;
	}
	
	public void add(T obj) {
		boolean arrayAlreadyFilled = true;
		for(int i = 0; i < getArraySize(); i++) {
			if(this.array[i] == null) {
				this.array[i] = obj;
				arrayAlreadyFilled = false;
				break;
			}
		}
		if (arrayAlreadyFilled) {
			this.array = Arrays.copyOf(this.array, getArraySize() + 1);
			this.array[getArraySize() - 1] = obj;
		}
	}
	public T get(int index) {
		if(index < getArraySize()) {
			return this.array[index];
		} else {
			System.out.println("The element of array with entered index doesn't exist");
			return null;
		}
	}
	
	public T getLast() {
		return this.array[getArraySize() - 1];
	}
	
	public T getFirst() {
		return this.array[0];
	}

	public int getArraySize() {
		return this.array.length;
	}
	
	public T getLastFilled() {
		T lastFilled = null;
		for(int i = getArraySize() - 1; i >= 0; i--) {
			if(this.array[i] != null) {
				lastFilled = this.array[i];
				break;
			}
		}
		return lastFilled;
	}
	
	public void removeByIndex(int index) {
		if(index < getArraySize()) {
			for(int i = index; i < getArraySize() - 1; i++) {
				this.array[i] = this.array[i+1];
			}
			this.array = Arrays.copyOf(this.array, getArraySize() - 1);
		} else {
			System.out.println("The element of array with entered index doesn't exist");
		}
	}
	
	public void removeByValue(T obj) {
		for(int i = 0; i < getArraySize(); i++) {
			if(this.array[i] == obj) {
				for(int j = i; j < getArraySize() - 1; j++) {
					this.array[j] = this.array[j+1];
				}
				this.array = Arrays.copyOf(this.array, getArraySize() - 1);
				i--;
			}
		}
	}
}
