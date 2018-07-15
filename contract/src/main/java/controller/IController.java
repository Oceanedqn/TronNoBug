/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package controller;

import model.IModel;

/**
 * The Interface IController.
 */
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
	 */
	public void start();

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
