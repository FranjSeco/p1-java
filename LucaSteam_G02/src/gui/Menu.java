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
		System.out.println("     �Que desea hacer?");
		System.out.println("       1.Consultar lista de todos los juegos  ");
		System.out.println("       2.Dar de alta un nuevo juego   ");
		System.out.println("       3.Filtrar la lista de juegos por genero  ");
		System.out.println("       4.Filtrar la lista de juegos por distribuidor  ");
		System.out.println("       5.Filtrar la lista de juegos por año  ");
		System.out.println("       0.Salir de la plataforma  ");
		System.out.println(" ");
        System.out.print(">> ");
	}

	public static void showGenre(Set<String> p) {
		System.out.println("---------------------------------");
		System.out.println("          FILTRO GENEROS         ");
		System.out.println("---------------------------------");
		System.out.println("    ¿Qué genero desea?           ");

		p.forEach(Genre -> {
			System.out.println("       " + contador + "." + Genre + "       ");
			contador++;

		});
		System.out.println(" ");
        System.out.print(">> ");

	}

	public static void showPublisher(Set<String> q) {
		System.out.println("---------------------------------");
		System.out.println("          FILTRO DISTRIBUIDOR         ");
		System.out.println("---------------------------------");
		System.out.println("    ¿Qué distribuidor desea?           ");

		q.forEach(Publisher -> {
			System.out.println("       " + contador + "." + Publisher + "       ");
			contador++;

		});
    System.out.println(" ");
        System.out.print(">> ");
  }

	public static void showYear() {
		System.out.println("---------------------------------");
		System.out.println("           FILTRO AÑOS            ");
		System.out.println("---------------------------------");
		System.out.println("");
		System.out.println("     ¿Que tipo de consulta desea hacer?     ");
		System.out.println("       0.Consultar juegos de un año específico");
		System.out.println("       1.Consultar juegos del siglo XX   ");
		System.out.println("       2.Consultar juegos lanzados en año par  ");
		System.out.println(" ");
        System.out.print(">> ");
	}
}
