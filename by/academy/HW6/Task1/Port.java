package by.academy.HW6.Task1;

import java.util.ArrayList;

public class Port {
	public static final int SHIPS_QTY = 20;
		
	public static void main(String[] args) {
		Warehouse warehouse = new Warehouse();
		
		new ArrayList<Ship>() {
			private static final long serialVersionUID = 1L;
			{
				for (int i = 1; i <= SHIPS_QTY; i++) {
					String shipNumber = "Ship" + i;
					add(new Ship(warehouse, shipNumber));
				}
			}
		};
	}
}