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
				//mostrr lista todos los juegos
				services.ListarProductos();
				break;
				
			case 2:
				//A�adir producto
				services.AddProducto();
				System.out.println("Has dado de alta un juego nuevo.");
          break;

				
			case 3:
				//filtro genero
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
        String sino = Datos.recogeString("   �Esta seguro?(S/N)");
        return (sino.toUpperCase().charAt(0) != 'S');
    }
}
