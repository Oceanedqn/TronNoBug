package model;

import java.sql.SQLException;
import java.util.Observable;

public final class Model extends Observable implements IModel {

	/** The bike J 1. */
	private Bike bikeJ1;

	/** The bike J 2. */
	private Bike bikeJ2;

	// private int tabBlock[][] = new int[30][20];

	private int blockNumberJ1 = 0;
	private int blockNumberJ2 = 0;
	private int blockNumber = 0;

	/**
	 * Instantiates a new model facade.
	 */
	public Model() {

		// super();
		this.bikeJ1 = new Bike(40, 40);
		this.bikeJ2 = new Bike(540, 340);

	}

	/*
	 * @see model.IModel#getBikeJ1X()
	 */
	public int getBikeJ1X() {
		return bikeJ1.getX();
	}

	/*
	 * @see model.IModel#getBikeJ1Y()
	 */
	public int getBikeJ1Y() {
		return bikeJ1.getY();
	}

	/*
	 * @see model.IModel#setBikeJ1X(int)
	 */
	public void setBikeJ1X(int x) {

		// tabBlock[blockNumberJ1][0] = this.bikeJ1.getX();
		// tabBlock[blockNumberJ1][1] = this.bikeJ1.getY();
		this.bikeJ1.setX(x);
		this.blockNumber++;
		this.blockNumberJ1++;
		System.out.println(blockNumberJ1);

	}

	/*
	 * @see model.IModel#setBikeJ1Y(int)
	 */
	public void setBikeJ1Y(int y) {
		// tabBlock[blockNumberJ1][0] = this.bikeJ1.getX();
		// tabBlock[blockNumberJ1][1] = this.bikeJ1.getY();
		this.bikeJ1.setY(y);
		this.blockNumber++;
		this.blockNumberJ1++;
		System.out.println(blockNumberJ1);
	}

	/*
	 * @see model.IModel#getBikeJ2X()
	 */
	public int getBikeJ2X() {
		return bikeJ2.getX();
	}

	/*
	 * @see model.IModel#getBikeJ2Y()
	 */
	public int getBikeJ2Y() {
		return bikeJ2.getY();
	}

	/*
	 * @see model.IModel#setBikeJ2X(int)
	 */
	public void setBikeJ2X(int x) {
		// tabBlock[blockNumberJ2][0] = this.bikeJ1.getX();
		// tabBlock[blockNumberJ2][1] = this.bikeJ2.getY();
		this.bikeJ2.setX(x);
		this.blockNumber++;
		this.blockNumberJ2++;
		System.out.println(blockNumberJ2);
	}

	/*
	 * @see model.IModel#setBikeJ2Y(int)
	 */
	public void setBikeJ2Y(int y) {
		// tabBlock[blockNumberJ2][0] = this.bikeJ1.getX();
		// tabBlock[blockNumberJ2][1] = this.bikeJ2.getY();
		this.bikeJ2.setY(y);
		this.blockNumber++;
		this.blockNumberJ2++;
		System.out.println(blockNumberJ2);

	}

	/*
	 * @see model.IModel#positionJ1X()
	 */
	public int positionJ1X() {
		return this.bikeJ1.positionX();
	}

	/*
	 * @see model.IModel#positionJ1Y()
	 */
	public int positionJ1Y() {
		return this.bikeJ1.positionY();
	}

	/*
	 * @see model.IModel#positionJ2X()
	 */
	public int positionJ2X() {
		return this.bikeJ2.positionX();
	}

	/*
	 * @see model.IModel#positionJ2Y()
	 */
	public int positionJ2Y() {
		return this.bikeJ2.positionY();
	}

	/*
	 * @see model.IModel#message(java.lang.String, int)
	 */
	public void message(String player, int time) throws SQLException {
		TronBDDConnector connector = new TronBDDConnector();
		System.out.println("ouverture bdd");
		connector.sauverEnBase(player, time);

	}

	/*
	 * public int[][] getTabBlock() { return tabBlock; }
	 * 
	 * public void setTabBlock(int tabBlock[][]) { this.tabBlock = tabBlock; }
	 */

	public int getBlockNumber() {
		return blockNumber;
	}

	public void setBlockNumber(int numberBlock) {
		this.blockNumber = numberBlock;
	}

	public int getBlockNumberJ1() {
		return blockNumberJ1;
	}

	public void setBlockNumberJ1(int numberBlockJ1) {
		this.blockNumberJ1 = numberBlockJ1;
	}

	public int getBlockNumberJ2() {
		return blockNumberJ2;
	}

	public void setBlockNumberJ2(int numberBlockJ2) {
		this.blockNumberJ2 = numberBlockJ2;
	}

	/*
	 * public int getTabBlockX(int bn) { return tabBlock[bn][0]; }
	 * 
	 * public int getTabBlockY(int bn) { return tabBlock[bn][1]; }
	 */

}
