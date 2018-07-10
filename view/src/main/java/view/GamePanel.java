package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;

import javax.swing.JPanel;

import model.IModel;

class GamePanel extends JPanel implements Observer {

	
	private int player1x;
	private int player1y;
	private int player2x;
	private int player2y;
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
		g.setColor(Color.WHITE);

		g.drawLine(600, 0, 600, 400);
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

		g.drawString("ORDER PLAYER 1", 620, 100);
		g.drawString("UP 	: Z", 625, 120);
		g.drawString("LEFT 	: Q", 625, 140);
		g.drawString("DOWN 	: S", 625, 160);
		g.drawString("RIGHT : D", 625, 180);

		g.drawString("ORDER PLAYER 2", 620, 220);
		g.drawString("UP 	: UP", 625, 240);
		g.drawString("LEFT 	: LEFT", 625, 260);
		g.drawString("DOWN 	: DOWN", 625, 280);
		g.drawString("RIGHT : RIGHT", 625, 300);
		
		g.setColor(Color.blue);
		g.fillRect(this.player1x,this.player1y,20,20);
		
		g.setColor(Color.red);
		g.fillRect(this.player2x,this.player2y,20,20);

	}

	public void update(final Observable observable, final Object o) {
		this.model = (IModel) observable;
		this.repaint();

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	public IModel getModel() {
		return this.model;
	}

	public void setModel(final IModel model) {
		this.model = model;
	}



	public void setPlayer1x(int player1x) {
		this.player1x = player1x;
	}



	public void setPlayer1y(int player1y) {
		this.player1y = player1y;
	}



	public void setPlayer2x(int player2x) {
		this.player2x = player2x;
	}



	public void setPlayer2y(int player2y) {
		this.player2y = player2y;
	}

}
