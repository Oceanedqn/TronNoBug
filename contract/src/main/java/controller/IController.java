package controller;

import java.sql.SQLException;

import model.IModel;

public interface IController {



	/**
	 * Set the model of the controller.
	 *
	 * @param model
	 *            The model of the controller
	 */
	public void setModel(IModel model);

	/**
	 * Begin the game.
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */
	public void start() throws SQLException;

	/**
	 * Order perform.
	 *
	 * @param keycode
	 *            the keycode
	 * @param numPlayer
	 *            the num player
	 */
	public void orderPerform(Order keycode, int numPlayer);

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IModel getModel();



}
