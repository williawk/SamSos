package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableCellRenderer;

public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	private ArrayList<ArrayList<Card>> dividedDeck = new ArrayList<ArrayList<Card>>();
	private ArrayList<ArrayList<Integer>> pairList = new ArrayList<ArrayList<Integer>>();
	
	
	public Deck(String file, int numberOfPlayers) throws IOException{
		Card card;
		int deckLength;
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		
		deckLength = Integer.parseInt(reader.readLine());
		
		ArrayList<Integer> pL = new ArrayList<Integer>();
		
		for(int i = 1; i < deckLength+1; i ++){
			pL.add(Integer.parseInt(reader.readLine()));
			if(i%2 == 0){
				pairList.add(pL);
				pL = new ArrayList<Integer>();
			}
		}
		
		for(int i = 1; i < deckLength+1; i++){
			line = reader.readLine();
			card = new Card(i, line);
			cards.add(card);
			
		}
		reader.close();
	}
	
	public void setDivideDeck(int numberOfPlayers){
		int deckSize = cards.size();
		int dividedDeckSize = deckSize/numberOfPlayers;
		
		for(int i = 0; i < numberOfPlayers; i++){
			ArrayList<Card> pDeck = new ArrayList<Card>();
			
			for(int j = 0; j < (dividedDeckSize); j ++){
				int k = (int) (Math.random()*cards.size());
				pDeck.add(cards.remove(k));
			}
			dividedDeck.add(pDeck);
		}
	
	}
	public ArrayList<ArrayList<Card>> getDividedDeck(){
		return this.dividedDeck;
	}
}

