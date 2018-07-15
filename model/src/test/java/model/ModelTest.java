/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import mock.BikeMock;

/**
 * The Class ModelTest.
 */
public class ModelTest {

	/** The model. */
	Model model;

	/** The bike J 1. */
	BikeMock bikeJ1;

	/** The bike J 2. */
	BikeMock bikeJ2;

	/** The test bike J 1. */
	int testBikeJ1;

	/** The test bike J 2. */
	int testBikeJ2;

	/** The block number J 1. */
	private int blockNumberJ1 = 0;

	/** The block number J 2. */
	private int blockNumberJ2 = 0;

	/** The block number. */
	private int blockNumber = 0;

	/**
	 * Requis.
	 */
	@Before
	public void requis() {
		bikeJ1 = new BikeMock(40, 40);
		bikeJ2 = new BikeMock(540, 340);
		model = new Model();
	}

	/**
	 * Test get bike J 1 Y.
	 */
	@Test
	public void testGetBikeJ1Y() {
		testBikeJ1 = model.getBikeJ1Y();
		assertEquals(testBikeJ1, this.bikeJ1.getY());
	}

	/**
	 * Test get bike J 1 X.
	 */
	@Test
	public void testGetBikeJ1X() {
		testBikeJ1 = model.getBikeJ1X();
		assertEquals(testBikeJ1, this.bikeJ1.getX());
	}

	/**
	 * Test get bike J 2 Y.
	 */
	@Test
	public void testGetBikeJ2Y() {
		testBikeJ2 = model.getBikeJ2Y();
		assertEquals(testBikeJ2, this.bikeJ2.getY());
	}

	/**
	 * Test get bike J 2 x.
	 */
	@Test
	public void testGetBikeJ2x() {
		testBikeJ2 = model.getBikeJ2X();
		assertEquals(testBikeJ2, this.bikeJ2.getX());
	}

	/**
	 * Test set bike J 1 X.
	 */
	@Test
	public void testSetBikeJ1X() {

		model.setBikeJ1X(40);
		this.bikeJ1.setX(40);

		assertEquals(this.bikeJ1.getX(), this.model.getBikeJ1X());
	}

	/**
	 * Test set bike J 1 Y.
	 */
	@Test
	public void testSetBikeJ1Y() {
		model.setBikeJ1Y(40);
		this.bikeJ1.setY(40);

		assertEquals(this.bikeJ1.getY(), this.model.getBikeJ1Y());
	}

	/**
	 * Test set bike J 2 X.
	 */
	@Test
	public void testSetBikeJ2X() {
		model.setBikeJ2X(540);
		this.bikeJ2.setX(540);

		assertEquals(this.bikeJ2.getX(), this.model.getBikeJ2X());
	}

	/**
	 * Test set bike J 2 Y.
	 */
	@Test
	public void testSetBikeJ2Y() {
		model.setBikeJ2Y(340);
		this.bikeJ2.setY(340);

		assertEquals(this.bikeJ2.getY(), this.model.getBikeJ2Y());
	}

	/**
	 * Test position J 1 X.
	 */
	@Test
	public void testPositionJ1X() {
		testBikeJ1 = model.positionJ1X();
		assertEquals(testBikeJ1, this.bikeJ1.positionX());
	}

	/**
	 * Test position J 1 Y.
	 */
	@Test
	public void testPositionJ1Y() {
		testBikeJ1 = model.positionJ1Y();
		assertEquals(testBikeJ1, this.bikeJ1.positionY());
	}

	/**
	 * Test position J 2 X.
	 */
	@Test
	public void testPositionJ2X() {
		testBikeJ2 = model.positionJ2X();
		assertEquals(testBikeJ2, this.bikeJ2.positionX());
	}

	/**
	 * Test position J 2 Y.
	 */
	@Test
	public void testPositionJ2Y() {
		testBikeJ2 = model.positionJ2Y();
		assertEquals(testBikeJ2, this.bikeJ2.positionY());
	}

	/**
	 * Test get block number.
	 */
	@Test
	public void testGetBlockNumber() {
		blockNumber = model.getBlockNumber();
		assertEquals(blockNumber, this.model.getBlockNumber());
	}

	/**
	 * Test get block number J 1.
	 */
	@Test
	public void testGetBlockNumberJ1() {
		blockNumberJ1 = model.getBlockNumberJ1();
		assertEquals(blockNumberJ1, this.model.getBlockNumberJ1());
	}

	/**
	 * Test get block number J 2.
	 */
	@Test
	public void testGetBlockNumberJ2() {
		blockNumberJ2 = model.getBlockNumberJ2();
		assertEquals(blockNumberJ2, this.model.getBlockNumberJ2());
	}

}
