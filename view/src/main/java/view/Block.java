package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import model.IPlayer;

public class Block extends JPanel implements IPlayer {

	/**
	 *
	 */
	private static final long serialVersionUID = -2010016501141655178L;

	String direction;
	Boolean life = true;

	/**
	 * Constructor
	 *
	 * @param color
	 */
	public Block(final Color color) {
		this.setBackground(color);
		this.setSize(new Dimension(20, 20));
	}

	public void move(final int positionX, final int positionY, final String direction) {

	}

	public void lost() {

	}

}
