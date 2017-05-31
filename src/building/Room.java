package building;

import java.util.ArrayList;
import java.util.List;

import repast.simphony.space.grid.GridPoint;

public class Room {
	List<GridPoint> corners= new ArrayList<GridPoint>(4);
	List<GridPoint> door = new ArrayList<GridPoint>(2);
	String name;
	
	public Room(String name, int x1, int y1, int x2, int y2, int d1, int d2){
		this.name = name;
		setCorners(new GridPoint(new int[]{x1,y1}),new GridPoint(new int[]{x2,y2}));
		this.setDoor(new GridPoint(new int[]{d1,d2}));
		
	}
	
	public List<GridPoint> getCorners() {
		return corners;
	}
	//allows to define the corners of the room by specifying two opposing corners (the rooms must have rectangular shape)
	private void setCorners(GridPoint corner1, GridPoint corner2) {
		this.corners.add(corner1);
		this.corners.add(corner2);
		this.corners.add(new GridPoint(new int[]{corner1.getX(),corner2.getY()}));
		this.corners.add(new GridPoint(new int[]{corner2.getX(),corner1.getY()}));
		
	}
	public List<GridPoint> getDoor() {
		return door;
	}
	
	//convention to define a door : - the door cannot be situated on a corner
	//								- doors have a fixed dimension of 2
	//								- the coordinate indicates the leftmost point or the one below
	
	private void setDoor(GridPoint coordinate) throws IllegalArgumentException{
		this.door.add(coordinate);
		for(GridPoint p:corners){
			if(p.getX()==coordinate.getX())
				this.door.add(new GridPoint(new int[]{coordinate.getX(),coordinate.getY()+2}));
			else if(p.getY()== coordinate.getY())
				this.door.add(new GridPoint(new int[]{coordinate.getX()+2,coordinate.getY()}));
			else throw new IllegalArgumentException("The point you provided isn't a valid one!");
				
		}
	} 
	
	public String getRoomName(){
		return name;
	}
}
