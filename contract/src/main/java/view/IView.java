/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package view;

import controller.IController;

// TODO: Auto-generated Javadoc
/**
 * The Interface IView.
 */
public interface IView {


	/**
	 * Display message.
	 *
	 * @param message
	 *            the message
	 * @param time
	 *            the time
	 */
	public void displayMessage(final String message, final int time);



	/**
	 * a method update what the user see on screen.
	 */
	void repaint();

	/**
	 * a methode Open the window.
	 */

	// void openWindows();

	/**
	 * Close windows.
	 */
	void closeWindows();

	/**
	 * Position.
	 */
	public void position();

	/**
	 * Get the observer of the view.
	 *
	 * @param controller
	 *            the new controller
	 * @return An observer
	 */
	// Observer getObserver();

	/**
	 * Setter of the controller.
	 *
	 * @param controller
	 *            Set the controller of the view
	 */
	void setController(IController controller);

}
