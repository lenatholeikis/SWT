package swt.wizard.winner;

import swt.wizard.testing.Card;
import swt.wizard.testing.Color;

public class CardController {
	
	GameTable table;
	
	public CardController(GameTable t) {
		this.table = t;
	}
	
	/**
	 * Der Spieler mit der höchsten Zahlenkarte gewinnt.
	 */
	public String determineWinner() {
		String winner = "";
		
		String[] strArray = {"Player 1", "Player 2", "Player 3"};
		int[] intArray = {table.getCardSlot1Value(),table.getCardSlot2Value(),table.getCardSlot3Value()};
		
		int max = intArray[0];
		
		for (int counter = 1; counter < strArray.length; counter++) {
			if (intArray[counter] > max) {
				max = intArray[counter];
				winner = strArray[counter];
			}
		}
		
		System.out.println("Gewinner der Runde ist: " + winner);
		
		return winner;
	}
	
	
	public static void main(String[] args) {
		
		CardController cc = new CardController(new GameTable());
		cc.determineWinner();

	}
	
}
