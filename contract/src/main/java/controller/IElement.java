package controller;

import contract.ILocation;

public interface IElement {

	void onCollision(IElement other);

	ILocation getLocation();

	void setLocation(ILocation location);

	void setLocation(int x, int y);

}
