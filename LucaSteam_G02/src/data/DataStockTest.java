package data;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import model.Game;
class DataStockTest {

	@BeforeEach
	void setUp() throws Exception {
		
	juegos.clear();
	}
	Map<Integer,Game> juegos=new HashMap<>();
	Set<String> uniqueGenre=new HashSet<>();
	
	public Set<String> getGenre() {
		int gameCount = juegos.size();
		for (int i = 1; i < gameCount; i++) {
			uniqueGenre.add(juegos.get(i).getGenre());
		}
		return uniqueGenre;}
	
	@Test
	void testFiltroGenero() {
		//Given
		Game juego1=new Game("FIFA16","PS3","2016","Sports","EA");
		Game juego2=new Game("COD","PS3","2015","Shooter","Activision");
		Game juego3=new Game("LoL","PC","2010","Sports","Riot");
		
		//When
		juegos.put(1, juego1);
		juegos.put(2, juego2);
		juegos.put(3, juego3);
		Set<String> comprobador=new HashSet<>();
		comprobador.add(juego1.getGenre());
		comprobador.add(juego2.getGenre());
		
		//Then
		assertEquals(getGenre(),comprobador);
		
	}
	
Set<String> uniquePublisher=new HashSet<>();
	
	public Set<String> getPublisher() {
		int gameCount = juegos.size();
		for (int i = 1; i < gameCount; i++) {
			uniquePublisher.add(juegos.get(i).getPublisher());
		}
		return uniquePublisher;}
	
	
	@Test
	void testFiltroPublisher() {
		//Given
		Game juego1=new Game("FIFA16","PS3","2016","Sports","EA");
		Game juego2=new Game("COD","PS3","2015","Shooter","Activision");
		Game juego3=new Game("LoL","PC","2010","Sports","Riot");
		
		//When
		juegos.put(1, juego1);
		juegos.put(2, juego2);
		juegos.put(3, juego3);
		Set<String> comprobador=new HashSet<>();
		comprobador.add(juego1.getPublisher());
		comprobador.add(juego2.getPublisher());
		
		//Then
		assertEquals(getPublisher(),comprobador);
		
	}
	public boolean AddProducto(int codigo, Game g) {

		if (juegos.containsKey(codigo)) {
			System.out.println("Error, no se puede anadir el juego");
			return false;

		} else {
			juegos.put(codigo, g);
			return true;
		}
	}
	
	@Test
	void testAddProducto() {
		//Given
		Game juego1=new Game("FIFA16","PS3","2016","Sports","EA");
		//when
		//A�ado el juego al mapa con clave
		int codigo=1;
		
		//Then
		assertEquals(AddProducto(codigo,juego1),true);
		
	}
	
	@Test
	void testAddExistingProduct() {
		//Given
		Game juego1=new Game("FIFA16","PS3","2016","Sports","EA");
		Game juego2=new Game("COD","PS3","2015","Shooter","Activision");
		//When 
		//Intentamos a�adir un juego con la misma clave que otro existente
		juegos.put(1, juego1);
		int codigoJuego2=1;
		
		//Then
		assertEquals(AddProducto(codigoJuego2,juego2),false);
		
	}
	/*public Map<Integer, Game> ReadData() {


		String fileName = "./archivoFinal2.csv";

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

		return juegos;

	}
	
	@Test
	void testReadData() {
		//Given
		//un archivo de texto
		
		//When
		//Le paso ese archivo al metodo ReadData
		Map<Integer,Game> pepito=new HashMap<>();
		Game juego1=new Game("FIFA16","PS3","2016","Sports","EA");
		Game juego2=new Game("COD","PS3","2015","Shooter","Activision");
		Game juego3=new Game("LoL","PC","2010","Sports","Riot");
		pepito.put(0,juego1);
		//Then
		//Aseg�rame que el m�todo crea el mapa igual que si lo creo yo a mano
		assertEquals(ReadData(),pepito);
	}*/
	


}
