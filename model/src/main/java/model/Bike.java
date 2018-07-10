package model;

import contract.ILocation;
import controller.IElement;
import view.IBike;

public class Bike extends ElementsMap implements IBike {

	private int x;
	private int y;

	public Bike(final int x, final int y) {
		super(x, y);
		this.setX(this.x);
		this.setY(this.y);
	}

	public int getX() {
		return this.x;
	}

	public void setX(final int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(final int y) {
		this.y = y;
	}

	public int positionX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int positionY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void onCollision(final IElement other) {
		// TODO Auto-generated method stub

	}

	@Override
	public ILocation getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLocation(final ILocation location) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLocation(final int x, final int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}
}
