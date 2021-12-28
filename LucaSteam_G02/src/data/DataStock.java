package data;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

import model.Game;



public  class DataStock {
	
	
	
/*private Map<Integer, Game> gameStock;
	
	public DataStock() {
		gameStock = new HashMap<>();
	}
	
	public Map<Integer, Game> getGameStock(){
		return gameStock;
	}
	
	public void setGameStock(Map<Integer, Game> gameStock) {
		this.gameStock = gameStock;
	}
	*/
	
	
	public static void ReadData() {
		
		
		
		
		String fileName = "/Users/bubbahula/git/p1-java/LucaSteam_G02/vgsales.csv";
		
		List<Game> gamesList;
		
			try {
				gamesList = new CsvToBeanBuilder(new FileReader(fileName))
				        .withType(Game.class)
				        .build()
				        .parse();
				
				 gamesList.forEach(System.out::println);
				 
				 
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Error");
			}
			
			
			
			
			 
		
	
		
	}

	
	
	
}
	
	