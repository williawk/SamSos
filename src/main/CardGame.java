package main;

import java.io.IOException;
import java.util.ArrayList;

public class CardGame {
	public ArrayList<Player> players;
	public Deck deck;
	public ArrayList<Board> boards = new ArrayList<Board>();
	
	public CardGame(ArrayList<Player> players) throws IOException {
		this.players = players;
		int numberOfPlayers = players.size();
		System.out.println("Number OF Payers:" + numberOfPlayers);
		deck = new Deck("decks/testDeck.txt", numberOfPlayers);
		
		for(int i= 0; i<numberOfPlayers; i ++){
			deck.setDivideDeck(numberOfPlayers);
			ArrayList<Card> pDeck = deck.getDividedDeck().get(i);
			Player player = players.get(i);
			
			Board board = new Board(pDeck, player);
			boards.add(board);			
		}

	}
	public static void main(String[] args) throws IOException {
		
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("Knut1", 23, "Knusan1"));
		players.add(new Player("Knut2", 23, "Knusan2"));
		
		CardGame cg = new CardGame(players);
		cg.run();
	}
	public void run(){
		
	}
	
}
