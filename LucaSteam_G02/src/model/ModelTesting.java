package model;

import static org.junit.jupiter.api.Assertions.*;

/**
*
* @author Grupo2
*/
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModelTesting {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCreateGame() {
		// Given
		Game a = new Game("Apex","PC","1998", "Shooter",   "EA");

		// When
		Game b = new Game().createGame();

		// Then

		assertEquals(a, b);
	}

}
