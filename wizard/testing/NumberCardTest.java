package swt.wizard.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import swt.wizard.testing.Card.ErrorCard;

class NumberCardTest {
	
	Card card;
	Card card2;
	Card card3;

	@BeforeEach
	void setUp() throws Exception {
		card = new NumberCard("Blue13",13,Color.BLUE);
		card3 = new NumberCard("Red2",13,Color.RED);
	}
	
	//eine Zahlenkarte muss immer eine Farbe erhalten, der Farbwert darf niemals "NONE" sein
	@Test
	@DisplayName("Zahlenkarte darf nicht farblos sein!")
	void testNumberCard() {
		org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {card2 = new NumberCard("Red2",2,Color.NONE);});
	}

	@Test
	void getName() {
		assertEquals("Blue13", card.getName());
	}

	@Test
	void getValueTest() {
		assertEquals(13, card.getValue());
	}

	@Test
	void getColorTest() {
		assertEquals(Color.BLUE, card.getColor());
	}
	
	@Test 
	void checkNameTest() {
		assertEquals(false, card3.checkName());
		assertEquals(true,card.checkName());
	}
	
	@Test
	void CheckValidityTest_ExceptionExpected() {
		Throwable thrown = assertThrows(ErrorCard.class, () -> card3.checkValidity());
	    assertEquals("Kartenname und Kartenwert stimmen nicht überein!", thrown.getMessage());
	}
	
	@Test
	void CheckValidityTest_ExceptionExpected_Again() {
		assertThrows(ErrorCard.class, () -> card3.checkValidity());
	}
	
	@Test
	void CheckValidityTest_NoException() throws ErrorCard {
		assertEquals(true,card.checkValidity());
	}
	
	


}
