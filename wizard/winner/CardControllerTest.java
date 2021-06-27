package swt.wizard.winner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;


class CardControllerTest {
	
	CardController cc;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void determineWinnerTest() {
		GameTable t = mock(GameTable.class);
		
		when(t.getCardSlot1Value()).thenReturn(2);
		when(t.getCardSlot2Value()).thenReturn(13);
		when(t.getCardSlot3Value()).thenReturn(8);
		
		cc = new CardController(t);
		
		assertEquals("Player 2", cc.determineWinner());
		
	}

}
