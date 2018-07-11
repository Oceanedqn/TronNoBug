package model;

import java.sql.SQLException;
import java.util.Observable;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class Model extends Observable implements IModel {
	private Bike bikeJ1;
	private Bike bikeJ2;
	
	//private final int wall[][] = new int[598][2];
	@SuppressWarnings("unused")
	private int numberOfWall = 0;

	/**
	 * Instantiates a new model facade.
	 */
	public Model() {

		// super();
		this.bikeJ1 = new Bike(120, 0);
		this.bikeJ2 = new Bike(240, 0);
		// System.out.println(bikeJ1);
		// System.out.println(bikeJ2);
	}
	



	
	

	public int getBikeJ1X() {
		return bikeJ1.getX();
	}

	public int getBikeJ1Y() {
		return bikeJ1.getY();
	}


	public void setBikeJ1X(int x) {
		this.bikeJ1.setX(x);
	}

	public void setBikeJ1Y(int y) {
		this.bikeJ1.setY(y);
	}



	public int getBikeJ2X() {
		return bikeJ2.getX();
	}

	public int getBikeJ2Y() {
		return bikeJ2.getY();
	}


	public void setBikeJ2X(int x) {
		this.bikeJ2.setX(x);
	}

	public void setBikeJ2Y(int y) {
		this.bikeJ2.setY(y);
	}

	public int positionJ1X() {
		return this.bikeJ1.positionX();
	}

	public int positionJ1Y() {
		return this.bikeJ1.positionY();
	}

	public int positionJ2X() {
		return this.bikeJ2.positionX();
	}

	public int positionJ2Y() {
		return this.bikeJ2.positionY();
	}


	@Override
	public void message(String message, int time) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public void message(String message, int time) throws SQLException {
	 * TronBDDConnector dbConnection = TronBDDConnector.getInstance();
	 * dbConnection.message(message, time);
	 * 
	 * }
	 */


	
	
	
	
	
	
	
	
	
	

	

}
