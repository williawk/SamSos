package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Deck {
	
	public ArrayList<Card> deck = new ArrayList<Card>();
	public ArrayList<ArrayList<Card>> dividedDeck = new ArrayList<ArrayList<Card>>();
	public ArrayList<ArrayList<Integer>> pairList = new ArrayList<ArrayList<Integer>>();
	
	
	public Deck(String file) throws IOException{
		Card card;
		int deckLength = 0;
		
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
		System.out.println(pairList.toString());
		
		for(int i = 1; i < deckLength+1; i++){
			line = reader.readLine();
			card = new Card(i, line);
			deck.add(card);
			
		}
		reader.close();
		divideDeck();
	}
	
	public void divideDeck(){
		ArrayList<Card> p1Deck = new ArrayList<Card>();
		ArrayList<Card> p2Deck = new ArrayList<Card>();
		int deckSize = deck.size();
		
		for(int i = 0; i < deckSize; i++){
			int k = (int) (Math.random()*deck.size());
			if(i%2 == 0){
				p1Deck.add(deck.remove(k));
			}
			else{
				p2Deck.add(deck.remove(k));
			}
			
		}
		dividedDeck.add(p1Deck);
		dividedDeck.add(p2Deck);
		
		System.out.println(p1Deck.toString());
		System.out.println(p2Deck.toString());
		
	}
}

