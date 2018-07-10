package model;

public class Dimention implements contract.IDimention {

	/**
	 * the width of the dimention of the game the height of the dimention of the
	 * game
	 */
	private int width;
	private int height;

	public Dimention(final int width, final int height) {
		this.width = width;
		this.height = height;
	}

	// GETTER & SETTER
	/**
	 * Get the width of the dimention
	 * 
	 * @return The width
	 */

	@Override
	public int getWidth() {
		return this.width;
	}

	/**
	 * Set the width of the dimention
	 * 
	 * @param width
	 *            The width
	 */

	@Override
	public void setWidth(final int width) {
		this.width = width;
	}

	/**
	 * Get the height of the dimention
	 * 
	 * @return The height
	 */

	@Override
	public int getHeight() {
		return this.height;
	}

	/**
	 * Set the height of the dimenntion
	 * 
	 * @param height
	 *            The height
	 */

	@Override
	public void setHeight(final int height) {
		this.height = height;
	}
}
