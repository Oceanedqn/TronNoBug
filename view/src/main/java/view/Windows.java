package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import controller.IController;
import controller.Order;

// TODO: Auto-generated Javadoc
/**
 * The Class Windows.
 */
class Windows extends JFrame implements KeyListener {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5540868149981434301L;

	/** The width. */
	private final int width = 900;
	
	/** The height. */
	private final int height = 430;
	
	/** The controller. */
	private IController controller;
	
	boolean dejaAppuyer = false;
	
	/** The menuu. */
	private MenuPanel menuu;
	private GamePanel game = new GamePanel();

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
		this.menuu.setBackground(Color.BLACK);
		
		this.setContentPane(this.menuu);
		this.setVisible(true);
		this.addKeyListener(this);
	}

	/* (non-Javadoc)
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
	/*public MenuPanel getMenuu() {
		return this.menuu;
	}*/

	
	public MenuPanel getMenuPanel() {
		return this.menuu;
	}
	
	
	public GamePanel getGamePanel() {
		return this.game;
	}
	
	// PAS BESOINS DES TAILLES
	
	
	public IController getController() {
		return controller;
	}
	
	
	
	public void setController(IController controller) {
		this.controller = controller;
	}
	
	
	public void position() {
		this.game.setPlayer1x(this.controller.getBikeJ1X());
		this.game.setPlayer1y(this.controller.getBikeJ1Y());
		this.game.setPlayer2x(this.controller.getBikeJ2X());
		this.game.setPlayer2y(this.controller.getBikeJ2Y());
	}



	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(final KeyEvent e) {
		switch (e.getKeyCode()) {
		
		case KeyEvent.VK_ENTER:
			this.controller.orderPerform(Order.ENTER, 3);
			
			if (!dejaAppuyer) {
				dejaAppuyer = true;
				this.setContentPane(this.game);
				this.repaint();
				SwingUtilities.updateComponentTreeUI(this);		
			}
			else System.out.println("deja appuyer mon pote");
			
			this.position();

				
			
			break;
			
		case KeyEvent.VK_SPACE:
			System.out.println("pause");
			this.controller.orderPerform(Order.PAUSE,  4);
			
		case KeyEvent.VK_Z:
			// Insutrction aller en haut
			System.out.println("Haut");
			this.controller.orderPerform(Order.UP, 1);
			break;

		case KeyEvent.VK_Q:
			System.out.println("Gauche");
			this.controller.orderPerform(Order.LEFT, 1);
			// Insutrction aller GAUCHE
			break;

		case KeyEvent.VK_S:
			System.out.println("Bas");
			this.controller.orderPerform(Order.DOWN, 1);
			break;

		case KeyEvent.VK_D:
			System.out.println("Droite");
			this.controller.orderPerform(Order.RIGHT, 1);
			break;

		case KeyEvent.VK_UP:
			System.out.println("Haut");
			this.controller.orderPerform(Order.UP, 2);
			break;

		case KeyEvent.VK_LEFT:
			System.out.println("Gauche");
			this.controller.orderPerform(Order.LEFT, 2);
			break;

		case KeyEvent.VK_DOWN:
			System.out.println("Bas");
			this.controller.orderPerform(Order.DOWN, 2);
			break;

		case KeyEvent.VK_RIGHT:
			System.out.println("Droite");
			this.controller.orderPerform(Order.RIGHT, 2);
			break;
		}
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(final KeyEvent e) {
		// TODO Auto-generated method stub

	}

	
	
	


}