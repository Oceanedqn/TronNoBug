package view;

import java.util.Observer;

import controller.IController;

public class View implements IView {

	/** The win. */
	private Windows win;

	private Chrono chrono;

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

	public int getChronoTimerModel() {
		return this.game.getChronoTimer();
	}

	/*
	 * @see view.IView#position()
	 */
	@Override
	public void position() {

	}


	@Override
	public void displayMessage(String message, int time) {
		// TODO Auto-generated method stub

	}

}
