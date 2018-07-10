package model;

public class Location implements contract.ILocation {
	/** The X position */
	private int x;
	/** The Y position */
	private int y;

	/**
	 * Instantiate the class
	 * 
	 * @param x
	 *            the X position
	 * @param y
	 *            The Y position
	 */
	public Location(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	// GETTER & SETTER //

	/**
	 * Get The Y position
	 * 
	 * @return The Y position
	 */
	@Override
	public int getY() {
		return this.y;
	}

	/**
	 * Set a new Y position
	 * 
	 * @param y
	 *            The new Y position
	 */
	@Override
	public void setY(final int y) {
		this.y = y;
	}

	/**
	 * Get the X position
	 * 
	 * @return The X position
	 */
	@Override
	public int getX() {
		return this.x;
	}

	/**
	 * Set a new X position
	 * 
	 * @param x
	 *            The new X position
	 */
	@Override
	public void setX(final int x) {
		this.x = x;
	}
}
