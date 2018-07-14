package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IController;
import controller.Order;

/**
 * The Class Windows.
 */
class Windows extends JFrame implements KeyListener, IView {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5540868149981434301L;

	/** The width. */
	private final int width = 900;

	/** The height. */
	private final int height = 430;

	/** The controller. */
	private IController controller;

	/** The deja appuyer. */
	boolean alreadyUsed = false;

	/** The clock. */

	/** The menuu. */
	private MenuPanel menuu;

	/** The game. */
	private GamePanel game = new GamePanel();

	private Chrono chrono;

	// int timer = 0;

	// private Chrono chrono = new Chrono();

	// private ClockTimer clock = new ClockTimer();

	/**
	 * Instantiates a new windows.
	 */
	Windows() {
		this.setTitle("Tron");
		this.setSize(this.width, this.height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.menuu = new MenuPanel();
		this.setContentPane(this.menuu);
		this.setVisible(true);
		this.addKeyListener(this);

	}

	/*
	 * Move the bike
	 * 
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(final KeyEvent e) {
		switch (e.getKeyCode()) {

		case KeyEvent.VK_ENTER:
			this.controller.orderPerform(Order.ENTER, 3);
			if (!alreadyUsed) {
				alreadyUsed = true;

				this.setLocationRelativeTo(null);
				this.setLayout(null);
				this.game = new GamePanel();
				this.setChrono(new Chrono());
				Thread chronoEcran = new Thread(new Chrono());
				chronoEcran.start();
				this.setContentPane(this.game);
				game.update(controller.getModel());
				this.repaint();
				SwingUtilities.updateComponentTreeUI(this);
			} else {

			}

			break;

		case KeyEvent.VK_ESCAPE:
			System.exit(0);
			break;

		case KeyEvent.VK_Z:
			// System.out.println("Up");
			this.controller.orderPerform(Order.UP, 1);
			this.getGamePanel().setJ1y(controller.getModel().getBikeJ1Y());

			this.getGamePanel().repaint();
			break;
		case KeyEvent.VK_Q:
			// System.out.println("Left");
			this.controller.orderPerform(Order.LEFT, 1);
			this.getGamePanel().setJ1x(controller.getModel().getBikeJ1X());
			this.getGamePanel().repaint();
			break;
		case KeyEvent.VK_S:
			// System.out.println("Down");
			this.controller.orderPerform(Order.DOWN, 1);
			this.getGamePanel().setJ1y(controller.getModel().getBikeJ1Y());
			this.getGamePanel().repaint();
			break;
		case KeyEvent.VK_D:
			// System.out.println("Right");
			this.controller.orderPerform(Order.RIGHT, 1);
			this.getGamePanel().setJ1x(controller.getModel().getBikeJ1X());
			this.getGamePanel().repaint();
			break;
		case KeyEvent.VK_UP:
			// System.out.println("Up");
			this.controller.orderPerform(Order.UP, 2);
			this.getGamePanel().setJ2y(controller.getModel().getBikeJ2Y());
			this.getGamePanel().repaint();
			break;
		case KeyEvent.VK_LEFT:
			// System.out.println("Left");
			this.controller.orderPerform(Order.LEFT, 2);
			this.getGamePanel().setJ2x(controller.getModel().getBikeJ2X());
			this.getGamePanel().repaint();
			break;
		case KeyEvent.VK_DOWN:
			// System.out.println("Down");
			this.controller.orderPerform(Order.DOWN, 2);
			this.getGamePanel().setJ2y(controller.getModel().getBikeJ2Y());
			this.getGamePanel().repaint();
			break;
		case KeyEvent.VK_RIGHT:
			// System.out.println("Right");
			this.controller.orderPerform(Order.RIGHT, 2);
			this.getGamePanel().setJ2x(controller.getModel().getBikeJ2X());
			this.getGamePanel().repaint();
			break;
		}
	}

	/*
	 * *
	 * 
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/*
	 * 
	 * 
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/*
	 * @see view.IView#openWindows()
	 */

	/*
	 * @see view.IView#closeWindows()
	 */
	@Override
	public void closeWindows() {
		this.setVisible(false);

	}

	/*
	 * @see view.IView#position()
	 */

	public void position() {
		this.position();

	}

	/**
	 * Sets the clock.
	 */
	public void setClock() {
		// this.clock.setTimer((this.controller.Clock()));
	}

	/**
	 * Sets the time.
	 */

	/*
	 * repaint
	 * 
	 * @see java.awt.Component#repaint()
	 */
	@Override
	public void repaint() {
		this.menuu.repaint();
	}

	/**
	 * Gets the menuu.
	 *
	 * @return the menuu
	 */
	/*
	 * public MenuPanel getMenuu() { return this.menuu; }
	 */

	public MenuPanel getMenuPanel() {
		return this.menuu;
	}

	/**
	 * Gets the game panel.
	 *
	 * @return the game panel
	 */
	public GamePanel getGamePanel() {
		return this.game;
	}

	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	public IController getController() {
		return controller;
	}

	/*
	 * @see view.IView#setController(controller.IController)
	 */
	public void setController(IController controller) {
		this.controller = controller;
		// this.setController(controller);
	}

	/*
	 * @see view.IView#displayMessage(java.lang.String)
	 */
	public final void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public Chrono getChrono() {
		return (Chrono) chrono;
	}

	public void setChrono(Chrono chrono2) {
		this.chrono = chrono2;
	}

	@Override
	public int getPatate() {
		// TODO Auto-generated method stub
		return 0;
	}



}