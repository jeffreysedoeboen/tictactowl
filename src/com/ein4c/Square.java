package com.ein4c;

public class Square {
	private int x;
	private int y;
	private Symbol symbol = null;
	
	public Square(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setSymbol(Symbol symbol){
		this.symbol = symbol;
	}
	
	public Symbol getSymbol(){
		return symbol;
	}

}
