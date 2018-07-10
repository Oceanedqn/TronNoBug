package model;

import controller.Direction;
import controller.IEntity;

public class Entity extends Element implements IEntity{

	public boolean moveTo(Integer x, Integer y){
        return false;
    }
    /**
     * Direction of the entity
     */
    protected Direction direction;

    /**
     * Localisation and image entity
     * @param x
     * @param y
     * @param image
     */

    public Entity(int x, int y) {
        super(x, y);
      //  this.direction = Direction.UP;
    }

    /**
     * Move the entity to a specified position
     * @param x
     * The new X position
     * @param y
     * The new Y position
     */
    public void moveTo(int x, int y){
        this.setLocation(x,y);
    }

    /**
     * Get the direction of the Entity
     * @return
     * The direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Set a new direction to the Entity
     * @param direction
     * The new direction
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}