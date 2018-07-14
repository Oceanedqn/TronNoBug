package controller;

import java.sql.SQLException;

import model.IModel;
import view.IView;

public class Controller implements IController {

	/** The view. */

	private IView view;

	/** The model. */
	private IModel model;

	// int time = view.getChrono().getTime()

	/** The in game. */
	private boolean inGame = false;

	/** The last key code J 2. */
	private Order lastKeyCodeJ2;

	/** The last key code J 1. */
	private Order lastKeyCodeJ1;

	private int tabMap[][] = new int[30][20];

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
		;

		// this.view.position();
	}

	/**
	 * Start.
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */

	public void start() {
		// this.model.getObservable().addObserver(this.view.getObserver());;

		// this.clock = new Clock(this);
		// this.clock.start();
		System.out.println("Start");

		// System.out.println("Start");
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

	/*
	 * @see controller.IController#orderPerform(controller.Order, int) method to
	 * manage the actions of the players
	 * 
	 */

	public void orderPerform(Order keycode, int numPlayer) {

		if (numPlayer == 3) {
			// System.out.println("caca");
			inGame = true;
		}

		if (inGame) {
			if (numPlayer == 1) {
				this.lastKeyCodeJ1 = keycode;
				// System.out.println("Joueur 1 qui joue");

				if (keycode == Order.DOWN) {
					ActionPerform(this.lastKeyCodeJ1, 1);

				} else if (keycode == Order.RIGHT) {
					ActionPerform(this.lastKeyCodeJ1, 1);

				} else if (keycode == Order.LEFT) {
					ActionPerform(this.lastKeyCodeJ1, 1);

				} else if (keycode == Order.UP) {
					ActionPerform(this.lastKeyCodeJ1, 1);
				}
			}

			if (numPlayer == 2) {
				this.lastKeyCodeJ2 = keycode;
				// System.out.println("Joueur 2 qui joue");

				if (keycode == Order.DOWN) {
					ActionPerform(this.lastKeyCodeJ2, 2);

				} else if (keycode == Order.RIGHT) {
					ActionPerform(this.lastKeyCodeJ2, 2);

				} else if (keycode == Order.LEFT) {
					ActionPerform(this.lastKeyCodeJ2, 2);

				} else if (keycode == Order.UP) {
					ActionPerform(this.lastKeyCodeJ2, 2);
				}
			}

			if (numPlayer == 4) {
				System.out.println("Pause");
			}

		}

	}

	/**
	 * Action perform. For the travel of players
	 * 
	 * @param order
	 *            the order
	 * @param keycode
	 *            the keycode
	 */
	public void ActionPerform(Order order, int keycode) {

		if (keycode == 1) {

			tabMap[this.getModel().getBikeJ1X() / 20][this.getModel().getBikeJ1Y() / 20] = 1;
			switch (order) {

			case UP:
				this.getModel().setBikeJ1Y(this.getModel().positionJ1Y() - 20);

				break;
			case DOWN:

				this.getModel().setBikeJ1Y(this.getModel().positionJ1Y() + 20);

				break;
			case ENTER:
				break;
			case LEFT:
				this.getModel().setBikeJ1X(this.getModel().positionJ1X() - 20);

				break;
			case RIGHT:
				this.getModel().setBikeJ1X(this.getModel().positionJ1X() + 20);

				break;
			default:
				break;
			}

			if (this.getModel().getBikeJ1X() / 20 > 29 || this.getModel().getBikeJ1Y() / 20 > 19
					|| (this.getModel().getBikeJ1X() / 20 < 0 || this.getModel().getBikeJ1Y() / 20 < 0)) {
				System.out.println("Mort : Collision hors map");
				endJ1();
				;

			} else if (tabMap[this.getModel().getBikeJ1X() / 20][this.getModel().getBikeJ1Y() / 20] == 1) {
				System.out.println("Mort : Collision avec un mur");
				endJ1();
			}

		}
		if (keycode == 2) {

			tabMap[this.getModel().getBikeJ2X() / 20][this.getModel().getBikeJ2Y() / 20] = 1;
			switch (order) {
			case UP:
				this.getModel().setBikeJ2Y(this.getModel().positionJ2Y() - 20);

				break;
			case DOWN:
				this.getModel().setBikeJ2Y(this.getModel().positionJ2Y() + 20);

				break;
			case ENTER:
				break;
			case LEFT:
				this.getModel().setBikeJ2X(this.getModel().positionJ2X() - 20);

				break;
			case RIGHT:
				this.getModel().setBikeJ2X(this.getModel().positionJ2X() + 20);

				break;
			default:
				break;

			}

			if (this.getModel().getBikeJ2X() / 20 > 29 || this.getModel().getBikeJ2Y() / 20 > 19
					|| (this.getModel().getBikeJ2X() / 20 < 0 || this.getModel().getBikeJ2Y() / 20 < 0)) {
				System.out.println("Mort : Collision hors map");
				endJ2();
			} else if (tabMap[this.getModel().getBikeJ2X() / 20][this.getModel().getBikeJ2Y() / 20] == 1) {
				System.out.println("Mort : Collision avec un mur");
				endJ2();
			}
		}
	}

	public void endJ1() {

		this.getView().closeWindows();
		javax.swing.JOptionPane.showMessageDialog(null, "J2 WIN" /* + this.getView().getPatate() */);
		System.exit(0);

	}

	public void endJ2() {

		// System.out.println(this.getView().getPatate());
		this.getView().closeWindows();
		javax.swing.JOptionPane.showMessageDialog(null, "J1 WIN" /* + this.getView().getPatate() */);
		System.exit(0);

	}
	/*
	 * if (!collisionOn(this.getModel().getBikeJ2X() / 20,
	 * this.getModel().getBikeJ2Y() / 20, this.getModel().getBikeJ1X() / 20,
	 * this.getModel().getBikeJ1Y() / 20)) { // end("PLAYER ONE WIN"); end();
	 * javax.swing.JOptionPane.showMessageDialog(null, "J1 WIN"); System.exit(0); //
	 * this.view.finalTime(); }
	 */

	/**
	 * Collision on.
	 *
	 * so that players do not get out of the grid and that players do not touch each
	 * other
	 * 
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param xx
	 *            the xx
	 * @param yy
	 *            the yy
	 * @return true, if successful
	 */
	public boolean collisionOn(int x, int y, int xx, int yy) {
		int validate = 1;
		if (x > 30 || x < 0) {
			validate = 0;
		}

		if (y > 20 || y < 0) {
			validate = 0;
		}

		if (x == xx && y == yy) {
			validate = 0;
			end();
			// this.view.finalTime();
		}

		if (validate == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * End. Show final message
	 *
	 * @param message
	 *            the message
	 */

	public void end() {
		this.getView().closeWindows();

		// this.clock.stop();
		// System.out.println(chrono.getDureeSec());

		// System.out.println(Clock());
		// clock.stop();
	}

	/**
	 * Update.
	 */
	public void update() {

		this.getView().position();
		this.getView().repaint();

	}

	/*
	 * @see controller.IController#getModel()
	 */
	public IModel getModel() {
		return this.model;
	}

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	public IView getView() {
		return view;
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *            the new view
	 */
	public void setView(IView view) {
		this.view = view;
	}

	/**
	 * Move bike J 1 X.
	 *
	 * @return the int
	 */
	public int moveBikeJ1X() {
		return this.model.getBikeJ1X();
	}

	/**
	 * Move bike J 1 Y.
	 *
	 * @return the int
	 */
	public int moveBikeJ1Y() {
		return this.model.getBikeJ1Y();
	}

	/**
	 * Move bike J 2 X.
	 *
	 * @return the int
	 */
	public int moveBikeJ2X() {
		return this.model.getBikeJ2X();
	}

	/**
	 * Move bike J 2 Y.
	 *
	 * @return the int
	 */
	public int moveBikeJ2Y() {
		return this.model.getBikeJ2Y();
	}

	/**
	 * Collision.
	 *
	 * @param positionX
	 *            the position X
	 * @param positionY
	 *            the position Y
	 * @return the int
	 */
	// RETOURNE JUSTE X
	public int collision(final int positionX, final int positionY) {
		return positionX;

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

}