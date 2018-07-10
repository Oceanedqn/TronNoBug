package controller;

public interface IElement {

	/**
     * get the element's location on screen
     * @return
     * The location
     */
    ILocation getLocation();

    /**
     * Setter for the location
     * @param location
     * set the element's location on screen
     */
    void setLocation(ILocation location);

    /**
     * set the element's location on screen
     * @param x
     * Location x
     * @param y
     * Location y
     */
    void setLocation(int x, int y);

}
