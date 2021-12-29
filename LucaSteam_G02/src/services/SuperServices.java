package services;

import gui.Menu;
import utilities.Datos;
import data.DataStock;
/**
*
* @author Grupo2
*/
public class SuperServices {
	private DataStock listaJuegos = new DataStock();

	public void filterGenre() {
		Menu.showGenre(listaJuegos.getGenre());
		String desiredGenre = "";
		try {
			String[] genreList = listaJuegos.getGenre().toArray(new String[listaJuegos.getGenre().size()]);
			int position = Datos.recogeInt();
			desiredGenre = genreList[position];
			// System.out.println(desiredGenre);
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}

		listaJuegos.filterGenre(desiredGenre);
	}
}
