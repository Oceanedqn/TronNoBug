package view;

import java.util.Observer;

import controller.IController;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

	/**
	 * Display message.
	 *
	 * @param message
	 *            the message
	 */
	void displayMessage(String message);

	/**
	 * a method update what the user see on screen
	 */
	void repaint();

	/**
	 * a methode Open the window
	 */

	void openWindows();

	void closeWindows();

	/**
	 * Get the observer of the view
	 *
	 * @return An observer
	 */
	Observer getObserver();

	/**
	 * Setter of the controller
	 *
	 * @param controller
	 *            Set the controller of the view
	 */
	void setController(IController controller);

}
