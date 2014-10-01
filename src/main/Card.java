package main;

public class Card {
	//Knut klasdlasdlakslkdl 
	private final int cardNumber;
	private final String textField;
	
	
	public Card(int cardNumber, String textField){
		this.cardNumber = cardNumber;
		this.textField = textField;
	}
	
	public String getText(){
		return this.textField;
	}
	
	public int getCardNumber(){
		return this.cardNumber;
	}	
}
