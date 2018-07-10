package controller;

import java.awt.event.KeyEvent;
import java.sql.SQLException;

import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller
 * component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

	/** The view. */
	@SuppressWarnings("unused")
	private IView view;

	@SuppressWarnings("unused")
	private IModel model;

	/** The Clock of the game */
	private Clock clock;

	/**
	 * Instantiates a new controller facade.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public ControllerFacade(final IView view, final IModel model) {

		this.setView(view);
		this.setModel(model);
	}

	/**
	 * Start.
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */
	@Override
	public void start() throws SQLException {
		// this.model.getObservable().addObserver(this.view.getObserver());
		this.clock = new Clock(this);
		this.clock.start();
		// this.getView().displayMessage(this.getModel().getExampleById(1).toString());

		// this.getView().displayMessage(this.getModel().getExampleByName("Example
		// 2").toString());

		// final List<Example> examples = this.getModel().getAllExamples();
		// final StringBuilder message = new StringBuilder();
		// for (final Example example : examples) {
		// message.append(example);
		// message.append('\n');
		// }
		// this.getView().displayMessage(message.toString());
	}

	public void orderPerform(final int keycode) {

		if (keycode == KeyEvent.VK_ENTER) {
			System.out.println("caca");

			// change pour afficher la map

		}

	}

	public int collision(final int positionX, final int positionY) {
		return positionX;

	}

	// GETTERS & SETTERS //

	/**
	 * Sets the view.
	 *
	 * @param view
	 *            the new view
	 */
	public void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *            the new model
	 */
	@Override
	public void setModel(final IModel model) {
	}

	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void orderPerform(final Order keyCode) {
		// TODO Auto-generated method stub

	}
}
