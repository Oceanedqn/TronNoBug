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
public class ViewFacade implements IView {

	private final Windows win;

	// private IModel model;

	/**
	 * Instantiates a new view facade.
	 */
	public ViewFacade() {
		super();
		this.win = new Windows();

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see view.IView#displayMessage(java.lang.String)
	 */
	@Override
	public final void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public Windows getWin() {
		return this.win;
	}

	/**
	 * update methode from IView inteface
	 */
	@Override
	public void repaint() {

	}

	/**
	 * methode to open the frame
	 */
	public void openFrame() {
		this.win.setVisible(true);
	}

	/**
	 * methode to close the current frame
	 */
	public void closeFrame() {
		this.win.setVisible(false);
	}

	/**
	 * methode to get the observer from the patern
	 */
	@Override
	public Observer getObserver() {
		return (Observer) this.win.getMenuu();
	}

	/**
	 * set the controller associated to the view
	 *
	 * @param controller
	 *            The controller associated
	 */
	@Override
	public void setController(final IController controller) {
		this.win.setController(controller);
	}

	@Override
	public void openWindows() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeWindows() {
		// TODO Auto-generated method stub

	}

}
