package by.academy.HW4.Task4;

import java.util.HashMap;
import java.util.Map;

public class Main {
	private static Map<String, Integer> catalog = new HashMap<String, Integer>();

	private static void addToCatalog(String productToAdd, int qtyToAdd) {
		if (catalog.containsKey(productToAdd)) {
			qtyToAdd += catalog.get(productToAdd);
		}
		catalog.put(productToAdd, qtyToAdd);
	}

	public static void main(String[] args) {
		addToCatalog("Melon", 20);
		addToCatalog("Melon", 20);
		addToCatalog("Pear", 10);
		addToCatalog("Apple", 40);
		addToCatalog("Orange", 20);
		addToCatalog("Melon", 80);
		addToCatalog("Pineapple", 100);
		addToCatalog("Kiwi", 10);
		addToCatalog("Mango", 30);
		addToCatalog("Papaya", 70);
		addToCatalog("Grapefruit", 5);
		addToCatalog("Lemon", 60);
		addToCatalog("Pear", 200);

		System.out.println("Filled catalog: " + catalog);
	}
}
