package controller;

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
public class Controller implements IController {

	/** The view. */

	private IView view;

	private IModel model;

	/** The Clock of the game */
	private Clock clock;

	private boolean inGame = false;

	/**
	 * Instantiates a new controller facade.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public Controller(final IView view, final IModel model) {

		this.setView(view);
		this.setModel(model);
		// this.view.position();
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
		this.view.position();
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

	public void setModel(final IModel model) {
		this.model = model;
	}

	public void update() {
		this.model.flush();

	}

	@Override
	public void orderPerform(Order keycode, int numPlayer) {


			if (numPlayer == 3) {
				System.out.println("caca");
				inGame = true;
			}

		if (inGame) {
			if (numPlayer == 1) {
				System.out.println("Joueur 1 qui joue");

				if (keycode == Order.DOWN) {
					System.out.println("Tu descends");

				} else if (keycode == Order.RIGHT) {
					System.out.println("Tu vas a droite");

				} else if (keycode == Order.LEFT) {
					System.out.println("Tu vas � gauche");

				} else if (keycode == Order.UP) {
					System.out.println("Tu montes");
				}
			}

			if (numPlayer == 2) {
				System.out.println("Joueur 2 qui joue");

				if (keycode == Order.DOWN) {
					System.out.println("Tu descends");

				} else if (keycode == Order.RIGHT) {
					System.out.println("Tu vas a droite");

				} else if (keycode == Order.LEFT) {
					System.out.println("Tu vas � gauche");

				} else if (keycode == Order.UP) {
					System.out.println("Tu montes");
				}
			}

			if (numPlayer == 4) {
				System.out.println("Pause");
			}

		}

	}

	@Override
	public int time() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void orderPerform(Order order) {
		// TODO Auto-generated method stub

	}

	/*
	 * public int getBikeJ1X() { // TODO Auto-generated method stub return
	 * model.getJ1X(); }
	 * 
	 * public int getBikeJ1Y() { // TODO Auto-generated method stub return
	 * model.getBikeJ1Y(); }
	 * 
	 * public int getBikeJ2X() {
	 * 
	 * return model.getBikeJ2X(); }
	 * 
	 * public int getBikeJ2Y() { // TODO Auto-generated method stub return
	 * model.getBikeJ2Y(); }
	 * 
	 * 
	 * public void setBikeJ1X(int x) { this.model.setBikeJ1X(x);
	 * 
	 * }
	 * 
	 * 
	 * public void setBikeJ1Y(int y) { this.model.setBikeJ1Y(y);
	 * 
	 * }
	 * 
	 * public void setBikeJ2X(int x) { this.model.setBikeJ2X(x);
	 * 
	 * }
	 * 
	 * 
	 * public void setBikeJ2Y(int y) { this.model.setBikeJ2Y(y);
	 * 
	 * }
	 */

}