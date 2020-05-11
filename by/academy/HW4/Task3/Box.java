package by.academy.HW4.Task3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Box<T> {

	private T[] array;

	public Box(T[] array) {
		super();
		this.array = array;
	}

	public Box() {
		super();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Iterator<T> iterator() {
		return new CustomIterator();
	}

	@SuppressWarnings("hiding")
	public class CustomIterator<T> implements Iterator<T> {
		private int index;

		public CustomIterator() {
			index = 0;
		}

		@Override
		public boolean hasNext() {
			return index < array.length;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			if (index < array.length) {
				return (T) array[index++];
			} else {
				throw new NoSuchElementException("No such element.");
			}
		}
	}
}