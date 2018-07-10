package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Menuu extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 */
	public Menuu() {
	}

	/**
	 * Method for draw the menu
	 */
	@Override
	public void paintComponent(final Graphics g) {
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
		g.drawString("Press ENTER three times for start the game", 290, 250);

		/**
		 * Insert a picture for the background
		 */
		try {
			final Image img = ImageIO
					.read(new File("D:\\Document\\Java\\Utiliser\\tron\\Tron\\lorann\\pictures\\TronRose.png"));
			g.drawImage(img, 320, 50, this);
			System.out.println("On met l'image en bleu");
		} catch (final IOException e) {
			e.printStackTrace();
		}

		// FAIRE UN TRUC POUR LE FAIRE CHANGER DE COULEUR

		try {
			final Image img = ImageIO
					.read(new File("D:\\Document\\Java\\Utiliser\\tron\\Tron\\lorann\\pictures\\TronBleu.png"));
			g.drawImage(img, 320, 50, this);
			System.out.println("On met l'image en rouge");
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

}
