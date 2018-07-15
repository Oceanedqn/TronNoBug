/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package model;

import java.sql.SQLException;
import java.util.Observable;

import view.IView;

/**
 * The Class Model.
 */
public final class Model extends Observable implements IModel {

	/** The bike J 1. */
	private Bike bikeJ1;

	/** The bike J 2. */
	private Bike bikeJ2;

	/** The view. */
	@SuppressWarnings("unused")
	private IView view;

	/** The block number J 1. */
	private int blockNumberJ1 = 0;

	/** The block number J 2. */
	private int blockNumberJ2 = 0;

	/** The block number. */
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
		// TronBDDConnector connector = new TronBDDConnector();
		// System.out.println("ouverture bdd");
		// connector.sauverEnBase(player, time);

	}




	/*
	 * 
	 * 
	 * @see model.IModel#getBlockNumber()
	 */
	public int getBlockNumber() {
		return blockNumber;
	}

	/*
	 *
	 * 
	 * @see model.IModel#setBlockNumber(int)
	 */
	public void setBlockNumber(int numberBlock) {
		this.blockNumber = numberBlock;
	}

	/*
	 * 
	 * 
	 * @see model.IModel#getBlockNumberJ1()
	 */
	public int getBlockNumberJ1() {
		return blockNumberJ1;
	}

	/*
	 * 
	 * 
	 * @see model.IModel#setBlockNumberJ1(int)
	 */
	public void setBlockNumberJ1(int numberBlockJ1) {
		this.blockNumberJ1 = numberBlockJ1;
	}

	/*
	 * 
	 * 
	 * @see model.IModel#getBlockNumberJ2()
	 */
	public int getBlockNumberJ2() {
		return blockNumberJ2;
	}

	/*
	 * 
	 * 
	 * @see model.IModel#setBlockNumberJ2(int)
	 */
	public void setBlockNumberJ2(int numberBlockJ2) {
		this.blockNumberJ2 = numberBlockJ2;
	}

}
