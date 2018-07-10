package controller;

import java.sql.SQLException;

import model.IModel;

/**
 * <h1>The Interface IController.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IController {

	/**
	 * Set the model of the controller
	 *
	 * @param model
	 *            The model of the controller
	 */
	public void setModel(IModel model);

	/**
	 * Begin the game
	 *
	 * @throws SQLException
	 */
	public void start() throws SQLException;



	public int time();
	
	public void orderPerform(Order keycode, int numPlayer);

	int getBikeJ1X();

	int getBikeJ1Y();
	
	int getBikeJ2X();
	
	int getBikeJ2Y();

	void setBikeJ1X(int x);
	
	void setBikeJ1Y(int y);
	
	void setBikeJ2X(int x);
	
	void setBikeJ2Y(int y);

}
