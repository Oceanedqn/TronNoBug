package model;

import java.util.Observable;

import controller.IElement;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class Model extends Observable implements IModel {
	private final Bike bikeJ1;
	private final Bike bikeJ2;
	
	//private final int wall[][] = new int[598][2];
	private int numberOfWall = 0;

	/**
	 * Instantiates a new model facade.
	 */
	public Model() {
	//	super();
		this.bikeJ1 = new Bike(20, 20);
		this.bikeJ2 = new Bike(580, 380);
		System.out.println("ON A DES MOTOS NOUS");
		System.out.println(bikeJ1);
		System.out.println(bikeJ2);
	}
	

	public void flush() {
		this.setChanged();
		this.notifyObservers();
	}
	
	
	public Observable getObservable() {
		return this;
	}
	
	
	//NOUVEAUUUUUUUUUUUUUUUUUUUUUUU
	public IModel getBikeJ1() {
		return (IModel) this.bikeJ1;
	}
	
	public IModel getBikeJ2() {
		return (IModel) this.bikeJ2;
	}


	@Override
	public IElement getElement(int x, int y) {
		// TODO Auto-generated method stub
		return ((IModel) this.bikeJ1).getElement(x,y);
	}






	
	
	
	
	
	
	
	
	
	

	

}
