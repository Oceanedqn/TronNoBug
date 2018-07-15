package view;

import controller.IChrono;

public class Chrono implements Runnable {

	private IChrono chrono;
	private final int PAUSE = 1000;
	private int compteurTemps;
	private int str;
	private int finalTime = 50;
	private boolean isEnd = true;

	Thread count = new Thread(this);

	public Chrono() {
		this.compteurTemps = 0;
		this.str = 0;


		count.start();
	}



	public void run() {


		while (isEnd) {
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {
			}
			this.compteurTemps++;
			this.str = this.compteurTemps;
			// System.out.println(compteurTemps + " methode run");
		}

	}

	public void stopChrono() {
		isEnd = false;
	}



	public int getCompteursTemps() {

		return compteurTemps;
	}

	public int getStr() {
		// System.out.println(str + "getstr");
		return str;
	}



	public boolean isEnd() {
		return isEnd;
	}

	public int getFinalTime() {
		return finalTime;
	}

	public void setFinalTime(int finalTime) {
		this.finalTime = finalTime;
	}

	public IChrono getChrono() {
		return chrono;
	}

	public void setChrono(IChrono chrono) {
		this.chrono = chrono;
	}

}
