package model;

import java.sql.SQLException;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

	public int getBikeJ1X();

	public int getBikeJ1Y();

	public int getBikeJ2X();

	public int getBikeJ2Y();

	public void setBikeJ1X(int x);

	public void setBikeJ1Y(int y);

	public void setBikeJ2X(int x);

	public void setBikeJ2Y(int y);

	int positionJ1Y();

	int positionJ1X();

	int positionJ2Y();

	int positionJ2X();

	void message(String message, int time) throws SQLException;;


}
