package main;

public class CardGame {

	boolean run;
	Card c;
	
	public CardGame() {
		c = new Card();
		run = true;
	}
	public static void main(String[] args) {
		CardGame cg = new CardGame();
		cg.run();
	}
	public void run(){
		c.CreateQandA();
	}
	
}
