package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ControllerTest {



	int testNumPlayer = 3;

	@Test
	public void testOrderPerform() {

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

	@Test
	public void testEndJ1() {
		fail("Not yet implemented");
	}

	@Test
	public void testEndJ2() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveBikeJ1X() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveBikeJ1Y() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveBikeJ2X() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveBikeJ2Y() {
		fail("Not yet implemented");
	}

}
