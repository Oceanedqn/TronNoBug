package controller;

public class Clock extends Thread {

	/**
	 * The number of ticks since the beginning of the game
	 */
	private int tickNumber;
	/**
	 * The interval between two ticks
	 */
	private long tickInterval;
	/**
	 * Representing if the clock is stopped or started
	 */
	private boolean stopped;
	/**
	 * The default interval between two ticks
	 */
	public static int DEFAULT_TICK_INTERVAL = 100;

	private ControllerFacade controller;

	/**
	 * Instantiates a new Clock.
	 *
	 * @param controller
	 *            clock for the controller
	 */
	public Clock(final ControllerFacade controller) {
		this.tickNumber = 0;
		this.setTickInterval(Clock.DEFAULT_TICK_INTERVAL);
		this.controller = controller;
	}

	/**
	 * Instantiates a new clock with a specified interval.
	 *
	 * @param tickInterval
	 *            the interval between two ticks.
	 */
	public Clock(final int tickInterval) {
		this.tickNumber = 0;
		this.setTickInterval(tickInterval);
		this.stopped = false;
	}

	@Override
	public void run() {
		while (true) {
			this.controller.update();
			try {
				Thread.sleep(this.tickInterval);
			} catch (final InterruptedException e) {
				System.err.println("Clock thread interrupted");
				e.printStackTrace();
			}
			this.tickNumber++;
		}
	}

	// GETTERS & SETTERS //

	/**
	 * Get the number of tick since the beginning.
	 *
	 * @return The number of ticks since the beginning.
	 */
	public int getTickNumber() {
		return this.tickNumber;
	}

	/**
	 * Get the interval between two ticks.
	 *
	 * @return The interval in miliseconds.
	 */
	public long getTickInterval() {
		return this.tickInterval;
	}

	/**
	 * Set the interval between two ticks.
	 *
	 * @param tickInterval
	 *            The new interval in milliseconds.
	 */
	public synchronized void setTickInterval(final long tickInterval) {
		this.tickInterval = tickInterval;
	}

	/**
	 * Get if the clock is stopped.
	 *
	 * @return True if the clock is stopped.
	 */
	public boolean isStopped() {
		return this.stopped;
	}

	/**
	 * Stop the clock
	 */
	public void stopClock() {
		this.stopped = true;
	}

	private void setTickInterval(final int tickInterval2) {
		// TODO Auto-generated method stub

	}
}
