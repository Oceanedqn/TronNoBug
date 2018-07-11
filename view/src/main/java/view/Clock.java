package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Clock extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int timer = 0;

	JLabel clock = new JLabel("Timer : " + timer);

	public Clock() {
		this.add(clock);
	}

	public void setTimer(int timer) {
		this.timer = timer;
		this.clock.setText("Timer : " + timer);
	}
}
