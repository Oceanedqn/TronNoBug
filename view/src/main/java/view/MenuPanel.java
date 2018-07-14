package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.IModel;

/**
 * The Class MenuPanel.
 */
public class MenuPanel extends JPanel implements Observer {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The model. */
	private IModel model;

	/**
	 * Constructor.
	 */
	public MenuPanel() {
		setVisible(true);
	}

	
	/**
	 * Method for draw the menu.
	 *
	 * @param g
	 *            the g
	 */
	@Override
	public void paintComponent(final Graphics g) {

		super.paintComponent(g);
		/**
		 * Draw background black
		 */
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 900, 400);
		/**
		 * Write a text gray
		 */
		g.setColor(Color.GRAY);
		final Font fonte = new Font("Zapfino", Font.BOLD, 15);
		g.setFont(fonte);
		g.drawString("Press ENTER for start the game", 325, 250);

		/**
		 * Insert a picture for the background
		 */
		try {
			final Image img = ImageIO
					.read(new File("D:\\Document\\Java\\Utiliser\\tron\\Tron\\lorann\\pictures\\TronViolet.png"));
			g.drawImage(img, 320, 50, this);
			// System.out.println("On met l'image en bleu");
		} catch (final IOException e) {
			e.printStackTrace();
		}
		
		


	}
	// FAIRE UN TRUC POUR LE FAIRE CHANGER DE COULEUR

	/*
	 * try { final Image img = ImageIO .read(new File(
	 * "D:\\Document\\Java\\Utiliser\\tron\\Tron\\lorann\\pictures\\TronBleu.png"));
	 * g.drawImage(img, 320, 50, this); //
	 * System.out.println("On met l'image en rouge"); } catch (final IOException e)
	 * { e.printStackTrace(); } }
	 */

	/*
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(Observable observable, Object arg) {
		this.setModel((IModel) observable);
		this.repaint();

	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IModel getModel() {
		return model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *            the new model
	 */
	public void setModel(IModel model) {
		this.model = model;
	}

}
