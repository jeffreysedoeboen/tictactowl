package com.ein4c;

public class Player {
	private int 	number 		  = 0;
	private Symbol 	symbol 		  = null;
	private int 	wins   		  = 0;
	private boolean won_last_game = false;
	
	
	public Player( int number, Symbol symbol ) {
		this.number = number;
		this.symbol = symbol;
	}
	
	public Symbol get_symbol() {
		return symbol;
	}

	public int get_number() {
		return number;
	}

	public void set_number( int number  ) {
		this.number = number;
	}

	public int get_wins() {
		return wins;
	}

	public void set_wins(int wins) {
		this.wins = wins;
	}

	public boolean won_last_game() {
		return won_last_game;
	}

	public void set_won_last_game( boolean won_last_game ) {
		this.won_last_game = won_last_game;
	}

	public void set_symbol( Symbol symbol ) {
		this.symbol = symbol;
	}
}
