package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
//import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import model.Game;

//import model.Game;

public class DataStock {
	

	private static Map<Integer, Game> gameStock;

	public DataStock() {
		gameStock = new HashMap<>();
	}

	public Map<Integer, Game> getGameStock() {
		return gameStock;
	}

	public void setGameStock(Map<Integer, Game> gameStock) {
		DataStock.gameStock = gameStock;
	}
	
	public boolean AddProducto() {
		Game g = new Game();
		g.createGame();
		return AddProducto(g);
	}
	
	public boolean AddProducto(Game g) {
		return AddProducto((int) (Math.random() * 100000), g);
	}
	//static void
	public static boolean AddProducto(int codigo, Game g) {
		if (gameStock.containsKey(codigo)) {
			System.out.println("Error, no se puede a�adir el juego");
			return false;

		} else {
			gameStock.put(codigo, g);
			System.out.println(g);
			return true;
			

		}

	}
	
	public void ListarProductos() {
		//Map<Integer, Game> j=new DataStock().ReadData();
		System.out.println(gameStock);
		
		
		
		
	}
	
	


	public Map<Integer, Game> ReadData() {

		String fileName = "/Users/bubbahula/git/p1-java/LucaSteam_G02/src/data/archivoFinal2.csv";

		// List<Game> gamesList;

		/*
		 * try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
		 * List<String[]> r = reader.readAll(); r.forEach(x ->
		 * System.out.println(Arrays.toString(x)));
		 * 
		 * /*gamesList = new CsvToBeanBuilder(new FileReader(fileName))
		 * .withType(Game.class) .build() .parse();
		 * 
		 * gamesList.forEach(System.out::println);
		 */
		/*
		 * CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); //
		 * custom separator try(CSVReader reader = new CSVReaderBuilder( new
		 * FileReader(fileName)) .withCSVParser(csvParser) // custom CSV parser
		 * .withSkipLines(1) // skip the first line, header info .build()){
		 * List<String[]> r = reader.readAll(); r.forEach(x ->
		 * System.out.println(Arrays.toString(x)));
		 */
		List<String[]> r;
		try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
			r = reader.readAll();
			int listIndex = 0;
			for (String[] arrays : r) {
				//System.out.println("\nString[" +  + "] : " + Arrays.toString(arrays));
				listIndex++;
				Game a = new Game(arrays[0], arrays[1], arrays[2], arrays[3], arrays[4]);
				//System.out.println(a.getName());
				DataStock.AddProducto(listIndex, a);
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

}
