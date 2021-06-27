package swt.wizard.winner;

import swt.wizard.winner.Card;

public class GameTable {
	
	public Card cardSlot1;
	public Card cardSlot2;
	public Card cardSlot3;
	

	public GameTable() {
	}

	public void setCardInSlot1(Card card) {
		this.cardSlot1 = card;
	}
	
	public void setCardInSlot2(Card card) {
		this.cardSlot2 = card;
	}
	
	public void setCardInSlot3(Card card) {
		this.cardSlot3 = card;
	}
	
	public int getCardSlot1Value() {
		return cardSlot1.getValue();
	}
	
	public int getCardSlot2Value() {
		return cardSlot2.getValue();
	}
	
	public int getCardSlot3Value() {
		return cardSlot3.getValue();
	}
	
}
