package model;

import java.sql.SQLException;
import java.util.Observable;

public final class Model extends Observable implements IModel {

	/** The bike J 1. */
	private Bike bikeJ1;

	/** The bike J 2. */
	private Bike bikeJ2;

	/**
	 * Instantiates a new model facade.
	 */
	public Model() {

		// super();
		this.bikeJ1 = new Bike(120, 0);
		this.bikeJ2 = new Bike(240, 0);

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
		this.bikeJ1.setX(x);
	}

	/*
	 * @see model.IModel#setBikeJ1Y(int)
	 */
	public void setBikeJ1Y(int y) {
		this.bikeJ1.setY(y);
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
		this.bikeJ2.setX(x);
	}

	/*
	 * @see model.IModel#setBikeJ2Y(int)
	 */
	public void setBikeJ2Y(int y) {
		this.bikeJ2.setY(y);
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
		connector.sauverEnBase(player, time);

	}

}
