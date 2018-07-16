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

	private GamePanel game;

	/** The test chrono. */
	String testChrono;

	private String finalTime;

	/**
	 * Requis.
	 */
	@Before
	public void requis() {
		chrono = new Chrono();
		game = new GamePanel();
	}

	/**
	 * Test get chrono timer.
	 */
	@Test
	public void testGetChronoTimer() {
		testChrono = chrono.getStr();

		equals(testChrono = this.chrono.getFinalTime());
	}

	@Test
	public void testgetFinalTime() {
		testChrono = chrono.getStr();
		finalTime = game.getFinalTime();

		equals(testChrono = finalTime);

	}

}
