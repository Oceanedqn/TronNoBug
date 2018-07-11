package model;

import java.sql.SQLException;


/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

	/**
	 * Gets the bike J 1 X.
	 *
	 * @return the bike J 1 X
	 */
	public int getBikeJ1X();

	/**
	 * Gets the bike J 1 Y.
	 *
	 * @return the bike J 1 Y
	 */
	public int getBikeJ1Y();

	/**
	 * Gets the bike J 2 X.
	 *
	 * @return the bike J 2 X
	 */
	public int getBikeJ2X();

	/**
	 * Gets the bike J 2 Y.
	 *
	 * @return the bike J 2 Y
	 */
	public int getBikeJ2Y();

	/**
	 * Sets the bike J 1 X.
	 *
	 * @param x
	 *            the new bike J 1 X
	 */
	public void setBikeJ1X(int x);

	/**
	 * Sets the bike J 1 Y.
	 *
	 * @param y
	 *            the new bike J 1 Y
	 */
	public void setBikeJ1Y(int y);

	/**
	 * Sets the bike J 2 X.
	 *
	 * @param x
	 *            the new bike J 2 X
	 */
	public void setBikeJ2X(int x);

	/**
	 * Sets the bike J 2 Y.
	 *
	 * @param y
	 *            the new bike J 2 Y
	 */
	public void setBikeJ2Y(int y);

	/**
	 * Position J 1 Y.
	 *
	 * @return the int
	 */
	int positionJ1Y();

	/**
	 * Position J 1 X.
	 *
	 * @return the int
	 */
	int positionJ1X();

	/**
	 * Position J 2 Y.
	 *
	 * @return the int
	 */
	int positionJ2Y();

	/**
	 * Position J 2 X.
	 *
	 * @return the int
	 */
	int positionJ2X();

	/**
	 * Message.
	 *
	 * @param message
	 *            the message
	 * @param time
	 *            the time
	 * @throws SQLException
	 *             the SQL exception
	 */
	void message(String message, int time) throws SQLException;;

}
