package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Observable;

import controller.IElement;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

	/**
	 * In the interface IElement, we got the element and his localisation (x;y)
	 * 
	 * @param x
	 *            localisation x
	 * @param y
	 *            localisation y
	 * @return Element
	 */
	IElement getElement(int x, int y);

	/**
	 * getter for the elements
	 * 
	 * @return A multi board to get the elements
	 */
	IElement[][] getElements();

	/**
	 * methode use to informe the model that the view has changed
	 */
	void flush();

	/**
	 * A method to get the observable
	 *
	 * @return a methode for observable
	 */
	Observable getObservable();

	// ###########################################################
	// ###################### Autre ##############################
	// ###########################################################

	public int getNumberOfWall();

	public void setNumberOfWall(final int numberOfWall);

	public int getWallX(final int number);

	public int getWallY(final int number);

	public int positionJ1X();

	public int positionJ1Y();

	public int positionJ2X();

	public int positionJ2Y();

	public int getBikeJ1X();

	public int getBikeJ1Y();

	public int getBikeJ2X();

	public int getBikeJ2Y();

	public void setBikeJ1X(final int x);

	public void setBikeJ1Y(final int y);

	public void setBikeJ2X(final int x);

	public void setBikeJ2Y(final int y);

	/**
	 * Gets the example by id.
	 *
	 * @param id
	 *            the id
	 * @return the example by id
	 * @throws SQLException
	 *             the SQL exception
	 */
	Example getExampleById(int id) throws SQLException;

	/**
	 * Gets the example by name.
	 *
	 * @param name
	 *            the name
	 * @return the example by name
	 * @throws SQLException
	 *             the SQL exception
	 */
	Example getExampleByName(String name) throws SQLException;

	/**
	 * Gets the all examples.
	 *
	 * @return the all examples
	 * @throws SQLException
	 *             the SQL exception
	 */
	List<Example> getAllExamples() throws SQLException;
}
