package data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
		//Añado el juego al mapa con clave
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
		//Intentamos añadir un juego con la misma clave que otro existente
		juegos.put(1, juego1);
		int codigoJuego2=1;
		
		//Then
		assertEquals(AddProducto(codigoJuego2,juego2),false);
		
	}

}
