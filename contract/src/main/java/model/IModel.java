package model;

import java.sql.SQLException;
import java.util.Observable;


/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

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

	/*
	 * public int getNumberOfWall();
	 * 
	 * public void setNumberOfWall(final int numberOfWall);
	 * 
	 * public int getWallX(final int number);
	 * 
	 * public int getWallY(final int number);
	 */

	public int getBikeJ1X();

	public int getBikeJ1Y();

	public int getBikeJ2X();

	public int getBikeJ2Y();

	public void setBikeJ1X(int x);

	public void setBikeJ1Y(int y);

	public void setBikeJ2X(int x);

	public void setBikeJ2Y(int y);

	int positionJ1Y();

	int positionJ1X();

	int positionJ2Y();

	int positionJ2X();

	public void message(String message, int time) throws SQLException;;

	/**
	 * Gets the example by id.
	 *
	 * @param id
	 *            the id
	 * @return the example by id
	 * @throws SQLException
	 *             the SQL exception
	 */
//	Example getExampleById(int id) throws SQLException;

	/**
	 * Gets the example by name.
	 *
	 * @param name
	 *            the name
	 * @return the example by name
	 * @throws SQLException
	 *             the SQL exception
	 */
//	Example getExampleByName(String name) throws SQLException;

	/**
	 * Gets the all examples.
	 *
	 * @return the all examples
	 * @throws SQLException
	 *             the SQL exception
	 */
//	List<Example> getAllExamples() throws SQLException;
}
