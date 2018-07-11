package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The Class Clock.
 */
public class Clock extends JPanel {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The timer. */
	int timer = 0;

	/** The clock. */
	JLabel clock = new JLabel("Timer : " + timer);

	/**
	 * Instantiates a new clock.
	 */
	public Clock() {
		this.add(clock);
	}

	/**
	 * Sets the timer.
	 *
	 * @param timer
	 *            the new timer
	 */
	public void setTimer(int timer) {
		this.timer = timer;
		this.clock.setText("Timer : " + timer);
	}
}
