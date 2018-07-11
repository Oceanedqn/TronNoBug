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
	 * @throws SQLException
	 */
	public static void main(final String[] args) throws SQLException {
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			// handle the error
		}

		final Model model = new Model();		
		final View view = new View();

		final Controller controller = new Controller(view, model);
		view.setController(controller);
		controller.start();
		// final ControllerFacade controller = new ControllerFacade(new ViewFacade(),
		// new ModelFacade());


	}

}
