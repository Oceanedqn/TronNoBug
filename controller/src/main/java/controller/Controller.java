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

	private Order lastKeyCodeJ2;

	private Order lastKeyCodeJ1;

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

	public void start() throws SQLException {
		// this.model.getObservable().addObserver(this.view.getObserver());
		this.clock = new Clock(this);
		this.clock.start();
		System.out.println("Start");
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

	public int moveBikeJ1X() {
		return this.model.getBikeJ1X();
	}

	public int moveBikeJ1Y() {
		return this.model.getBikeJ1Y();
	}

	public int moveBikeJ2X() {
		return this.model.getBikeJ2X();
	}

	public int moveBikeJ2Y() {
		return this.model.getBikeJ2Y();
	}

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

	@Override
	public void orderPerform(Order keycode, int numPlayer) {

		if (numPlayer == 3) {
			System.out.println("caca");
			inGame = true;
		}

		if (inGame) {
			if (numPlayer == 1) {
				this.lastKeyCodeJ1 = keycode;
				System.out.println("Joueur 1 qui joue");

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
				System.out.println("Joueur 2 qui joue");

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

	public void ActionPerform(Order order, int keycode) {
		if (keycode == 1) {
			switch (order) {
			case UP:
				this.getModel().setBikeJ1Y(this.getModel().positionJ1Y() - 20);
				System.out.println("test");
				break;
			case DOWN:
				this.getModel().setBikeJ1Y(this.getModel().positionJ1Y() + 20);
				break;
			case ENTER:
				break;
			case LEFT:
				this.getModel().setBikeJ1X(this.getModel().positionJ1X() - 20);
				break;
			case PAUSE:
				break;
			case RIGHT:
				this.getModel().setBikeJ1X(this.getModel().positionJ1X() + 20);
				break;
			case SPACE:
				break;
			default:
				break;
			}


			if (!collisionOn(this.getModel().getBikeJ1X(), this.getModel().getBikeJ1Y(), this.getModel().getBikeJ2X(),
					this.getModel().getBikeJ2Y())) {
				end("PLAYER TWO WIN");
			}
		}
			if (keycode == 2) {
				switch (order) {
				case UP:
				this.getModel().setBikeJ2Y(this.getModel().positionJ2Y() - 20);
				System.out.println("test");
					break;
				case DOWN:
				this.getModel().setBikeJ2Y(this.getModel().positionJ2Y() + 20);
					break;
				case ENTER:
					break;
				case LEFT:
				this.getModel().setBikeJ2X(this.getModel().positionJ2X() - 20);
					break;
				case PAUSE:
					break;
				case RIGHT:
				this.getModel().setBikeJ2X(this.getModel().positionJ2X() + 20);
					break;
				case SPACE:
					break;
				default:
					break;
				}
				
			if (!collisionOn(this.getModel().getBikeJ2X(), this.getModel().getBikeJ2Y(), this.getModel().getBikeJ1X(),
					this.getModel().getBikeJ1Y())) {
				end("PLAYER ONE WIN");
				}
			}
			

		}

	public boolean collisionOn(int x, int y, int xx, int yy) {
		int validate = 1;
		if (x > 580 || x < 0) {
			validate = 0;
		}

		if (y > 380 || y < 0) {
			validate = 0;
		}

		if (x == xx && y == yy) {
			end("NO WIINEUR");
		}

		if (validate == 0) {
			return false;
		} else {
			return true;
		}
	}

	@SuppressWarnings("deprecation")
	public void end(String message) {
		try {
			this.model.message(message, this.clock.getTickNumber());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		this.getView().closeWindows();
		this.getView().displayMessage(message);
		this.clock.stop();
		System.exit(0);

	}

	public int time() {
		return this.clock.getTickNumber();
	}

	public void update() {
		this.getView().position();
		this.getView().repaint();
		this.view.finalTime();

	}


	public IModel getModel() {
		return this.model;
	}

	public IView getView() {
		return view;
	}

	public void setView(IView view) {
		this.view = view;
	}



	public int Clock() {

		return this.clock.getTickNumber();
	}

}
