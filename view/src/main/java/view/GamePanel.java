/*
 *  Oc�ane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.IModel;

/**
 * The Class GamePanel.
 */
class GamePanel extends JPanel implements IGamePanel {

	/** The J 1 x. */
	private int J1x;

	/** The J 1 y. */
	private int J1y;

	/** The J 2 x. */
	private int J2x;

	/** The J 2 y. */
	private int J2y;

	/** The block number J 1. */
	private String blockNumberJ1;

	/** The block number J 2. */
	private String blockNumberJ2;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6371690572651419043L;

	/** The model. */
	private IModel model;

	/** The chrono. */
	private Chrono chrono;

	private String finalTime;

	/**
	 * Constructor.
	 */
	public GamePanel() {
		// clock = new ClockTimer();

		chrono = new Chrono();

		// Thread chronoEcran = new Thread(new Chrono());
		// chronoEcran.start();

		this.setVisible(true);
	}

	/**
	 * Draw the grid.
	 *
	 * @param g
	 *            the g
	 */

	public void paintComponent(final Graphics g) {

		// ############################################################################
		// ################################## Grid ####################################
		// ############################################################################
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 400); // BACKGROUND BLACK
		g.setColor(Color.GRAY);
		g.drawLine(600, 0, 600, 400);

		// For create the grid
		final int uniteX = 600 / 30;
		final int uniteY = 400 / 20;

		for (int i = 0; i < 30; i++) {
			g.drawLine(uniteX * i, 0, uniteX * i, 400);
			g.drawLine(0, uniteY * i, 600, uniteY * i);
		}

		// ############################################################################
		// ################################## Info ####################################
		// ############################################################################
		g.setColor(Color.GRAY);
		g.fillRect(601, 0, 300, 400); // BACKGROUND GRAY
		g.setColor(Color.WHITE);
		g.drawString("PARTY INFORMATION ", 620, 50);

		g.setColor(Color.PINK);
		g.drawString("ORDER PLAYER 1", 620, 100);
		g.setColor(Color.WHITE);
		g.drawString("UP 	: Z", 625, 120);
		g.drawString("LEFT 	: Q", 625, 140);
		g.drawString("DOWN 	: S", 625, 160);
		g.drawString("RIGHT : D", 625, 180);
		g.drawString("_________", 625, 190);

		g.setColor(Color.YELLOW);
		g.drawString("ORDER PLAYER 2", 620, 240);
		g.setColor(Color.WHITE);
		g.drawString("UP 	: UP", 625, 260);
		g.drawString("LEFT 	: LEFT", 625, 280);
		g.drawString("DOWN 	: DOWN", 625, 300);
		g.drawString("RIGHT : RIGHT", 625, 320);
		g.drawString("_____________", 625, 330);

		// ############################################################################
		// ################################## Cube ####################################
		// ############################################################################
		g.setColor(Color.PINK);
		g.fillRect(this.J1x, this.J1y, 20, 20);
		Block blockJ1 = new Block(Color.PINK);
		blockJ1.setLocation(this.J1x, this.J1y);
		this.add(blockJ1);

		g.setColor(Color.YELLOW);
		g.fillRect(this.J2x, this.J2y, 20, 20);
		Block blockJ2 = new Block(Color.YELLOW);
		blockJ2.setLocation(this.J2x, this.J2y);
		this.add(blockJ2);

		// ############################################################################
		// ################################## Timer ###################################
		// ############################################################################
		// string = Integer.toString(this.chrono.getStr());
		// System.out.println(this.chrono.getStr() + "methode timer dans gamepanel");

		// Integer unInt = Integer.decode(this.chrono.getStr());

		// finalTime = unInt;
		// finalTime = this.chrono.getStr();

		// System.out.println(finalTime + " FINALTIME VARIABLE GAMEPANEL");

		g.setColor(Color.WHITE);
		g.drawString("Timer :", 625, 70);
		g.drawString(this.chrono.getStr(), 665, 70);

		// ############################################################################
		// ################################## Block ###################################
		// ############################################################################

		blockNumberJ1 = Integer.toString(this.model.getBlockNumberJ1());
		g.setColor(Color.WHITE);
		g.drawString("BLOCK : " + blockNumberJ1, 625, 210);

		blockNumberJ2 = Integer.toString(this.model.getBlockNumberJ2());

		g.setColor(Color.WHITE);
		g.drawString("BLOCK : " + blockNumberJ2, 625, 350);

	}

	public String getFinalTime() {
		return finalTime;
	}

	public void setFinalTime(String finalTime) {
		this.finalTime = finalTime;
	}

	/**
	 * Update.
	 *
	 * @param observable
	 *            the observable
	 */
	public void update(IModel observable) {
		this.model = observable;
		setJ1x(model.getBikeJ1X());
		setJ1y(model.getBikeJ1Y());
		setJ2x(model.getBikeJ2X());
		setJ2y(model.getBikeJ2Y());

		this.repaint();

	}

	/**
	 * Gets the chrono timer.
	 *
	 * @return the chrono timer
	 */
	public String getChronoTimer() {
		return this.chrono.getStr();
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IModel getModel() {
		return this.model;
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

	/**
	 * Sets the j 1 x.
	 *
	 * @param J1x
	 *            the new j 1 x
	 */
	public void setJ1x(int J1x) {
		this.J1x = J1x;
	}

	/**
	 * Sets the j 1 y.
	 *
	 * @param J1y
	 *            the new j 1 y
	 */
	public void setJ1y(int J1y) {
		this.J1y = J1y;
	}

	/**
	 * Sets the j 2 x.
	 *
	 * @param J2x
	 *            the new j 2 x
	 */
	public void setJ2x(int J2x) {
		this.J2x = J2x;
	}

	/**
	 * Sets the j 2 y.
	 *
	 * @param J2y
	 *            the new j 2 y
	 */
	public void setJ2y(int J2y) {
		this.J2y = J2y;
	}


}
