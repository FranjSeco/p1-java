package control;


import services.SuperServices;
/**
*
* @author Grupo2
*/
import gui.Menu;
import utilities.Datos;

public class PlatformGames {	
	private SuperServices services = new SuperServices();
	public void startPlatform() {
		
		boolean seguir = true;
		do {
			Menu.showMenu();
			seguir = this.mainMenu();
		} while (seguir);
		System.out.println("   --- Plataforma cerrada ---");
	}

	public boolean mainMenu() {
		boolean continuar = true;
		try {
			switch (Datos.recogeInt()) {
			case 1:
				System.out.println();	
				System.out.println("Has elegido la opcion 1.");	
				System.out.println();	
				//mostar lista todos los juegos
				
				services.ListarProductos();
				break;
				
			case 2:
				//Añadir producto
				System.out.println();	
				System.out.println("Has elegido la opcion 2.");	
				System.out.println();	
				services.AddProducto();
				System.out.println();	
				System.out.println("Has dado de alta un juego nuevo.");
				System.out.println();	
				break;
			case 3:
				//filtro genero
				System.out.println();	
				System.out.println("Has elegido la opcion 3.");	
				System.out.println();	
				services.filterGenre();
				break;
			case 0:
                continuar = salir();
                break;
			}

		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		return continuar;
	}
	private boolean salir() throws Exception {
        String sino = Datos.recogeString("   ¿Estas seguro?(S/N)");
        return (sino.toUpperCase().charAt(0) != 'S');
    }
}
