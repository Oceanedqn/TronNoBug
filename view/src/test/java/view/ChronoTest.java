/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The Class ChronoTest.
 */
public class ChronoTest {

	/** The str. */
	private String str = "0";

	/** The test str. */
	private String testStr;

	/**
	 * Test get str.
	 */
	@Test
	public void testGetStr() {
		testStr = "2";
		this.str = "2";

		assertEquals(testStr, this.str);
	}

}
