package main;

import java.awt.List;
import java.util.ArrayList;

public class Board {
	public ArrayList<Card> deck = new ArrayList<Card>();
	public Player player;
	
	
	public Board(ArrayList deck, Player player){
		this.deck = deck;
		this.player = player;
		
		
	}
	
	

}
