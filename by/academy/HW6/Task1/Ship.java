package by.academy.HW6.Task1;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Ship extends Thread {
	private final int SHIP_MAX_CAPACITY = 40;
	private final int TERMINALS_QTY = 4;

	private Warehouse warehouse;
	private String shipNumber;

	private static boolean[] TERMINALS_FLAG = null;
	private static Semaphore SEMAPHORE = null;

	public Ship(Warehouse warehouse, String shipNumber) {
		super(shipNumber);
		this.warehouse = warehouse;
		this.shipNumber = shipNumber;
		start();
	}

	@Override
	public void run() {
		Random random = new Random();
		int containersQtyOnShip = random.nextInt(SHIP_MAX_CAPACITY + 1);

		TERMINALS_FLAG = new boolean[TERMINALS_QTY];
		for (int i = 0; i < TERMINALS_QTY; i++) {
			TERMINALS_FLAG[i] = true;
		}
		SEMAPHORE = new Semaphore(TERMINALS_FLAG.length, true);

		System.out
				.println("!!! " + shipNumber + " arrived with " + containersQtyOnShip + " containers on the board !!!");

		try {
			SEMAPHORE.acquire();
			System.err.println(shipNumber + " requests free Terminal");
			int controlNum = -1;
			synchronized (TERMINALS_FLAG) {
				for (int i = 0; i < TERMINALS_QTY; i++)
					if (TERMINALS_FLAG[i]) {
						TERMINALS_FLAG[i] = false;
						controlNum = i;
						System.err.println(shipNumber + " docked at Terminal " + (i + 1));
						break;
					}
			}
			if (containersQtyOnShip > 0) {
				for (int i = 1; i <= containersQtyOnShip; i++) {
					warehouse.putToWarehouse();
				}
			} else {
				for (int i = 1; i <= 10; i++) {
					warehouse.getFromWarehouse();
				}
			}
			synchronized (TERMINALS_FLAG) {
				if(controlNum >= 0) {
					TERMINALS_FLAG[controlNum] = true;
				}
			}
			SEMAPHORE.release();
			System.err.println(shipNumber + " undocked from Terminal " + (controlNum + 1));
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
	}
}