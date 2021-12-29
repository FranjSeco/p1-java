package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import model.Game;

/**
 *
 * @author Grupo2
 */
public class DataStock {

	private Map<Integer, Game> gameStock;
	private Set<String> uniqueGenre = new HashSet<>();

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
	
	public boolean AddProducto() {
		Game g = new Game();
		g.createGame();
		return AddProducto(g);
	}
	
	public boolean AddProducto(Game g) {
		return AddProducto(gameStock.size(), g);
	}

	public boolean AddProducto(int codigo, Game g) {

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


		String fileName = "C:\\Users\\alumno\\git\\p1-java\\LucaSteam_G02\\src\\data\\archivoFinal2.csv";
		List<String[]> r;
		try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
			r = reader.readAll();
			int listIndex = 0;
			for (String[] arrays : r) {
				Game a = new Game(arrays[0], arrays[1], arrays[2], arrays[3], arrays[4]);
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

	public Set<String> getGenre() {
		int gameCount = gameStock.size();
		for (int i = 1; i < gameCount; i++) {
			uniqueGenre.add(gameStock.get(i).getGenre());
		}
		return uniqueGenre;

	}

	public void filterGenre(String genre) {
		for (int i = 0; i < gameStock.size(); i++) {
			if (gameStock.get(i).getGenre().equalsIgnoreCase(genre)) {
				System.out.println(gameStock.get(i));
			}
		}
	}
}
