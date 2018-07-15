/**
 *
 * @author Oceane oceane.duquenne@viacesi.fr
 * @version 1.0
 */
package main;

import java.sql.SQLException;

import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throwsss SQLException the SQL exception
	 */
	public static void main(final String[] args) throws SQLException {
		final Model model = new Model();
		final View view = new View();


		final Controller controller = new Controller(view, model);
		view.setController(controller);
		controller.start();
		// final ControllerFacade controller = new ControllerFacade(new ViewFacade(),
		// new ModelFacade());

	}

}
