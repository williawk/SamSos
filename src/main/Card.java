package main;

import java.util.Scanner;

public class Card {
	
	int CardNumber; //Hvordan faa denne til aa settes automatisk? 
	String Q;
	String A;
	
	public void CreateQandA(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Question");
		String Q = sc.nextLine();
		System.out.println("Answer");
		String A = sc.nextLine();
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
