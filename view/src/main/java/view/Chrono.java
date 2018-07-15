/*
 *  Océane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package view;

import controller.IChrono;

/**
 * The Class Chrono.
 */
public class Chrono implements Runnable {

	/** The chrono. */
	private IChrono chrono;
	
	/** The pause. */
	private final int PAUSE = 1000;
	
	/** The compteur temps. */
	private int compteurTemps;
	
	/** The str. */
	private String str;
	
	/** The final time. */
	private int finalTime = 50;
	
	/** The is end. */
	private boolean isEnd = true;

	/** The count. */
	Thread count = new Thread(this);

	/**
	 * Instantiates a new chrono.
	 */
	public Chrono() {
		this.compteurTemps = 0;
		this.str = "0";


		count.start();
	}




	/*
	 * @see java.lang.Runnable#run()
	 */
	public void run() {


		while (isEnd) {
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {
			}
			this.compteurTemps++;
			this.str = "" + this.compteurTemps;
			// System.out.println(compteurTemps + " methode run");
		}

	}

	/**
	 * Stop chrono.
	 */
	public void stopChrono() {
		isEnd = false;
	}



	/**
	 * Gets the compteurs temps.
	 *
	 * @return the compteurs temps
	 */
	public int getCompteursTemps() {

		return compteurTemps;
	}

	/**
	 * Gets the str.
	 *
	 * @return the str
	 */
	public String getStr() {
		// System.out.println(str + "getstr");
		return str;
	}



	/**
	 * Checks if is end.
	 *
	 * @return true, if is end
	 */
	public boolean isEnd() {
		return isEnd;
	}

	/**
	 * Gets the final time.
	 *
	 * @return the final time
	 */
	public int getFinalTime() {
		return finalTime;
	}

	/**
	 * Sets the final time.
	 *
	 * @param finalTime the new final time
	 */
	public void setFinalTime(int finalTime) {
		this.finalTime = finalTime;
	}

	/**
	 * Gets the chrono.
	 *
	 * @return the chrono
	 */
	public IChrono getChrono() {
		return chrono;
	}

	/**
	 * Sets the chrono.
	 *
	 * @param chrono the new chrono
	 */
	public void setChrono(IChrono chrono) {
		this.chrono = chrono;
	}

}
