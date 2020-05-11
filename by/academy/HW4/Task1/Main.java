package by.academy.HW4.Task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		@SuppressWarnings("deprecation")
		List<Integer> arrayList = new ArrayList<Integer>() {
			private static final long serialVersionUID = 1L;

			{
				for (int i = 0; i < 4; i++) {
					add(new Integer(i));
					add(new Integer(i));
				}
			}
		};
		System.out.println(arrayList);

		HashSet<Integer> set = new HashSet<Integer>() {
			private static final long serialVersionUID = 1L;

			{
				for (int i = 0; i < arrayList.size(); i++) {
					add(arrayList.get(i));
				}
			}
		};
		System.out.println(set);
	}
}