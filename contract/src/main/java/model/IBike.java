package model;

import controller.Direction;
import controller.IEntity;

public interface IBike extends IEntity {

	Direction getDirection();
	
	void setDirection(Direction direction);
	
	void moveTo(int x, int y);
}
