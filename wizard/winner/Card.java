package swt.wizard.winner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Card {

	final private String name;
	final private int value;
	final private Color cardColor;
	
	 /**Vereinbarung einer eigenen Ausnahmeklasse als innere Klasse */
		static class ErrorCard extends Exception {
	    	// static notwendig, weil diese Klasse von der
	    	// static Klasse Einlesen benutzt wird
	    	public ErrorCard(String s) {
	        	super(s);
	    	}
		}
		
		public Card(String nam, int val, Color col) {
			
			this.name = nam;
			this.value = val;
			this.cardColor = col;
		
		}
		
	/**
	 * Diese Methode prüft, ob der Name der Karte valide ist. 
	 * Der Zahlenwert im Namen sowie der angegebene Kartenwert müssen gleich sein!
	 * 
	 * @param nam
	 * @param val
	 * @param col
	 * @return boolean
	 */
	public boolean checkName() {
		boolean result = false;
		
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(this.getName());

		//falls Match erfolgreich
		if (m.find()) {
			//wird der Zahlenwert aus dem Namen mit dem vergebenen Kartenwert verglichen
			if (Integer.parseInt(m.group()) == this.getValue()) {
				result = true;
			}
		}
		
		return result;
	}
	
	/**
	 * Prüft, ob das Kartenobjekt gewissen Bedingungen entspricht.
	 * Wenn Bedingungen nicht erfüllt sind, werden entsprechende Exceptions geworfen.
	 * 
	 * @return = true, nur wenn keine Exception aufgetreten ist
	 * @throws ErrorCard
	 */
	public boolean checkValidity() throws ErrorCard {
		if (!this.checkName()) throw new ErrorCard("Kartenname und Kartenwert stimmen nicht überein!");
		
		return true;
	}

	public String getName() {
		return this.name;
	}

	public int getValue() {
		return this.value;
	}

	public Color getColor() {
		return this.cardColor;
	}

	public static void main(String[] args) throws ErrorCard {
		// TODO Auto-generated method stub
		Card card1 = new Card("Test", 0, Color.BLUE);
		Card card2 = new Card("Red2",2,Color.RED);
		card1.checkValidity();

	}

}
