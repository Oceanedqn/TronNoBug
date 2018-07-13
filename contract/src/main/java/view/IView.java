package view;

import controller.IController;

public interface IView {

	/**
	 * Display message.
	 *
	 * @param message
	 *            the message
	 */
	void displayMessage(String message);

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

	/**
	 * Final time.
	 */
	void finalTime();

}
