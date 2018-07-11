package model;

public class Bike {

	private int x;
	private int y;

	public Bike(int x, int y) {
		this.setX(x);
		this.setY(x);

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		// this.x = 11 + (19 * x)
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		// this.y = 2 + (18 * y);
		this.y = y;
	}

	public int positionX() {
		// return (x - 11) / 19;
		return x;
	}

	public int positionY() {
		// return (y - 2) / 18;
		return y;
	}

	


}
