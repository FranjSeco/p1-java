package control;


import java.util.Map;

import data.DataStock;
import model.Game;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		
		Map<Integer, Game> j=new DataStock().ReadData();
		System.out.println(j.get(16590).getGenre());

		//new PlatformGames().startPlatform();



	}

}
