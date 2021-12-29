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
	private Set<String> uniquePublish = new HashSet<>();

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
			System.out.println("Error, no se puede anadir el juego");
			return false;

		} else {
			gameStock.put(codigo, g);
			return true;
		}
	}
	public void ListarProductos() {
		System.out.println();	
		System.out.println("Los 100 primeros numeros:");	
		System.out.println();	
		for(int i=1;i<100;i++) {
		System.out.println(gameStock.get(i));	
		}

	}
	public Map<Integer, Game> ReadData() {


		String fileName = "C:/Users/claud/git/p1-java/LucaSteam_G02/archivoFinal2.csv";

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
		System.out.println();	
		System.out.println("Esta es la lista filtrada en base al genero "+ genre +" : ");	
		System.out.println();	
		for (int i = 0; i < gameStock.size(); i++) {
			if (gameStock.get(i).getGenre().equalsIgnoreCase(genre)) {
				System.out.println(gameStock.get(i));
			}
		}
		
		System.out.println();	
		System.out.println("Fin de la lista filtrada en base al genero "+ genre +".");	
		System.out.println();	
	}
	//Aqui hacemos el filtro del publisher
	public Set<String> getPublisher(){
		int gameCount = gameStock.size();
		for (int i = 1; i < gameCount; i++) {
			uniquePublish.add(gameStock.get(i).getPublisher());
		}
		return uniquePublish;
	}
	public void filterPublisher(String publisher) {
		System.out.println();	
		System.out.println("Esta es la lista filtrada en base al editor "+ publisher +" : ");	
		System.out.println();	
		for (int i = 0; i < gameStock.size(); i++) {
			if (gameStock.get(i).getPublisher().equalsIgnoreCase(publisher)) {
				System.out.println(gameStock.get(i));
			}
		}
		
		System.out.println();	
		System.out.println("Fin de la lista filtrada en base al editor "+ publisher +".");	
		System.out.println();	
	}
}
