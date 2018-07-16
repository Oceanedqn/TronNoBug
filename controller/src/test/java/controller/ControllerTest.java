/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mock.IControllerTest;

/**
 * The Class ControllerTest.
 */
public class ControllerTest {

	/** The test num player. */
	int testNumPlayer = 3;
	int numPlayer = this.controller.orderPerform(3);
	private IControllerTest controller;

	/**
	 * Test order perform.
	 */
	@Test
	public void testOrderPerform() {

		if (testNumPlayer == 3) {

			assertEquals(testNumPlayer, numPlayer);
		}

		else if (testNumPlayer == 2) {

			assertEquals(testNumPlayer, numPlayer);
		}

		else if (testNumPlayer == 1) {

			assertEquals(testNumPlayer, numPlayer);
		}

	}

	/**
	 * Test action perform.
	 */
	@Test
	public void testActionPerform() {
		if (testNumPlayer == 3) {
			int numPlayer = 3;

			assertEquals(testNumPlayer, numPlayer);
		}

		else if (testNumPlayer == 2) {
			int numPlayer = 2;

			assertEquals(testNumPlayer, numPlayer);
		}

		else if (testNumPlayer == 1) {
			int numPlayer = 1;

			assertEquals(testNumPlayer, numPlayer);
		}

		else if (testNumPlayer == 4) {
			int numPlayer = 4;

			assertEquals(testNumPlayer, numPlayer);
		}
	}

}
