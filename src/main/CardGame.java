package main;

import java.io.IOException;

public class CardGame {

	boolean run;
	Deck deck;
	
	public CardGame() throws IOException {
		deck = new Deck("decks/testDeck.txt");

		run = true;
	}
	public static void main(String[] args) throws IOException {
		CardGame cg = new CardGame();
		cg.run();
	}
	public void run(){
		
	}
	
}
