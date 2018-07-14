package view;

import controller.IChrono;

public class Chrono implements Runnable {

	private IChrono chrono;
	private final int PAUSE = 1000;
	private int compteurTemps;
	private String str;
	private int finalTime;
	private boolean isEnd = false;

	public Chrono() {
		this.compteurTemps = 0;
		this.str = "0";

		Thread count = new Thread(this);
		count.start();
	}

	public int getCompteursTemps() {

		return compteurTemps;
	}

	public String getStr() {
		// System.out.println(str + "getstr");
		return str;
	}

	public void run() {

		while (true) {
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {
			}
			this.compteurTemps++;
			this.str = "" + this.compteurTemps;
			// System.out.println(getStr() + " methode run");
		}

	}

	public void stopChrono() {
		isEnd = false;
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
