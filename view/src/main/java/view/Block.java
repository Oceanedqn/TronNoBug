package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * The Class Block.
 */
public class Block extends JPanel {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2010016501141655178L;

	/**
	 * Constructor.
	 *
	 * @param color
	 *            the color
	 */
	public Block(Color color) {
		this.setBackground(color);
		this.setSize(new Dimension(20, 20));
	}

}
