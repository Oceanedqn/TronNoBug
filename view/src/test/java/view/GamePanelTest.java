/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package view;

import org.junit.Before;
import org.junit.Test;

/**
 * The Class GamePanelTest.
 */
public class GamePanelTest {

	/** The chrono. */
	private Chrono chrono;

	/** The test chrono. */
	String testChrono;

	/**
	 * Requis.
	 */
	@Before
	public void requis() {
		chrono = new Chrono();
	}

	/**
	 * Test get chrono timer.
	 */
	@Test
	public void testGetChronoTimer() {
		testChrono = chrono.getStr();
		equals(testChrono = this.chrono.getStr());
	}

}
