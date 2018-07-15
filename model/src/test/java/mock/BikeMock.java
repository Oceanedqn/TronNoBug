package mock;






public class BikeMock {

	
	private int x;

	/** The y. */
	private int y;

	/**
	 * Instantiates a new bike.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public BikeMock(int x, int y) {
		this.setX(x);
		this.setY(y);

	}

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Sets the x.
	 *
	 * @param x
	 *            the new x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Sets the y.
	 *
	 * @param y
	 *            the new y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Position X.
	 *
	 * @return the int
	 */
	public int positionX() {
		return x;
	}

	/**
	 * Position Y.
	 *
	 * @return the int
	 */
	public int positionY() {
		return y;
	}
}
