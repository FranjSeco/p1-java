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
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		listaJuegos.filterGenre(desiredGenre);
	}

	public void filterPublisher() {
		Menu.showPublisher(listaJuegos.getPublisher());
		String desiredPublisher = "";
		try {
			String[] publishList = listaJuegos.getPublisher().toArray(new String[listaJuegos.getPublisher().size()]);
			int position = Datos.recogeInt();
			desiredPublisher = publishList[position];
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		listaJuegos.filterPublisher(desiredPublisher);
	}
	
	public void filterYear() {
		Menu.showYear();
		int caso=0;
		
		try {
			caso = Datos.recogeInt();
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		listaJuegos.filterYear(caso);
	}
  	public void AddProducto() {
		listaJuegos.AddProducto();
		
	}	
	public void ListarProductos() {
		listaJuegos.ListarProductos();
  }

}
