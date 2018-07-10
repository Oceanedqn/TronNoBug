package controller;

public enum Direction {

	UP(0,-20) , DOWN(0,20), LEFT(-20,0), RIGHT(20,0);
	int x, y;
	
	private Direction(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
