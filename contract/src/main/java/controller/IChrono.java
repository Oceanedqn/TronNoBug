package controller;

public interface IChrono {

	public int getCompteursTemps();

	public String getStr();

	public void run();

	public int getFinalTime();

	public void setFinalTime(int finalTime);

	public boolean isEnd();

	public IChrono getChrono();

	public void setChrono(IChrono chrono);
}
