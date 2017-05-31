package building;

import java.util.ArrayList;
import java.util.List;

public class Floor {
	int FloorNumber;
	List<Room> rooms = new ArrayList<Room>();
	
	public Floor(int floorNumber) {
		FloorNumber = floorNumber;
	}
	
	public Floor(Floor floor, int traslate, int floorNumber){
		this.FloorNumber = floorNumber;
		for(Room r: floor.getRooms()){
			this.rooms.add(new Room(r.name,r.corners.get(0).getX()+x,r.corners.get(0).getY(),
					r.corners.get(1).getX()+x,r.corners.get(0).getY(),
					r.door.get(0).getX()+x, r.door.get(0).getY()));
		}
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void addRoom(Room room) {
		this.rooms.add(room);
	}
	
	
	
	
	
	
}
