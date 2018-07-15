package controller;

import javax.swing.JOptionPane;

import model.IModel;
import view.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {

	/** The view. */

	private IView view;

	/** The model. */
	private IModel model;

	private IChrono chrono;

	/** The chrono. */

	// int time = view.getChrono().getTime()

	/** The in game. */
	private boolean inGame = false;

	/** The last key code J 2. */
	private Order lastKeyCodeJ2;

	/** The last key code J 1. */
	private Order lastKeyCodeJ1;

	/** The tab map. */
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
		this.setChrono(chrono);
		// this.chrono = chrono;

		// this.view.position();
	}

	/**
	 * Start.
	 */

	public void start() {
		// this.model.getObservable().addObserver(this.view.getObserver());;

		// this.chrono = new Chrono(this);
		// this.chrono.run();

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
	 * Methode to manage the actions of the players
	 * 
	 * @see controller.IController#orderPerform(controller.Order, int)
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

		// while (!chrono.isEnd()) {

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
		// }
	}

	/**
	 * End J 1.
	 */
	public void endJ1() {

		this.getView().closeWindows();

		if (model.getBlockNumberJ2() == 0) {
			javax.swing.JOptionPane.showMessageDialog(null,
					"J2 WIN AVEC " + model.getBlockNumberJ2() + " MÛRS POSÉ, BAH ALORS ON EST NUL !", "END MESSAGE",
					JOptionPane.INFORMATION_MESSAGE);
		}

		else if (model.getBlockNumberJ2() > 0 && model.getBlockNumberJ2() < 29) {

			javax.swing.JOptionPane.showMessageDialog(null,
					"J2 WIN AVEC SEULEMENT " + model.getBlockNumberJ2() + " BLOCK", "END MESSAGE",
					JOptionPane.INFORMATION_MESSAGE);
		}

		else if (model.getBlockNumberJ2() > 30) {
			javax.swing.JOptionPane.showMessageDialog(null,
					"J2 WIN AVEC " + model.getBlockNumberJ2() + " BLOCK, HUM JE VOIS, PARTIE TRÈS SERRÉE",
					"END MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		}

		System.exit(0);
	}

	/**
	 * End J 2.
	 */
	public void endJ2() {

		this.getView().closeWindows();

		if (model.getBlockNumberJ1() == 0) {
			javax.swing.JOptionPane.showMessageDialog(null,
					"J1 WIN AVEC " + model.getBlockNumberJ1() + " MÛRS POSÉ, BAH ALORS ON EST NUL !", "END MESSAGE",
					JOptionPane.INFORMATION_MESSAGE);
		}

		else if (model.getBlockNumberJ1() > 0 && model.getBlockNumberJ1() < 29) {

			javax.swing.JOptionPane.showMessageDialog(null,
					"J1 WIN AVEC SEULEMENT " + model.getBlockNumberJ1() + " BLOCK", "END MESSAGE",
					JOptionPane.INFORMATION_MESSAGE);
		}

		else if (model.getBlockNumberJ1() > 30) {
			javax.swing.JOptionPane.showMessageDialog(null,
					"J1 WIN AVEC " + model.getBlockNumberJ1() + " BLOCK, HUM JE VOIS, PARTIE TRÈS SERRÉE",
					"END MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		}

		System.exit(0);
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

	@SuppressWarnings("unused")
	private IChrono getChrono() {
		return this.chrono;
	}

	private void setChrono(IChrono chrono) {
		this.chrono = chrono;
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
	 * Sets the model.
	 *
	 * @param model
	 *            the new model
	 */

	public void setModel(final IModel model) {
		this.model = model;
	}

}