package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Observable;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {
	private final Bike bikeJ1;
	private final Bike bikeJ2;
	
	//private final int wall[][] = new int[598][2];
	private int numberOfWall = 0;

	/**
	 * Instantiates a new model facade.
	 */
	public ModelFacade() {
	//	super();
		this.bikeJ1 = new Bike(20, 20);
		this.bikeJ2 = new Bike(580, 380);
		System.out.println("ON A DES MOTOS NOUS");
	}

	@Override
	public int getNumberOfWall() {
		return this.numberOfWall;
	}

	@Override
	public void setNumberOfWall(final int numberOfWall) {
		this.numberOfWall = numberOfWall;
	}



	/*
	 * (non-Javadoc)
	 *
	 * @see model.IModel#getExampleById(int)
	 */
	@Override
	public Example getExampleById(final int id) throws SQLException {
		return ExampleDAO.getExampleById(id);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IModel#getExampleByName(java.lang.String)
	 */
	@Override
	public Example getExampleByName(final String name) throws SQLException {
		return ExampleDAO.getExampleByName(name);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IModel#getAllExamples()
	 */
	@Override
	public List<Example> getAllExamples() throws SQLException {
		return ExampleDAO.getAllExamples();
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

	@Override
	public int getWallX(int number) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWallY(int number) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void setBikeJ1X(int x) {
		this.bikeJ1.setX(x);
		
	}

	@Override
	public void setBikeJ1Y(int y) {
		this.bikeJ1.setY(y);
		
	}

	@Override
	public void setBikeJ2X(int x) {
		this.bikeJ2.setX(x);
		
	}

	@Override
	public void setBikeJ2Y(int y) {
		this.bikeJ2.setY(y);
		
	}
	
	// NEW CREATION 
	public int getBikeJ1X() {
		return this.bikeJ1.getX();
	}
	
	public int getBikeJ1Y() {
		return this.bikeJ1.getY();
	}
	
	public int getBikeJ2X() {
		return this.bikeJ2.getX();
	}
	
	public int getBikeJ2Y() {
		return this.bikeJ2.getY();
	}
	
	

}
