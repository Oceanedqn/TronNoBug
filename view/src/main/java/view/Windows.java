package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import controller.IController;
import controller.Order;

class Windows extends JFrame implements KeyListener {

	/**
	 *
	 */
	private static final long serialVersionUID = 5540868149981434301L;
	private final int width = 900;
	private final int height = 430;
	private IController controller;
	Menuu menuu = new Menuu();

	Windows() {
		this.setTitle("Tron");
		this.setSize(this.width, this.height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.getContentPane().setBackground(Color.BLACK);
		this.setContentPane(this.menuu);
		this.setVisible(true);
		this.addKeyListener(this);
	}

	@Override
	public void repaint() {
		this.menuu.repaint();
	}

	public Menuu getMenuu() {
		return this.menuu;
	}

	/**
	 * getter of the width attribute
	 *
	 * @return Get width
	 */
	@Override
	public int getWidth() {
		return this.width;
	}

	/**
	 * geter of the width attribute
	 */
	@Override
	public int getHeight() {
		return this.height;
	}

	/**
	 * geter from the Controller class
	 *
	 * @return The controller of the frame
	 */
	public IController getController() {
		return this.controller;
	}

	/**
	 * setter from the controller class
	 *
	 * @param controller
	 *            set the controller
	 */
	public void setController(final IController controller) {
		this.controller = controller;
	}

	@Override
	public void keyPressed(final KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_Z:
			// Insutrction aller en haut
			System.out.println("Haut");
			this.controller.orderPerform(Order.UP);
			break;

		case KeyEvent.VK_Q:
			System.out.println("Gauche");
			this.controller.orderPerform(Order.LEFT);
			// Insutrction aller GAUCHE
			break;

		case KeyEvent.VK_S:
			System.out.println("Bas");
			this.controller.orderPerform(Order.DOWN);
			break;

		case KeyEvent.VK_D:
			System.out.println("Droite");
			this.controller.orderPerform(Order.RIGHT);
			break;

		case KeyEvent.VK_UP:
			System.out.println("Haut");
			this.controller.orderPerform(Order.UP);
			break;

		case KeyEvent.VK_LEFT:
			System.out.println("Gauche");
			this.controller.orderPerform(Order.LEFT);
			break;

		case KeyEvent.VK_DOWN:
			System.out.println("Bas");
			this.controller.orderPerform(Order.DOWN);
			break;

		case KeyEvent.VK_RIGHT:
			System.out.println("Droite");
			this.controller.orderPerform(Order.RIGHT);
			break;
		}
	}

	@Override
	public void keyTyped(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

}