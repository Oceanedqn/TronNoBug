/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package model;

import java.sql.SQLException;


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

	// public int[][] getTabBlock();

	// public void setTabBlock(int tabBlock[][]);

	/**
	 * Gets the block number.
	 *
	 * @return the block number
	 */
	public int getBlockNumber();

	/**
	 * Sets the block number.
	 *
	 * @param numberBlock
	 *            the new block number
	 */
	public void setBlockNumber(int numberBlock);

	/**
	 * Gets the block number J 1.
	 *
	 * @return the block number J 1
	 */
	public int getBlockNumberJ1();

	/**
	 * Sets the block number J 1.
	 *
	 * @param numberBlockJ1
	 *            the new block number J 1
	 */
	public void setBlockNumberJ1(int numberBlockJ1);

	/**
	 * Gets the block number J 2.
	 *
	 * @return the block number J 2
	 */
	public int getBlockNumberJ2();

	/**
	 * Sets the block number J 2.
	 *
	 * @param numberBlockJ2
	 *            the new block number J 2
	 */
	public void setBlockNumberJ2(int numberBlockJ2);


	// public int getTabBlockX(int bn);

	// public int getTabBlockY(int bn);

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
