/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package controller;
/**
 * The Interface IChrono.
 */
public interface IChrono {

	/**
	 * Gets the compteurs temps.
	 *
	 * @return the compteurs temps
	 */
	public int getCompteursTemps();

	/**
	 * Gets the str.
	 *
	 * @return the str
	 */
	public String getStr();

	/**
	 * Run.
	 */
	public void run();

	/**
	 * Gets the final time.
	 *
	 * @return the final time
	 */
	public int getFinalTime();

	/**
	 * Sets the final time.
	 *
	 * @param finalTime
	 *            the new final time
	 */
	public void setFinalTime(int finalTime);

	/**
	 * Checks if is end.
	 *
	 * @return true, if is end
	 */
	public boolean isEnd();

	/**
	 * Gets the chrono.
	 *
	 * @return the chrono
	 */
	public IChrono getChrono();

	/**
	 * Sets the chrono.
	 *
	 * @param chrono
	 *            the new chrono
	 */
	public void setChrono(IChrono chrono);
}
