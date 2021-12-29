package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
//import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import model.Game;

//import model.Game;

public class DataStock {
	

	private Map<Integer, Game> gameStock;
	private  Set<String> uniqueGenre=new HashSet<>();
	
	
	public DataStock() {
		gameStock = new HashMap<>();
		ReadData();
	}

	public Map<Integer, Game> getGameStock() {
		return gameStock;
	}

	public void setGameStock(Map<Integer, Game> gameStock) {
		this.gameStock = gameStock;
	}
	public void AddProducto(int codigo, Game p) {
		if (gameStock.containsKey(codigo)) {
			System.out.println("Error, no se puede a�adir el juego");

		} else {
			gameStock.put(codigo, p);

		}

	}


	public Map<Integer, Game> ReadData() {

		String fileName = "C:\\Users\\alumno\\git\\p1-java\\LucaSteam_G02\\src\\data\\archivoFinal2.csv";
		List<String[]> r;
		try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
			r = reader.readAll();
			int listIndex = 0;
			for (String[] arrays : r) {
				//System.out.println("\nString[" +  + "] : " + Arrays.toString(arrays));
				Game a = new Game(arrays[0], arrays[1], arrays[2], arrays[3], arrays[4]);
				//System.out.println(a.getName());
				this.AddProducto(listIndex, a);
				listIndex++;
			}
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CsvException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gameStock;

	}
	public Set<String> getGenre(){
		int gameCount=gameStock.size();
		System.out.println(gameStock.get(1));
		for (int i=1;i<gameCount;i++) {
			//System.out.println(gameStock.get(i).getGenre());
			uniqueGenre.add(gameStock.get(i).getGenre());
		}
		System.out.println(uniqueGenre);
		return uniqueGenre;
		
	}
}
