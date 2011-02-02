package com.ein4c;

import java.util.ArrayList;

import android.app.Activity;

public class Game extends Activity{
	private int activeUser = 1; 
	private ArrayList<Square> field = new ArrayList<Square>();
	private ArrayList<Player> players = new ArrayList<Player>();

	public Game(int numberOnARow, int fieldWidth, int fieldHeigth, Symbol player1symbol, Symbol player2symbol){
		for (int x = 0; x < fieldWidth; x++){
			for (int y=0; y < fieldHeigth; y++){
				Square square = new Square(x,y);
				field.add(square);
			}
		}
		players.add(new Player(1, player1symbol));
		players.add(new Player(2, player2symbol));
	}
	
	public void squareClicked(int x,int y){
		Square square = null;
		for (Square s : field){
			if (s.getX() == x && s.getY() == y){
				square = s;
			}
		}
		if (square.getSymbol() == null){
			Player player = players.get(activeUser);
			square.setSymbol(player.get_symbol());
		}
	}
}
