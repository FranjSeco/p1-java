package control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMenu {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMainMenu() {
		//Given 
		boolean a=new PlatformGames().mainMenu();
		
		//When
		//Elegimos la opción uno del menu
		boolean b=true;
		
		//Then
		assertEquals(a,b);
	}
	@Test
	void testMainMenuSalida() {
		//Given
		boolean a=new PlatformGames().mainMenu();
		
		//When
		//Elegimos la opción cero o salida del menu
		boolean b=false;
		
		//Then
		assertEquals(a,b);
	}

}
