package view;



public class ClockTimer extends Thread implements Runnable {

	private final int PAUSE = 1000;
	private int countTime;
	private String str;

	public ClockTimer() {
		this.countTime = 0;
		this.str = "Time : 0";

		Thread clock = new Thread(this);
		clock.start();
		System.out.println(clock);
	}

	// GETTERS

	public int getCountTime() {
		return countTime;
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

			this.countTime++;
			this.str = "Time + " + this.countTime;
		}

	}

}