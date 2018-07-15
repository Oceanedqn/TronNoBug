package mock;

/*
 * En programmation orient�e objet, les mocks 
 * (simulacres ou mock object) sont des objets 
 * simul�s qui reproduisent le comportement d'objets 
 * r�els de mani�re contr�l�e. Un programmeur cr�e un 
 * mock dans le but de tester le comportement d'autres 
 * objets, r�els, mais li�s � un objet inaccessible ou 
 * non impl�ment�. Ce dernier est alors remplac� par un mock.
 */

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
