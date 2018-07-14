package view;

import java.util.Observer;

import controller.IController;

public class View implements IView {

	/** The win. */
	private Windows win;

	private Chrono chrono;



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

	public String getChrono() {
		return this.chrono.getStr();
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

	public int getPatate() {
		// System.out.println(chrono.getCompteursTemps());
		return chrono.getCompteursTemps();

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



}
