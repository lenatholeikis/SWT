package swt.testing.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HonorarRechnerTest {
	
	String text;
	String text2;
	String text3;

	@BeforeEach
	void setUp() throws Exception {
		
		//Lorem Ipsum mit 200 Wörtern
		//Word sagt: 1.094 Zeichen mit Leerzeichen, 913 Zeichen ohne Leerzeichen (also 181 Leerzeichen)
		text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor"
				+ " et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est "
				+ "Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed "
				+ "diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam "
				+ "voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd "
				+ "gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor "
				+ "sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore "
				+ "et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo "
				+ "dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem "
				+ "ipsum dolor sit amet. "
				+ "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, "
				+ "vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio "
				+ "dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait "
				+ "nulla facilisi. Lorem ipsum dolor sit amet,";
		
		text2 = "";
	}

	@Test
	void ermittleHonorarTest() {
		//assertEquals - String wird reingegeben, € soll rausgegeben werden
		//also String rein, Währung raus - pro tatsächlichem Zeichen 1€, Leerzeichen = 0.1 € 
		assertEquals(931.1, HonorarRechner.ermittleHonorar(text));
	}
	
	@Test 
	void ermittleHonorarAufLeertext() {
		assertEquals(0.0, HonorarRechner.ermittleHonorar(text2));
	}
	
	@Test 
	void pruefeHonorarAufNull() {
		assertThrows(IllegalArgumentException.class, () -> HonorarRechner.ermittleHonorar(text3));
	}
	


}
