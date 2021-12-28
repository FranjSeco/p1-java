package model;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModelTesting {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCreateGame() {
		//Given
		Game a=new Game("Apex","Shooter","PC","EA",1998);
		
		//When 
		Game b=new Game().createGame();
		
		//Then
		
		assertEquals(a,b);
	}

}
