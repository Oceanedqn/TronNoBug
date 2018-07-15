package view;

import org.junit.Before;
import org.junit.Test;

public class GamePanelTest {



	/** The chrono. */
	private Chrono chrono;
	
	String testChrono;

	@Before
	public void requis() {
		 chrono = new Chrono();
	}




	@Test
	public void testGetChronoTimer() {
		testChrono = chrono.getStr();
		equals(testChrono = this.chrono.getStr());
	}




}
