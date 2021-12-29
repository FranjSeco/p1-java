package control;


import services.SuperServices;
/**
*
* @author Grupo2
*/
import gui.Menu;
import utilities.Datos;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlatformGames {	
	private SuperServices services = new SuperServices();
	private static final Logger logger = LogManager.getLogger("Mensaje");
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
				logger.info("Se ha accedido al caso 1");
				System.out.println();	
				System.out.println("Has elegido la opcion 1.");	
				System.out.println();	
				//mostar lista todos los juegos
				
				services.ListarProductos();
				break;
				
			case 2:
				//Añadir producto
				logger.info("Se ha accedido al caso 2");
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
				logger.info("Se ha accedido al caso 3");
				System.out.println();	
				System.out.println("Has elegido la opcion 3.");	
				System.out.println();	
				services.filterGenre();
				break;
			case 4:
				logger.info("Se ha accedido al caso 4");
				//filtro editor
				System.out.println();	
				System.out.println("Has elegido la opcion 4.");	
				System.out.println();	
				services.filterPublisher();
				
				break;
				

			case 5:
				//filtro por año
				logger.info("Se ha accedido al caso 5");
				System.out.println();	
				System.out.println("Has elegido la opcion 5.");	
				System.out.println();	
				services.filterYear();
				break;

			case 0:
				logger.info("Se ha accedido a la salida del sistema");
                continuar = salir();
                break;
			}

		} catch (Exception e) {
			logger.warn("Se ha roto algo"+ e.toString());
			System.out.println("error: " + e.toString());
		}
		return continuar;
	}
	private boolean salir() throws Exception {
        String sino = Datos.recogeString("   ¿Estas seguro?(S/N)");
        return (sino.toUpperCase().charAt(0) != 'S');
    }
}
