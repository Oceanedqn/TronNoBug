package model;

import controller.ILocation;

public class Element {
	
	private ILocation location;

	
	public Element(Location location) {
		this.location = location;
	}
	
	
	public Element(int x, int y) {
		this.location = new Location(x,y);
	}
	
	
	public ILocation getLocation() {
		return location;
	}
	
	
	public void setLocation(ILocation location) {
		this.location = location;
	}
	
	public void setLocation(int x, int y) {
		this.location.setX(x);
		this.location.setY(y);
	}

}
