/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package view;

import java.util.Observer;

import controller.IController;

/**
 * The Class View.
 */
public class View implements IView {

	/** The win. */
	private Windows win;

	/** The chrono. */
	@SuppressWarnings("unused")
	private Chrono chrono;

	/** The game. */
	@SuppressWarnings("unused")
	private GamePanel game;

	// private IModel model;

	/**
	 * Instantiates a new view facade.
	 */
	public View() {
		this.win = new Windows();

	}

	/*
	 * @see view.IView#repaint()
	 */
	public void repaint() {

	}

	/**
	 * Open windows.
	 */
	public void openWindows() {
		this.win.setVisible(true);
	}

	/*
	 * Close windows
	 */
	public void closeWindows() {
		this.win.setVisible(false);
	}

	/**
	 * Gets the observer.
	 *
	 * @return the observer
	 */
	public Observer getObserver() {
		return (Observer) this.win.getGamePanel();
	}

	/*
	 * @see view.IView#setController(controller.IController)
	 */
	public void setController(IController controller) {
		this.win.setController(controller);
	}

	/*
	 * @see view.IView#position()
	 */
	@Override
	public void position() {

	}

	/*
	 * 
	 * 
	 * @see view.IView#displayMessage(java.lang.String, int)
	 */
	@Override
	public void displayMessage(String message, int time) {

	}

}
