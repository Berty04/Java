package by.academy.HW6.Task1;

public class Warehouse {
	public final int WAREHOUSE_CAPACITY = 1000;
	public int containersCurrentQty = 100;

	public synchronized void putToWarehouse() {
		while (containersCurrentQty >= WAREHOUSE_CAPACITY) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		containersCurrentQty++;
		System.out.println("------------------------------");
		System.out.println(Thread.currentThread().getName() + " unloaded 1 container");
		System.out.println("Total containers in warehouse: " + containersCurrentQty + " of " + WAREHOUSE_CAPACITY);
		notify();
	}

	public synchronized void getFromWarehouse() {
		while (containersCurrentQty < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
		containersCurrentQty--;
		System.out.println("------------------------------");
		System.out.println(Thread.currentThread().getName() + " loaded 1 container");
		System.out.println("Total containers in warehouse: " + containersCurrentQty + " of " + WAREHOUSE_CAPACITY);
		notify();
	}
}