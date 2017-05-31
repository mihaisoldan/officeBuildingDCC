package building;

import java.util.ArrayList;
import java.util.List;

public class BuildingStructure {
	int numberOfFloors;
	List<Floor> floors = new ArrayList<Floor>(numberOfFloors);
	
	public BuildingStructure(int n){
		this.numberOfFloors = n;
	}

	public List<Floor> getFloors() {
		return floors;
	}

	public void addFloor(Floor floor) {
		this.floors.add(floor);
	}
}
