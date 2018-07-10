package view;

import java.util.Observer;

import javax.swing.JOptionPane;

import controller.IController;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class View implements IView {

	private Windows win;

	
	// private IModel model;

	/**
	 * Instantiates a new view facade.
	 */
	public View() {
		this.win = new Windows();

	}
	
	
	public void repaint() {

	}

	public void openWindows() {
		this.win.setVisible(true);
	}


	public void closeWindows() {
		this.win.setVisible(false);
	}
	
	
	public Observer getObserver() {
		return (Observer) this.win.getGamePanel();
	}
	
	public void setController(IController controller) {
		this.win.setController(controller);
	}

	public Windows getWin() {
		return this.win;
	}

	/**
	 * update methode from IView inteface
	 */

	
	/**
	 * methode to open the frame
	 */
	

	/**
	 * methode to get the observer from the patern
	 */
/*	@Override
	public Observer getObserver() {
		return (Observer) this.win.getMenuPanel();
	}*/

	/**
	 * set the controller associated to the view
	 *
	 * @param controller
	 *            The controller associated
	 */
	

	
	
	public void position() {
		this.win.position();
	}


	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}



}
