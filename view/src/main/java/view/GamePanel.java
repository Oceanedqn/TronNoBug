package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.IModel;

class GamePanel extends JPanel implements Observer {

	
	private int J1x;
	private int J1y;
	private int J2x;
	private int J2y;
	/**
	 *
	 */
	private static final long serialVersionUID = -6371690572651419043L;

	private IModel model;

	/**
	 * Constructor
	 */
	public GamePanel() {
		this.setVisible(true);
	}


	/**
	 * Draw the grid
	 *
	 * @param g
	 */

	@Override
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
		g.drawString("Timer : ", 625, 70);

		g.setColor(Color.PINK);
		g.drawString("ORDER PLAYER 1", 620, 100);
		g.setColor(Color.WHITE);
		g.drawString("UP 	: Z", 625, 120);
		g.drawString("LEFT 	: Q", 625, 140);
		g.drawString("DOWN 	: S", 625, 160);
		g.drawString("RIGHT : D", 625, 180);

		g.setColor(Color.YELLOW);
		g.drawString("ORDER PLAYER 2", 620, 220);
		g.setColor(Color.WHITE);
		g.drawString("UP 	: UP", 625, 240);
		g.drawString("LEFT 	: LEFT", 625, 260);
		g.drawString("DOWN 	: DOWN", 625, 280);
		g.drawString("RIGHT : RIGHT", 625, 300);
		

		// ############################################################################
		// ################################## Cube ####################################
		// ############################################################################
		g.setColor(Color.PINK);
		g.fillRect(this.J1x,this.J1y,20,20);
		Block blockJ1 = new Block(Color.PINK);
		blockJ1.setLocation(this.J1x, this.J1y);
		this.add(blockJ1);
		
		g.setColor(Color.YELLOW);
		g.fillRect(this.J2x,this.J2y,20,20);
		Block blockJ2 = new Block(Color.YELLOW);
		blockJ2.setLocation(this.J2x, this.J2y);
		this.add(blockJ2);

	}

	public void update(IModel observable) {
		this.model = observable;
		setJ1x(model.getBikeJ1X());
		setJ1y(model.getBikeJ1Y());
		setJ2x(model.getBikeJ2X());
		setJ2y(model.getBikeJ2Y());
		this.repaint();


	}



	public IModel getModel() {
		return this.model;
	}

	public void setModel(final IModel model) {
		this.model = model;
	}



	public void setJ1x(int J1x) {
		this.J1x = J1x;
	}



	public void setJ1y(int J1y) {
		this.J1y = J1y;
	}



	public void setJ2x(int J2x) {
		this.J2x = J2x;
	}



	public void setJ2y(int J2y) {
		this.J2y = J2y;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
