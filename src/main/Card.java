package main;

import java.util.Scanner;

public class Card {
	
	int CardNumber; //Hvordan faa denne til aa settes automatisk? 
	String Q;
	String A;
	
	public void CreateQandA(){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Question");
		String Q = sc1.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Answer");
		String A = sc2.next();
	}
	
	public String getQuestion(){
		return this.Q;
	}
	
	public String getAnswer(){
		return this.A;
	}
	
	public int cardNumber(){
		return this.CardNumber;
	}
	
}
