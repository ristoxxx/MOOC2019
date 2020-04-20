import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import tietokantaJDBC.Paaohjelma;

class lempinimetTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	//Is the result for first day of the year number 1
	public void eka() {
		String x = lempinimet.tulostaNimi("matti");
		assertEquals("matti", x);
	}

}
