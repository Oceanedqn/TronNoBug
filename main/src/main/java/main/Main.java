/**
 *
 * @author Oceane oceane.duquenne@viacesi.fr
 * @version 1.0
 */
package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

/**
 * The Class Main.
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws SQLException
	 */
	public static void main(final String[] args) throws SQLException {

		final ModelFacade model = new ModelFacade();
		final ViewFacade view = new ViewFacade();
		final ControllerFacade controller = new ControllerFacade(view, model);
		view.setController(controller);
		controller.start();
		// final ControllerFacade controller = new ControllerFacade(new ViewFacade(),
		// new ModelFacade());

		// new Windows();
	}

}
