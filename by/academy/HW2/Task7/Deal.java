package by.academy.HW2.Task7;

import java.util.Random;

public class Deal {
	private int players;
	private String[] suits = {"Peaks", "Clubs", "Diamonds", "Hearts"};
	private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Qween", "King", "Ace"};
	private String[] cardDeck = new String[suits.length * ranks.length];
	
	public int getPlayers() {
		return players;
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	public Deal(int players) {
		super();
		this.players = players;
	}

	public Deal() {
		super();
	}
	
	public void formationCardDeck() {
		Random random = new Random();
		for(int i = 0; i < ranks.length; i++) {
			for(int j = 0; j < suits.length; j++) {
				cardDeck[i * suits.length + j] = ranks[i] + " " + suits[j];
			}
		}
				
		for(int i = 0; i < ranks.length * suits.length; i++) {
			int j = random.nextInt(52);
			String temp = cardDeck[j];
			cardDeck[j] = cardDeck[i];
			cardDeck[i] = temp;
		}
	}

	@Override
	public String toString() {
		int cardsPerPlayer = 5;
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < players; i++) {
			for(int j = 0; j < 5; j++) {
				builder.append(cardDeck[i * cardsPerPlayer +j]);
				if (j != 4) {
					builder.append("; ");
				}
			}
			builder.append("\n\n");
		}
		return builder.toString();
	}
}
