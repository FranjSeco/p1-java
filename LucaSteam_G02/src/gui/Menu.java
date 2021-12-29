package gui;

import java.util.Set;
/**
*
* @author Grupo2
*/
public class Menu {
	private static int contador = 0;

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		Menu.contador = contador;
	}

	public static void showMenu() {
		System.out.println("---------------------------------");
		System.out.println("           LUCASTEAM             ");
		System.out.println("---------------------------------");
		System.out.println("");
		System.out.println("     ¿Qué desea hacer?");
		System.out.println("       1.Consultar lista de todos los juegos  ");
		System.out.println("       3.Filtrar la lista de juegos por genero  ");
	}

	public static void showGenre(Set<String> p) {
		System.out.println("---------------------------------");
		System.out.println("          FILTRO GÉNEROS         ");
		System.out.println("---------------------------------");
		System.out.println("    ¿Qué genero desea?           ");

		p.forEach(Genre -> {
			System.out.println("       " + contador + "." + Genre + "       ");
			contador++;

		});

	}
}
