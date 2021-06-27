package swt.testing.tdd;

public class HonorarRechner {
	
	public static Double zeichenPreis = 1.0;
	public static Double leerzeichenPreis = 0.1;
	
	public static Double ermittleHonorar(String text) {
		
		Double result = 0.0;
		
		if (text == null) {
			throw new IllegalArgumentException("Inhalt darf nicht NULL sein!");
		}
		
		if (!text.equals("")) {
			int zeichenAnzahl = text.length();
			System.out.println("zeichenAnzahl: " + zeichenAnzahl);
			int zeichenAnzahlOhneLeerzeichen = text.replace(" ","").length();
			System.out.println("zeichenAnzahlOhneLeerzeichen: " + zeichenAnzahlOhneLeerzeichen);
			
			result = (zeichenAnzahlOhneLeerzeichen * zeichenPreis) + ((zeichenAnzahl - zeichenAnzahlOhneLeerzeichen) * leerzeichenPreis);
		}
		
		System.out.println("Result: " + result);
		return result;
	}

}
