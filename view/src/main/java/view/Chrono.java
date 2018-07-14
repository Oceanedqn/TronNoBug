package view;

public class Chrono implements Runnable {

	private final int PAUSE = 1000;
	private int compteurTemps;
	private String str;

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

		}

	}

}
