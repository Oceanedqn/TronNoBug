package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Block extends JPanel{

	/**
	 *
	 */
	private static final long serialVersionUID = -2010016501141655178L;



	/**
	 * Constructor
	 *
	 * @param color
	 */
	public Block(Color color) {
		this.setBackground(color);
		this.setSize(new Dimension(20, 20));
	}



}
