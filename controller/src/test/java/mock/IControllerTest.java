package mock;

import model.IModel;

public interface IControllerTest {

	/**
	 * Set the model of the controller.
	 *
	 * @param model
	 *            The model of the controller
	 */
	public void setModel(IModel model);

	/**
	 * Begin the game.
	 */
	public void start();

	/**
	 * Order perform.
	 *
	 * @param keycode
	 *            the keycode
	 * @param numPlayer
	 *            the num player
	 * @return
	 */
	public int orderPerform(int numPlayer);

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IModel getModel();

}
