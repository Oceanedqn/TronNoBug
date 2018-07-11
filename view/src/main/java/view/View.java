package view;

import java.util.Observer;

import controller.IController;

public class View implements IView {

	/** The win. */
	private Windows win;

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

	/*
	 * @see view.IView#openWindows()
	 */
	public void openWindows() {
		this.win.setVisible(true);
	}

	/*
	 * @see view.IView#closeWindows()
	 */
	public void closeWindows() {
		this.win.setVisible(false);
	}

	/*
	 * @see view.IView#getObserver()
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
	 * @see view.IView#displayMessage(java.lang.String)
	 */
	@Override
	public void displayMessage(String message) {

	}

	/*
	 * @see view.IView#position()
	 */
	@Override
	public void position() {

	}

	/*
	 * @see view.IView#finalTime()
	 */
	@Override
	public void finalTime() {

	}

}
