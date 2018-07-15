/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
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

		g.drawString("BIENVENUE DANS L'ÉDITION SPÉCIAL TRON MODE CACHÉ", 268, 20);

		g.drawString(" * Si tu veux connaître l'avancé du TEMPS de partie,", 110, 250);
		g.drawString("   n'oublies pas de bouger", 115, 265);

		g.drawString(" * Essaye de faire le MOINS de mouvement possible", 110, 285);
		g.drawString("   pour battre le record !", 115, 300);

		g.drawString(" * Ne te cogne pas dans les MURS ! ", 110, 320);
		g.drawString("   (On doit être maitre de son vehicule !)", 115, 335);

		g.drawString(" * Les MOTOS ne sont pas des murs ! ", 110, 355);

		g.drawString(" * N : Nouveau MENU", 480, 250);

		g.drawString(" * P : Sauvegarde du score dans la BDD", 480, 285);
		g.drawString(" * P : Affichage du score de fin dans la popup final ", 480, 300);

		g.drawLine(440, 210, 440, 370);

		final Font fonte = new Font("Zapfino", Font.BOLD, 15);
		g.setFont(fonte);

		g.drawString("Quelques infos et astuces avant de débuter", 100, 225);
		g.drawString("Nouveautés et Prochainement", 470, 225);

		g.setColor(Color.MAGENTA);
		g.drawString("Press ENTER for start the game", 325, 190);

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
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
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
