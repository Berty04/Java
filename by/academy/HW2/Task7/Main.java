package by.academy.HW2.Task7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int numberOfPlayers = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number of players: ");
		numberOfPlayers = sc.nextInt();
		sc.close();
		
		if (numberOfPlayers > 0 && numberOfPlayers <= 10) {
			Deal deal = new Deal(numberOfPlayers);
			deal.formationCardDeck();
			System.out.println(deal);
		} else {
			System.out.println("Game impossible !!!");
		}
	}
}
